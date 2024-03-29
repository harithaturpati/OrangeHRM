package com.ExcelOperator;

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

public class OHrMApplication_multipleTestData_valid {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		//Automation chrome Browser
		System.setProperty("webdriver.chrome.driver", "./webdriverfile/chromedriver.exe");
		driver=new ChromeDriver();
		//navigating to OrageHRM application url address
		driver.get(applicationUrlAddress);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	FileInputStream loginTestdatafile=new FileInputStream("./src/com/ExcelOperatorsTest/selenium excel.xlsx");
		//identify the workbook in the excel file
		XSSFWorkbook workBook=new XSSFWorkbook(loginTestdatafile);
		 XSSFSheet loginTestdataSheet=workBook.getSheet("sheet1");
		 Row testDataSheetrow=loginTestdataSheet.getRow(1);
		Cell  usernametestdatacell=testDataSheetrow.getCell(1);
		String usernametestdata=usernametestdatacell.getStringCellValue();
		System.out.println(usernametestdata);
		//<input name="txtUsername" id="txtUsername" type="text">
		By usernameProperty=By.id("txtUsername");
		WebElement userName=driver.findElement(usernameProperty); 
		//Performing an operation on the identified webElement
		userName.sendKeys(usernametestdata);
         Cell  passwordtestdatacell=testDataSheetrow.getCell(2);
 		String passwordtestdata=passwordtestdatacell.getStringCellValue();
        System.out.println(passwordtestdata);
       // <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
        By passwordProperty=By.name("txtPassword"); 
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordtestdata); 
		
		By logInButtonProperty=By.className("button");
		WebElement logInButton=driver.findElement(logInButtonProperty);
		logInButton.click();
		String currentPageUrl=driver.getCurrentUrl();
		if(currentPageUrl.contains("dashboard")) {
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		By welcomeAdminProperty=By.linkText("Welcome Admin");
		  WebElement welcomeAdmin=driver.findElement(welcomeAdminProperty); 
		 welcomeAdmin.click();

		 By logoutPrperty=By.linkText("Logout");
		 WebElement logout=driver.findElement(logoutPrperty);
		 logout.click();
		}
		driver.quit();
	}

}
