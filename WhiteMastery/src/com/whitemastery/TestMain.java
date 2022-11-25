//package com.whitemastery;
//
//import java.io.IOException;
//import java.time.Duration;
//import java.util.Arrays;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//
//public class TestMain {
//
//	public static void main(String[] args) throws InterruptedException, IOException {
//
//		AddCategory add = new AddCategory();
////		add.categoryAdding();
//
//		CategoryVisibilityCheck ac = new CategoryVisibilityCheck();
////		ac.visibility();
//
//		RemovingCategory rc = new RemovingCategory();
////		rc.remove();
//
//		CategoryEditCheck cec = new CategoryEditCheck();
////		cec.edit();
//
//		DBAccess dbc = new DBAccess();
////		dbc.db();
//
//		LoginPage lp = new LoginPage();
////		lp.LoginValidation();
//
//		CompanyDetails cd = new CompanyDetails();
////		cd.companyDetails();
//
//		TablePlan tp = new TablePlan();
////		tp.creatingTableArea();
//
////		DeletingCategory dc = new DeletingCategory();
////		dc.deleteCategory();
//
////		Grid g = new Grid();
////		g.grid1();
//
////		RemoveCategories rcc = new RemoveCategories();
//		// rcc.remove();
//
////		OrderingFood ordf = new OrderingFood();
//
////		ordf.order();
//
////		OrderRepeat orderRepeat = new OrderRepeat();
////		orderRepeat.orderRep();
//
//		DinamicV3_Multi_Ordering_Test multi = new DinamicV3_Multi_Ordering_Test();
////		multi.orderRep();
//
//		String url = "https://dev.whitemastery.com/dinamic/";
//		
//		String email = "admin@urubrewpark.com";
//		
//		String password = "Double@dinamic12";
//		
//		String pin[] = { "7", "7", "2", "2" };
//		
//		String mobNumber[] = { "9444409275", "9865868951", "8939215828","1234567890", "9113056985", "9865007918","1234567690","6234567890","1236567890","6634567890","16664567890","126664567890","1234567690","123466667890","12664567890"
//				,"164567896","1244567890","1434567890","4234567890","1244567890","14345767890","1734567890","1274567890","1237567890","1234767890","1234577890","1234568890"
//				,"1234567790","1234567870","1234567897","1234567894","1234567893","1234567892","1234567891","1234567896","1234567897","1234567899","12345678909"
//				,"12345672890","12345678930","12345678940","12345678950","12345678790","12345676890","12345678990","12345678990"
//				,"12345673890","1234563437890","12345674342890","123456743434890","12343434567890","1234567434890","123456734890"
//				,"12345678390","123456789220","123456784390","1233434567890","1234343567890","1234534467890"
//				,"12345678960"
//				,"12345678920","123456789540","123244567890","1243334567890"
//				,"12345678920","12345678960","1234567890"
//				,"12345678901","1234567894530","1234567890","143234567890"
//				,"1234567890","12345678219340","123456789320","123454367890","1234567890"
//				,"123456789130","1234425678343390","125434567890","123534567890","1253534567890"
//				,"123456789420","142234567890","123456t6457890","1234567824390"
//				,"1234567894320","12345678940","12344444567890","1234544467890"
//				,"12366454567890","1234567555890","123444567890","12344567890","123444567890"};
//
//		String customerList[] = {
//				"Tipu"
//				, "Banu"
//				,"Sumaya"
//				, "Vineet"
//				, "Rian"
//				, "Ashwant"
//				, "Aaron"
//				, "Abdul"
//				, "Abe"
//				, "Abel"
//				, "Abraham"
//				, "Abram"
//				, "Adalberto"
//				, "Adam"
//				, "Adan"
//				, "Adolfo"
//				, "Adolph"
//				, "Adrian"
//				, "Agustin"
//				, "Ahmad"
//				, "Ahmed"
//				, "Al"
//				, "Alan"
//				, "Albert"
//				, "Alberto"
//				, "Alden"
//				, "Aldo"
//				, "Alec"
//				, "Alejandro"
//				, "Alex"
//				, "Alexander"
//				, "Alexis"
//				, "Alfonso"
//				, "Alfonzo"
//				, "Alfred"
//				, "Alfredo"
//				, "Ali"
//				, "Allan"
//				, "Allen"
//				, "Alonso"
//				, "Alonzo"
//				, "Alphonse"
//				, "Alphonso"
//				, "Alton"
//				, "Alva"
//				, "Alvaro"
//				, "Alvin"
//				, "Amado"
//				, "Ambrose"
//				, "Amos"
//				, "Anderson"
//				, "Andre"
//				, "Andrea"
//				, "Andreas"
//				, "Andres"
//				, "Andrew"
//				, "Andy"
//				, "Angel"
//				, "Angelo"
//				, "Anibal"
//				, "Anthony"
//				, "Antione"
//				, "Antoine"
//				, "Anton"
//				, "Antone"
//				, "Antonia"
//				, "Antonio"
//				, "Antony"
//				, "Antwan"
//				, "Archie"
//				, "Arden"
//				, "Ariel"
//				, "Arlen"
//				, "Arlie"
//				, "Armand"
//				, "Armando"
//				, "Arnold"
//				, "Arnoldo"
//				, "Arnulfo"
//				, "Aron"
//				, "Arron"
//				, "Art"
//				, "Arthur"
//				, "Arturo"
//				, "Asa"
//				, "Ashley"
//				, "Aubrey"
//				, "August"
//				, "Augustine"
//				, "Augustus"
//				, "Aurelio"
//				, "Austin"
//				, "Avery"
//				};
//		
//		
//
//		List<String> customers = Arrays.asList(customerList);
//
//		List<String> pins = Arrays.asList(pin);
//
//		List<String> numbers = Arrays.asList(mobNumber);
//		
//		int t = mobNumber.length;
//
//		System.out.println("Length : "+t);
//		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\white\\Downloads\\chromedriver_win32\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://web.dinamic.io");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//	
//
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get(url);
//
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
//		
//		// Action object
//		
//		Actions action = new Actions(driver);
//
//		
//		// Email And Password
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
//		WebElement user = driver.findElement(By.id("email"));
//		action.moveToElement(user).click().build().perform();
//		user.sendKeys(email);
//
//		driver.findElement(By.id("password")).sendKeys(password);
//
//		driver.findElement(By.xpath("//div[@class='pos-rel']")).click();
//
//		driver.findElement(By.xpath("//span[normalize-space()='OMS']")).click();
//
//		List<WebElement> element = driver.findElements(By.xpath("//button[@class='pin-button']"));
//
//		System.out.println(element);
//
//		for (int i = 0; i < pins.size(); i++) {
//
//			Thread.sleep(1000);
//
//			for (int j = 0; j < element.size(); j++) {
//				if (element.get(j).getText().contains(pins.get(i))) {
//					System.out.println("Pin Entered : " + element.get(j).getText());
//					element.get(j).click();
//					
//				}
//			}
//		}Thread.sleep(2000);
//
//		for (int j = 0; j < 16; j++) {
//
//			driver.navigate().refresh();
//			
//			//Park Floor
//			
////			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='/orders/table-list/632eb74c555c202c67477459']")));
////			driver.findElement(By.xpath("//a[@id='/orders/table-list/632eb74c555c202c67477459']")).click();
//
//			try {
//				wait.until(ExpectedConditions
//						.visibilityOfElementLocated(By.xpath("//button[normalize-space(text()) = 'start']")));
//				List<WebElement> start = driver.findElements(By.xpath("//button[normalize-space(text()) = 'start']"));
//				
//				//for only order change the j value to 0
//				
//				start.get(0).click();
//			}catch(Exception e) {
//				wait.until(ExpectedConditions
//						.visibilityOfElementLocated(By.xpath("//button[normalize-space(text()) = 'start']")));
//				List<WebElement> start = driver.findElements(By.xpath("//button[normalize-space(text()) = 'start']"));
//				
//				//for only order change the j value to 0
//				
//				start.get(0).click();
//			}
//
//			WebElement mobNumberText = driver.findElement(By.id("contact_number"));
//			mobNumberText.click();
//			mobNumberText.sendKeys(numbers.get(j));
//			WebElement nameField = driver.findElement(By.id("name"));
//			nameField.click();
//			nameField.sendKeys(customers.get(j));
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='people_count'])[3]")));
//			WebElement peopleCount = driver.findElement(By.xpath("(//input[@id='people_count'])[3]"));
//			action.click(peopleCount).build().perform();
//			peopleCount.sendKeys("4");
//
//			driver.findElement(By.xpath("//span[normalize-space()='START']")).click();
//
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div [@class='col-xl-4 col-lg-6 col-md-6 col-sm-6 col-6 pd-5-l pd-5-r pd-5-t mob-last-card ng-star-inserted']")));
//			List<WebElement> dishes = driver.findElements(By.xpath(
//					"//div [@class='col-xl-4 col-lg-6 col-md-6 col-sm-6 col-6 pd-5-l pd-5-r pd-5-t mob-last-card ng-star-inserted']"));
//
//			int dishCount =6;
//
//			for (int i = 0; i < dishCount; i++) {
//				try {
//
//					dishes.get(i).click();
//
//				} catch (Exception e) {
//
//
//					for (int h = 0; h < 6; h++) {
//
//						List<WebElement> dishes1 = driver.findElements(By.xpath(
//								"//div [@class='col-xl-4 col-lg-6 col-md-6 col-sm-6 col-6 pd-5-l pd-5-r pd-5-t mob-last-card ng-star-inserted']"));
//
//						action.click(dishes1.get(i)).build().perform();
//					}
//
//				}
//
//			}
//
//			driver.findElement(
//					By.xpath("//button[@type='button']//span[@class='ng-star-inserted'][normalize-space()='Confirm']"))
//					.click();
//
//	
//			
//			
//			driver.navigate().back();
//
//		}
//
//		driver.quit();
//
//	}
//
//}