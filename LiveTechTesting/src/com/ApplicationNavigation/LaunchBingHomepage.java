package com.ApplicationNavigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBingHomepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver;
		String applicationUrlAddress="https://github.com/features/actions";
		//System.setProperty("webdriver.chrome.driver","./browserDriverfiles/chromedriver.exe ");
	   // ChromeDriver cd=new ChromeDriver();
	 System.setProperty("webdriver.gecko.driver","./browserDiverFiles/geckodriver.exe");
	 ChromeDriver cd=new ChromeDriver(); 
	  // driver.get(applicationUrlAddress);
	   
	}

}
