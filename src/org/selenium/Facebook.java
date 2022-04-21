package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\eclipse-workspace\\SeleniumTest\\driver2\\geckodriver.exe");

		WebDriver driver2 = new FirefoxDriver();
		
		driver2.get("https://www.youtube.com/");

	}

}
