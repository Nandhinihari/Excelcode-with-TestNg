package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base1 {
	public static WebDriver driver;
	public static WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver","C:\\oxygen new\\Sample2\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	return driver;
	}
	public static void loadURL(String url) {
		driver.get(url);
		
	}
	public static void maximize() {
driver.manage().window().maximize();
	}
	public static void type(WebElement element,String name) {
element.sendKeys(name);

	}
	public static void btn(WebElement element) {
element.click();
	}
	public static void quitBrowse() {
	driver.quit();
	}
	
	public static void dropDown(WebElement element,String name) {
new Select(element).selectByVisibleText(name);
	}
	public static void dropDown2(WebElement element,String name) {
new Select(element).selectByValue(name);
	}
	
	public static void attriBute(WebElement element) {
   String f=  element.getAttribute("value");
     System.out.println(f);
	}
	

}
