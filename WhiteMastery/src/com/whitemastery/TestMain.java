package com.whitemastery;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class TestMain {

	public static void main(String[] args) throws InterruptedException, IOException {

		AddCategory add = new AddCategory();
//		add.categoryAdding();

		CategoryVisibilityCheck ac = new CategoryVisibilityCheck();
//		ac.visibility();

		RemovingCategory rc = new RemovingCategory();
//		rc.remove();

		CategoryEditCheck cec = new CategoryEditCheck();
//		cec.edit();

		DBAccess dbc = new DBAccess();
//		dbc.db();

		LoginPage lp = new LoginPage();
//		lp.LoginValidation();

		CompanyDetails cd = new CompanyDetails();
//		cd.companyDetails();

		TablePlan tp = new TablePlan();
//		tp.creatingTableArea();

//		DeletingCategory dc = new DeletingCategory();
//		dc.deleteCategory();

//		Grid g = new Grid();
//		g.grid1();

		RemoveCategories rcc = new RemoveCategories();
		// rcc.remove();

		OrderingFood ordf = new OrderingFood();

//		ordf.order();

//		OrderRepeat orderRepeat = new OrderRepeat();
//		orderRepeat.orderRep();

		String url = "https://web.dinamic.io/";
		String email = "prasannablock@blrbrewing.com";
		String password = "BLRbrewing@dinamic2";
		String pin[] = { "2", "5", "7", "4" };
		String mobNumber = "9444409275";
		String name = "Mohamed Lahir";
		String foodItems[] = { "Diet Meal", "Bhatti Da Murgh Tikka", "Malaidar Dal Makhani", "Kingfisher Premium" };

		List<String> items = Arrays.asList(foodItems);

		List<String> pins = Arrays.asList(pin);

//			System.setProperty("webdriver.chrome.driver",
//					"D:\\Driver\\Updated chrome driver\\chromedriver_win32\\chromedriver.exe");

//			WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "D:\\Driver\\gecko driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://web.dinamic.io");
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

		for(int iteration=0;iteration<6;iteration++) {
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-view btn-card start-btn']")));
		List<WebElement> start = driver.findElements(By.xpath("//button[@class='btn btn-view btn-card start-btn']"));
		start.get(0).click();
		WebElement people = driver
				.findElement(By.xpath("//div[@id='customer_details_popup']//input[@id='people_count']"));
		people.click();
		people.sendKeys("4");
		WebElement start1 = driver.findElement(By
				.xpath("//button[@class=\"col-md-3 btn btn-blue d-flex align-items-center justify-content-center\"]"));
		start1.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='oms-container-category__list__content__body__card'] //div[@class='oms-container-category__list__content__body__card__list text-limit']")));
		driver.findElement(By.xpath("//div[contains(text(),'ALL')]")).click();
		List<WebElement> categories = driver.findElements(By.xpath(
				"//div[@class='oms-container-category__list__content__body__card'] //div[@class='oms-container-category__list__content__body__card__list text-limit']"));
		for (int k = 0; k < 9; k++) {
			System.out.println("Category Name : " + categories.get(k).getText());
//			categories.get(k).click();
			Thread.sleep(3000);
			categories.get(k).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//div[@class='col-xl-4 col-lg-6 col-md-6 col-sm-6 col-6 pd-5-l pd-5-r pd-5-t mob-last-card']")));
			List<WebElement> categoryItem = driver.findElements(By.xpath(
					"//div[@class='col-xl-4 col-lg-6 col-md-6 col-sm-6 col-6 pd-5-l pd-5-r pd-5-t mob-last-card']"));
			for (int l = 0; l < 1; l++) {
				categoryItem.get(0).click();
				List<WebElement> itemNames =driver.findElements(By.xpath("//p[@class='text-limit mb-0']"));
			System.out.println("Items Ordered : " +itemNames.get(0).getText());
			
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@type='button']//span[contains(text(),'Confirm')]")));
				WebElement confirmButton = driver
						.findElement(By.xpath("//button[@type='button']//span[contains(text(),'Confirm')]"));
			wait.until(ExpectedConditions.elementToBeClickable(confirmButton));
				action.click(confirmButton).build().perform();
//				System.out.println(categoryItem.get(0).getText());
			}
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[normalize-space()='arrow_back']")).click();
		}
	     driver.quit();

	}
}
