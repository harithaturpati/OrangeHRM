package com.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMailRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
	    String	applicationUrlAddress="https://register.rediff.com/register/register.php?FormName=user_details";
		System.setProperty("webdriver.chrome.driver", "./webdriverfile/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();//name4020
		//<input type="text" onblur="fieldTrack(this);" //name="nameeacf7621"
		//name="nameacd96172" value="" style="width:185px;" maxlength="61">
         //   By	fullNameproperty=By.name("name04488657");
		//name="name04488657"
	By	fullNameproperty=By.xpath("//*[starts-with@name,'name')]");
        WebElement  fullName=driver.findElement(fullNameproperty);
        fullName.sendKeys("Haritha"); 
   
	}

}