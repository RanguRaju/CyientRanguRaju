package com.cyient.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cyient.GenericUtils.DriverUtils;

public class BaseTest {
	WebDriver driver;
	@BeforeMethod
	
	public void setUp() throws FileNotFoundException, IOException
	{
		DriverUtils.createDriver();
}
	@AfterMethod
	public void Close()
	{
		driver.quit();
	}
}
