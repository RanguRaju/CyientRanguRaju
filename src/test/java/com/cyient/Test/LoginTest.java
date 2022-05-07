package com.cyient.Test;

import org.testng.annotations.Test;

import com.cyient.GenericUtils.DriverUtils;
import com.cyient.POM.Login_Page;

public class LoginTest extends BaseTest {
	@Test
	public void VerifyLoginFunctionality() throws InterruptedException
	{
		Login_Page ref=new Login_Page();
		DriverUtils.getDriver().get("http://demowebshop.tricentis.com/");
		ref.register1();
		Thread.sleep(1000);
		ref.male1();
		Thread.sleep(1000);
		ref.name1("Raju");
		Thread.sleep(1000);
		ref.last1("Rangu");
		Thread.sleep(1000);
		ref.email1("raju.rangu@cyient.com");
		Thread.sleep(1000);
		ref.pword("12345678");
		Thread.sleep(1000);
		ref.cpword("12345678");
		Thread.sleep(1000);
		ref.rbtn();
		Thread.sleep(1000);
		ref.login();
		ref.email11("raju.rangu@cyient.com");
		ref.pword11("12345678");
		Thread.sleep(1000);
		ref.login111();
		Thread.sleep(2000);
		ref.logout();
		Thread.sleep(1000);
		
		
		
	}

}
