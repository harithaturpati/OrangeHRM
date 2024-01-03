package com.linkTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_Homepage_headerblock_linkstesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
	    String applicationurladdress="https://www.tsrtconline.in/oprs-web/";
	    System.setProperty("webdriver.chrome.driver","./webdriverfile/chromedriver.exe");
	    driver =new ChromeDriver();
	    System.out.println("******chromedriver launched successfully********");
	  driver.get(applicationurladdress);
	  System.out.println("navigated to TSRTC application");
	By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
	 WebElement tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
	By HeaderBlock_LinksProperty =By.tagName("a");
	List<WebElement>HeaderBlock_Links=tsrtc_HeaderBlock.findElements(HeaderBlock_LinksProperty);
	int HeaderBlockLinksCount=HeaderBlock_Links.size();
	System.out.println("The number of limks in the Header block of TSRTC Application HomePage is:-"+HeaderBlockLinksCount);
	
	for(int index=0;index<HeaderBlockLinksCount;index++)
	{
		String HeaderBlockLinkName=HeaderBlock_Links.get(index).getText();
		System.out.println(index+"-"+HeaderBlockLinkName);
		HeaderBlock_Links.get(index).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		//Thread.sleep(50000);
		tsrtc_HeaderBlock =driver.findElement(tsrtc_HeaderBlockProperty);
		HeaderBlock_Links=tsrtc_HeaderBlock.findElements(HeaderBlock_LinksProperty);
		
		HeaderBlockLinksCount=HeaderBlock_Links.size();
		System.out.println("The current size of the arrayList is:-"+HeaderBlockLinksCount);
		
		
		//driver.quit();
	}
	}
}
