package com.whitemastery;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class OrderingFood {

	String url = "https://web.dinamic.io/";
	String email = "prasannablock@blrbrewing.com";
	String password = "BLRbrewing@dinamic2";
	String pin[] = { "2", "5", "7", "4" };
	String mobNumber = "9444409275";
	String name = "Mohamed Lahir";
	String foodItems[] = { "Diet Meal", "Bhatti Da Murgh Tikka", "Malaidar Dal Makhani", "Kingfisher Premium" };

	List<String> items = Arrays.asList(foodItems);

	List<String> pins = Arrays.asList(pin);

	public void order() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://pos.dinamic.io");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Action object

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		// Email and Password entering

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(120))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		Actions action = new Actions(driver);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

		WebElement user = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		action.moveToElement(user).click().build().perform();
		user.sendKeys(email);

		driver.findElement(By.id("password")).sendKeys(password);

		driver.findElement(By.xpath("//div[@class='pos-rel']")).click();

		// Entering into OMS

		driver.findElement(By.xpath("//span[normalize-space()='OMS']")).click();

		List<WebElement> element = driver.findElements(By.xpath("//button[@class='pin-button']"));

		for (int i = 0; i < pins.size(); i++) {

			for (int j = 0; j < element.size(); j++) {
				if (element.get(j).getText().contains(pins.get(i))) {

					element.get(j).click();
				}
			}
		}

		List<WebElement> start = driver.findElements(By.xpath("//button[@class='btn btn-view btn-card start-btn']"));
		start.get(0).click();
		for (int h = 0; h < start.size(); h++) {
//	driver.findElement(By.id("contact_number")).click();
//	driver.findElement(By.id("contact_number")).sendKeys(mobNumber);
//	driver.findElement(By.id("name")).click();
//	driver.findElement(By.id("name")).sendKeys(name);
			WebElement people = driver
					.findElement(By.xpath("//div[@id='customer_details_popup']//input[@id='people_count']"));
			people.click();
			people.sendKeys("4");
			WebElement start1 = driver.findElement(By.xpath(
					"//button[@class=\"col-md-3 btn btn-blue d-flex align-items-center justify-content-center\"]"));
			start1.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'ALL')]")));
			Thread.sleep(2000);
			// driver.navigate().refresh();
			driver.findElement(By.xpath("//div[contains(text(),'ALL')]")).click();
			List<WebElement> meals = driver.findElements(By.xpath("//p[@class='text-limit mb-0']"));
			for (int loop = 0; loop < items.size(); loop++) {

				for (int ij = 0; ij < meals.size(); ij++) {

					if (meals.get(ij).getText().contains(items.get(loop))) {
						Thread.sleep(2000);
						meals.get(ij).click();
					}
				}
				driver.findElement(By.xpath("//button[@type='button']//span[contains(text(),'Confirm')]")).click();
			}
		}
	}
}