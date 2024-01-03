package com.OHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMApplication_LoginTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		//Automation chrome Browser
		System.setProperty("webdriver.chrome.driver", "./webdriverfile/chromedriver.exe");
		driver=new ChromeDriver();
		//navigating to OrageHRM application url address
		driver.get(applicationUrlAddress);
		System.out.println("Navigated to orangeHRMApplication");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//validatingOrangeHRM application loginin page title
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
		 String expectedOrangeHRMApplicationurladdress="orangehrm-4.2.0.1";
		 System.out.println("the expected url address of OrangeHRM Application login page is :-"+expectedOrangeHRMApplicationurladdress);
		 
		 String actualOrangeHRMApplicationurladdress=driver.getCurrentUrl();
		 System.out.println("the expected url address of OrangeHRM Application login page is :-"+actualOrangeHRMApplicationurladdress);
		 
		 if(actualOrangeHRMApplicationurladdress.contains(expectedOrangeHRMApplicationurladdress))
		 {
			 System.out.println("sucessfully navigated to orangehrm application login page-url address matched-PASS");
		 }
		 else
		 {
			 System.out.println("suceesfully navigated to orangehrm application login page -url address not matched-FAIL");
		 }
		 //expected text-should be "login panel"
		 String expectedorangeHRMApplicationLogInPageText="LOGIN Panel";
		 System.out.println("the expected text of the OrangeHRMApplicationloginpage is:-"+expectedorangeHRMApplicationLogInPageText);
		// <div id="logInPanelHeading">LOGIN Panel</div>
		By  loginPanelProperty=By.id("logInPanelHeading");
		 
		 WebElement orangeHRMApplicationLogInPage_logInPanel=driver.findElement(loginPanelProperty);
		String actualorangeHRMApplicationLogInPageText=orangeHRMApplicationLogInPage_logInPanel.getText();
		System.out.println("the actual text of the OrangeHRMApplicationloginpage is:-"+actualorangeHRMApplicationLogInPageText);
		if(actualorangeHRMApplicationLogInPageText.equals(expectedorangeHRMApplicationLogInPageText))
		{
			System.out.println("OrangeHRMAplicatin login pagetext existing-PASS");
		}
		else
		{
			System.out.println("OrangeHRMAplicatin login pagetext not existing-FAIL");
		}

		FileInputStream loginTestdatafile=new FileInputStream("./src/com/ExcelOperatorsTest/selenium excel.xlsx");
		//identify the workbook in the excel file
		XSSFWorkbook workBook=new XSSFWorkbook(loginTestdatafile);
		 XSSFSheet loginTestdataSheet=workBook.getSheet("sheet1");
		 Row testDataSheetrow=loginTestdataSheet.getRow(1);
		Cell  usernametestdatacell=testDataSheetrow.getCell(1);
		String usernametestdata=usernametestdatacell.getStringCellValue();
		System.out.println("The UseName is :-"+usernametestdata);
		//Validating LogIn Functionality

		//Automating UserName WebElement
		String userNameTestData="Haritha"; 
		By userNameProperty=By.id("txtUsername"); 

		WebElement userName=driver.findElement(userNameProperty); 
		//Performing an operation on the identified webElement
		userName.sendKeys(userNameTestData);
		  
		Cell  passwordtestdatacell=testDataSheetrow.getCell(2);
		String passwordtestdata=passwordtestdatacell.getStringCellValue();
		System.out.println("The password is :-"+passwordtestdata);


		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">

		String passwordTestData="Haritha@123"; 
		By passwordProperty=By.name("txtPassword"); 
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData); 


		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		By logInButtonProperty=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();

		//Validating OrangeHRMApplication Homepage
		String expectedOrangeHRMApplicationHomePageText="Welcome";
		System.out.println("The expected text of the OrangeHRMApplication HomePage is:- "+expectedOrangeHRMApplicationHomePageText);
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		By welcomeAdminProperty=By.id("welcome");
		  WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty);
		String actualOrangeHRMApplicationHomePageText=welcomeAdmin.getText();
		System.out.println("The actual text of te OrangeHRMAplication Homepage is:-"+actualOrangeHRMApplicationHomePageText);

		if(actualOrangeHRMApplicationHomePageText.contains(expectedOrangeHRMApplicationHomePageText))
		{
			
			System.out.println("Successfully Navigated to OrangeHRMApplication HomePage-PASS");
			Cell resultCell=testDataSheetrow.createCell(3);
		}
		else
		{
			System.out.println("failed to Navigated to OrangeHRMApplication HomePage-FAIL");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 welcomeAdmin.click();
		 
		By logoutPrperty=By.linkText("Logout");
		WebElement logout=driver.findElement(logoutPrperty);
		logout.click();

		expectedOrangeHRMApplicationloginpageTitle="OrangeHRM";
		System.out.println(" The expected Title of the OrangeHRMApplicatin loginin page is:- "+expectedOrangeHRMApplicationloginpageTitle);

		//operation on the webpage 
		actual_OrangeHRMApplicationloginpageTitle="OrangeHRM";
		System.out.println("the actual title of the OrangeHRMApplicatin loginin page is:-"+actual_OrangeHRMApplicationloginpageTitle);

		if(actual_OrangeHRMApplicationloginpageTitle.equals(expectedOrangeHRMApplicationloginpageTitle))
		{
		System.out.println("OrangeHRMApplicationLoginPageTitle matched-PASS");	
		}
		else
		{
		System.out.println("OrangeHRMApplicationLoginPageTitle not matched-FAIL");	

			}
		//validating url Address
		//Expected-orangeHRMApplicationUrl address should have a test orange-4.2.0.1
		 expectedOrangeHRMApplicationurladdress="orangehrm-4.2.0.1";
		System.out.println("the expected url address of OrangeHRM Application login page is :-"+expectedOrangeHRMApplicationurladdress);
		 actualOrangeHRMApplicationurladdress=driver.getCurrentUrl();
		System.out.println("the expected url address of OrangeHRM Application login page is :-"+actualOrangeHRMApplicationurladdress);

		if(actualOrangeHRMApplicationurladdress.contains(expectedOrangeHRMApplicationurladdress))
		{
			 System.out.println("sucessfully navigated to orangehrm application login page-url address matched-PASS");
		}
		else
		{
			 System.out.println("suceesfully navigated to orangehrm application login page -url address not matched-FAIL");
		}
		//expected text-should be "login panel"
		 expectedorangeHRMApplicationLogInPageText="LOGIN Panel";
		System.out.println("the expected text of the OrangeHRMApplicationloginpage is:-"+expectedorangeHRMApplicationLogInPageText);
		//<div id="logInPanelHeading">LOGIN Panel</div>
		 loginPanelProperty=By.id("logInPanelHeading");

		 orangeHRMApplicationLogInPage_logInPanel=driver.findElement(loginPanelProperty);
		 actualorangeHRMApplicationLogInPageText=orangeHRMApplicationLogInPage_logInPanel.getText();
		System.out.println("the actual text of the OrangeHRMApplicationloginpage is:-"+actualorangeHRMApplicationLogInPageText);

		if(actualorangeHRMApplicationLogInPageText.equals(expectedorangeHRMApplicationLogInPageText))
		{
			System.out.println("OrangeHRMAplicatin login pagetext existing-PASS");
		}
		else
		{
			System.out.println("OrangeHRMAplicatin login pagetext not existing-FAIL");
		}

		driver.close();

		 
		 
		 
		 
		 
		 
		 
		 
		 
				
				 
		
		
		
		
	}

}
