package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_CustomerService_Click {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		WebDriver driver;
	    String	applicationUrlAddress="http://Amazon.in";
		System.setProperty("webdriver.chrome.driver", "./webdriverfile/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		
		//tagname[contains(text().'partialtextvalue")]
		//<a href="/gp/help/customer/display.html?nodeId=200507590&amp;ref_=nav_cs_help" 
		//class="nav-a  " tabindex="0" data-csa-c-type="link"
		//data-csa-c-slot-id="nav_cs_6" data-csa-c-content-id="nav_cs_help" 
		//data-csa-c-id="bnq2pm-xoymx6-9ldrtp-v8pl7u">Customer Service</a>
         By   customerserviceproperty=By.xpath("//a[contains(text(),'Service')]");
		WebElement customerservice=driver.findElement(customerserviceproperty);
		customerservice.click();
		
		
		
	}

}
