package com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_yourwishlist_click {

	public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress="http:Amazon.in";
		//Automation chrome Browser
		System.setProperty("webdriver.chrome.driver","webdriverfile/chromedriver.exe");
		driver=new ChromeDriver();
		//navigating to OrageHRM application url address
		driver.get(applicationUrlAddress);
		System.out.println("Navigated to Amazon successfully");
      
	}
	
}
