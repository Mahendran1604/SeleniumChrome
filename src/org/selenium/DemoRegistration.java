package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoRegistration {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.ie.driver", "C:\\Users\\USER\\eclipse-workspace\\SeleniumTest\\Driver1\\IEDriverServer.exe");
			
			WebDriver driver1 = new InternetExplorerDriver();
			
			driver1.get("http://www.greenstechnologys.com/");
			driver1.get("http://demo.automationtesting.in/Register.html");
			driver1.get("http://www.greenstechnologys.com/");
			driver1.get("http://greenstech.in/selenium-course-content.html");
			
			driver1.quit();

	}

}
