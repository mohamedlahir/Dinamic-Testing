package com.whitemastery;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid {
	
	static WebDriver driver;
	static String nodeUrl;
	
	public void grid1() throws MalformedURLException {
		nodeUrl ="http://172.16.1.86:5555/wd/hub";
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
		driver.manage().window().maximize();
		driver.get("www.google.co.in");
		driver.quit();
	}

}
