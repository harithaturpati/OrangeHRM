package com.DynamicWebTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class BaseTest {
	
	WebDriver driver;
String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
//Automation chrome Browser
@BeforeTest
public  void applicationLaunch()
{
System.setProperty("webdriver.chrome.driver", "./webdriverfile/chromedriver.exe");
driver=new ChromeDriver();
System.out.println("******Chromedriver Browser Launched*******");
driver.get(applicationUrlAddress);
System.out.println("Navigated to Time and Date Application ");
driver.manage().window().maximize();
}

@AfterTest
public void applicationclose()
{
driver.quit();
System.out.println("*****Application closed successfully*****");
}

public static void main(String[]args)
    {
	BaseTest  BaseTest1=new BaseTest();
	BaseTest1.applicationLaunch();
	BaseTest1.applicationclose();
    }
}
