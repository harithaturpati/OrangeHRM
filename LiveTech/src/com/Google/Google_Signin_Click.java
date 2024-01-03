package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Signin_Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//webdriver-is an interface of selenium
		WebDriver driver;
        String applicationUrlAddress="https://google.com";

//Atuomating chrome browser
         System.setProperty("webdriver.chrome.driver","./webdriverfile/chromedriver.exe");
          driver=new ChromeDriver();

          driver.get(applicationUrlAddress);
          By sigInProperty=By.linkText("Sign in");
        WebElement  signIn=driver.findElement(sigInProperty);
     String  signInText =signIn.getText();
     System.out.println("the Text of the webelement sign In is:-"+signInText);
     
     signIn.click();
     driver.close();
        
	}

}
