package com.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Bing_Homepage_screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String applicationUrlAddress="https://www.bing.com";
		//Automation chrome Browser
		System.setProperty("webdriver.chrome.driver", "./webdriverfile/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("*****chorme Browser launched successfully******");
		driver.get(applicationUrlAddress);
		System.out.println("Navigated to Bing Homepage");
		
		File bingScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bingScreenshot,new File("./Screenshots/bingHomePage.png"));
		driver.close();
		

	}

}
