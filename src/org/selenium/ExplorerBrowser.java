package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ExplorerBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\USER\\eclipse-workspace\\SeleniumTest\\Driver1\\IEDriverServer.exe");
		
		WebDriver driver1 = new InternetExplorerDriver();
		
		driver1.get("https://www.google.com/gmail/");

	}

}
