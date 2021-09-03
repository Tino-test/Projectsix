package org.testjava;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpojo extends LibGlobal {

//	default constructor
	public Loginpojo() {
		PageFactory.initElements(driver, this);
	}
	
	//Find and declare WebElements as private
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement login;
	
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPassword() {
		return password;
	}
	public WebElement getlogin() {
		return login;
	}
}
