package com.cyient.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends BasePage {

	//intilize
	@FindBy(xpath="//a[@class='ico-register']")
	private WebElement register;
	
	@FindBy(id="gender-male")
	private WebElement male;
	@FindBy(id="FirstName")
	private WebElement name;
	@FindBy(id="LastName")
	private WebElement last;
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(id="Password")
	private WebElement pword;
	@FindBy(id="ConfirmPassword")
	private WebElement cpword;
	@FindBy(id="register-button")
	private WebElement rbtn;
	@FindBy(xpath="//a[@class='ico-login']")
	private WebElement login;
	@FindBy(id="Email")
	private WebElement email11;
	@FindBy(id="Password")
	private WebElement pword11;
	@FindBy(xpath="//input[@class='button-1 login-button']")
	private WebElement login111;
	@FindBy(xpath="//a[@class='ico-logout']")
	private WebElement logout;
	
	
	
	//declare
	public void register1() {
		register.click();
	}
	public void male1() {
		male.click();
	}
	public void name1(String rrr) {
		name.sendKeys(rrr);
	}
	public void last1(String rrr1) {
		last.sendKeys(rrr1);
	}
	public void email1(String rrr2) {
		email.sendKeys(rrr2);
	}
	public void pword(String rrr3) {
		pword.sendKeys(rrr3);
	}
	public void cpword(String rr4) {
		cpword.sendKeys(rr4);
	}
	public void rbtn() {
		rbtn.click();
	}
	public void login() {
		login.click();
	}
	public void email11(String rr) {
		email11.sendKeys(rr);
	}
	public void pword11(String r) {
		pword11.sendKeys(r);
	}
	public void login111() {
		login111.click();
	}
	public void logout() {
		logout.click();	
	}
	

}
