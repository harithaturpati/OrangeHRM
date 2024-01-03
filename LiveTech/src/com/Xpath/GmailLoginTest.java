package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginTest {

	public static void main(String[] args) {
	
		// TODO Auto-generated method s
		WebDriver driver;
	    String	applicationUrlAddress="http://gmail.com";
		System.setProperty("webdriver.chrome.driver", "./webdriverfile/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		//name="identifier"
		 By emailproperty=By.xpath("//*[@name='identifier']");
		 
		WebElement email=driver.findElement(emailproperty);
		email.sendKeys("harithaturpati59@gmail.com");
		//<span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span>
	//<div class="VfPpkd-RLmnJb"></div>	
	By	NextButtonproperty=By.xpath("//span[text()='Next']");
		WebElement NextButton=driver.findElement(NextButtonproperty);
		NextButton.click();
		
	}

}
