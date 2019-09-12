package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base2 {
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
	public static String getData(int rowNo,int cellNo) throws IOException {
		File loc=new File("C:\\oxygen new\\Sampleeee\\xl\\Book1.xlsx");
		FileInputStream f=new FileInputStream(loc);
		Workbook w=new XSSFworkbook(f);
		Sheet s=w.getSheet("nan");
		Row r=s.getRow(rowNo);
		Cell c=r.getCell(cellNo);
		int type=c.getCellType();
		
		
		
		
		
	}
	

}
