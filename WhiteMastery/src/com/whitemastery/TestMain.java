package com.whitemastery;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class TestMain {

	public static void main(String[] args) throws InterruptedException, IOException {

		AddCategory add = new AddCategory();
		add.categoryAdding();

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
	//	rcc.remove();

	}

		
	
}
