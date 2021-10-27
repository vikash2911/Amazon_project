package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static Actions action;
	
	public static Robot robot;
	
	public static Alert alert;
	
	public static JavascriptExecutor js;
	
	public static TakesScreenshot ts;
	
	
	public void launchBrower() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
	}
	
	public void loadUrl(String name) {
		driver.get(name);

	}
	
	public void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	
	public void fill(WebElement e, String name) {
		
		e.sendKeys(name);

	}
	
	public void moveTo(WebElement e) {
		action = new Actions(driver);
		
		action.moveToElement(e).perform();

	}
	
	public void button(WebElement cl) {
		cl.click();

	}
	
	public void attribute(WebElement at, String name) {
		String attributes = at.getAttribute(name);
		
		System.out.println(attributes);
	
	
	}
	public void dragAnd(WebElement e, WebElement r) {
		
		
		action.dragAndDrop(e, r).perform();

	}
	
	public void ddClick(WebElement e) {
		
		
		action.doubleClick(e).perform();

	}
	
	public void conClick(WebElement e) {
		
		
		action.contextClick(e).perform();

	}
	
	public void pressKey(int keycode) throws AWTException {
		
		robot = new Robot();
		
		robot.keyPress(keycode);
		

	}
	public void releaseKey(int keycode) throws AWTException {
		
		
		robot.keyRelease(keycode);
		

	}
	public void maxi() {
		driver.manage().window().maximize();

	}
	
	public void exit() {
		driver.quit();
	}
	
	public void downKey(WebElement txt, CharSequence key) {
		action.keyDown(txt, key);

	}
	public void upKey(WebElement txt, CharSequence key) {
		action.keyDown(txt, key);

	}
	
	public void acceptAlert() {
		alert = driver.switchTo().alert();
		
		alert.accept();

	}
	
	public void dismissAlert() {
		alert.dismiss();

	}
	public void Alert() {
		alert.dismiss();

	}
	public void promptAlert(String name) {
		alert.sendKeys(name);
		alert.accept();
	}
	
	public void prompt2Alert(String name) {
		alert.sendKeys(name);
		alert.dismiss();
	}
	
	
	public void executeValue(String name, WebElement element) {
		js = (JavascriptExecutor) driver;
		
		js.executeScript("aruguments[0].setAttribute('value'," +name+")", element);

	}
	
	public void screenShot(String na) throws IOException {
		
		ts = (TakesScreenshot) driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		File sas = new File("C:\\Users\\raj\\eclipse-workspace\\Frame\\screen"+na+".png");
		
		FileUtils.copyFile(screenshotAs, sas);
		
			

	}
	
	public void scrolldown(WebElement ele) {
		js.executeScript("arguments[0].scrollIntoView(true)", ele);

	}
	
	
	public void frameswitch(WebElement ele) {
		driver.switchTo().frame(ele);

	}
	
	
	
	
	
	
	}
	
