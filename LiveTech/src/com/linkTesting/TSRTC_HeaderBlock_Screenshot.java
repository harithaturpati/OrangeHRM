package com.linkTesting;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBlock_Screenshot {

	public static void main(String[] args) throws IOException {
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
	 String  expected_LinksUrladdress=HeaderBlock_Links.get(index).getAttribute("href");
	  System.out.println("The expected Url address of the link is:-"+expected_LinksUrladdress);
	  HeaderBlock_Links.get(index).click();
	  
	 String actual_WebpageTitle =driver.getTitle();
	 String actual_WebpageCurrentUrlAddress =driver.getCurrentUrl();
	 
	 System.out.println("The actual CurrentUrl address of the current webpage is:-"+actual_WebpageCurrentUrlAddress) ;
	 if(actual_WebpageCurrentUrlAddress.equals(expected_LinksUrladdress))
	 {
		 System.out.println("successfully navigated to expected links webpage -PASS");
	 }
		 
	 else
	 {
		 System.out.println("failed to navigated  expected links webpage-FAIL");
	 }
	 
	 File WebpageScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(WebpageScreenshot,new File("./Screenshots/"+index+".png"));
		FileUtils.copyFile(WebpageScreenshot,new File("./Screenshots/"+HeaderBlockLinkName+".png"));
	System.out.println();
	driver.navigate().back();
	tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
	HeaderBlock_Links =tsrtc_HeaderBlock.findElements(HeaderBlock_LinksProperty);
	HeaderBlockLinksCount=HeaderBlock_Links.size();
	System.out.println("The current size of the arraylist is :-"+HeaderBlockLinksCount);
		}
		driver.quit();
	}

}
