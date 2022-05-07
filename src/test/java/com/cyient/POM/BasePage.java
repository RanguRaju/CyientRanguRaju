package com.cyient.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
WebDriver driver;
	public BasePage()
	{
		driver=com.cyient.GenericUtils.DriverUtils.getDriver();
		PageFactory.initElements(driver,this);

}
}