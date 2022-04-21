package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GreensTechnology {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\eclipse-workspace\\SeleniumTest\\driver2\\geckodriver.exe");
		
		WebDriver driver2 = new FirefoxDriver();
		
		driver2.get("http://www.greenstechnologys.com/");
		driver2.get("https://www.facebook.com/");
		driver2.get("https://www.amazon.in");
		driver2.get("http://greenstech.in/selenium-course-content.html");
		
		driver2.quit();
	}

}
