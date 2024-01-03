package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_capturingfirstrowoffirstcelldata_cityNames extends BaseTest {

	public void capturingfirstrowoffirstcelldata_cityNames() {
		   System.out.println("Getting the first column data");
		 // String  xpathExpressionPart1="html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]";
		// String  xpathExpressionPart2="/td[1]";
		   for(int index=1;index<=36;index++)
		   {
			  By cityNameProperty =By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]");
			 // By cityNameProperty=By.xpath(xpathExpressionPart1+index+xpathExpressionPart2);
			  WebElement cityName=driver.findElement(cityNameProperty);
			   String cityNameText=cityName.getText();
			   System.out.println(cityNameText);
		   }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebTable_capturingfirstrowoffirstcelldata_cityNames WebTable =new WebTable_capturingfirstrowoffirstcelldata_cityNames();
	WebTable.applicationLaunch();
	WebTable.capturingfirstrowoffirstcelldata_cityNames();
	WebTable.applicationclose();
	}
	}