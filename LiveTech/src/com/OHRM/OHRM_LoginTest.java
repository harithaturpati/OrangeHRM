package com.OHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		//Automation chrome Browser
		System.setProperty("webdriver.chrome.driver", "./webdriverfile/chromedriver.exe");
		driver=new ChromeDriver();
		//navigating to OrageHRM application url address
		driver.get(applicationUrlAddress);

		//validatingOrangeHRM application loginin page title

		//Expected title of the OrangeHRM application loginin page should be-OrangeHRM 
		String expectedOrangeHRMApplicationloginpageTitle="OrangeHRM";
		System.out.println(" The expected Title of the OrangeHRMApplicatin loginin page is:- "+expectedOrangeHRMApplicationloginpageTitle);

		//operation on the webpage
		String actual_OrangeHRMApplicationloginpageTitle="OrangeHRM";
		System.out.println("the actual title of the OrangeHRMApplicatin loginin page is:-"+actual_OrangeHRMApplicationloginpageTitle);

		if(actual_OrangeHRMApplicationloginpageTitle.equals(expectedOrangeHRMApplicationloginpageTitle))
		{
		System.out.println("OrangeHRMApplicationLoginPageTitle matched-PASS");	
		}
		else
		{
		System.out.println("OrangeHRMApplicationLoginPageTitle matched-FAIL");	

			}
		System.out.println();

		//validating url Address
		//Expected-orangeHRMApplicationUrl address should have a test orange-4.2.0.1
		 String expectedOrangeHRMApplicationurladdress="OrangeHRM";
		 System.out.println("the expected url address of OrangeHRM Application login page is :-"+expectedOrangeHRMApplicationurladdress);
		 
		 String actualOrangeHRMApplicationurladdress =driver.getCurrentUrl();
		 System.out.println("the expected url address of OrangeHRM Application login page is :-"+actualOrangeHRMApplicationurladdress);
		 
		 if(actualOrangeHRMApplicationurladdress.contains(actualOrangeHRMApplicationurladdress)) {
			 System.out.println("sucessfully navigated to orangehrm application login page-url address matched-PASS");
		 }
		 else
		 {
			 System.out.println("suceesfully navigated to orange hrm application login page -url address matched-FAIL");
		 }
		 
		 //verifying and validating username (element)
		 //the element of the webpage is identified based on its properties 
		 //the propertied of the element identified by inspecting it-right click on the element under test-select inspect option
		 //right click on the highlighted source code-select copy-select outer HTML
		 
		 //<input name="txtUsername" id="txtUsername" type="text">
		 
		 //the available properties of the inspected element-we should look for an existence of locator  of the selenium webdriver
		 //properties contains locators and their corresponding values 
		 driver.findElement(By.name("txtUsername")).sendKeys("Haritha");
		 
		 //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password" class="__web-inspector-hide-shortcut__">
		 driver.findElement(By.name("txtPassword")).sendKeys("Haritha@123");
		 
		 //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		 driver.findElement(By.className("button")).click();
		 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/admin/viewAdminModule" id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>

			
			
		 
				}
		}



	


