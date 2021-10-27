package org.sample;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass{
	
	
	 public Pojo() {
		PageFactory.initElements(driver, this);
	}
	 @FindBy(id = "email")
	 
	 private WebElement user;
	 
	 @FindBy(id="pass")
	 
	 private WebElement pass;
	 
	 @FindBy(name="login")
	 
	 private WebElement click;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getClick() {
		return click;
	}
}
