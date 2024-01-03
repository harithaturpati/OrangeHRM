package com.DynamicWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


 public class CapturingCompleteWebtableData extends BaseTest {
	 
 @Test
   public void  capturingCompleteWebtableData()
  {
	System.out.println("Getting the complete webtable data");
 ///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]
 //html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+"]/td[1]
  String xpathExpressionPart1 ="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
  String xpathExpressionPart2="]/td[";
  String xpathExpressionPart3="]";
		 for(int rowIndex=1;rowIndex<=36;rowIndex++)
		 {
		 for(int rowofCellIndex=1;rowofCellIndex<=8;rowofCellIndex++)
	     {
			By webTableDataProperty=By.xpath(xpathExpressionPart1+rowIndex+xpathExpressionPart2+rowofCellIndex+xpathExpressionPart3);
			WebElement webTableData=driver.findElement(webTableDataProperty);
			String webTableDataText=webTableData.getText(); 
			System.out.println(webTableDataText+"|");	 
				 
		 }
			 System.out.println();
		 }
}
}



