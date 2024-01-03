package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_capturingfirstrowoffirstcelldata_cityname extends BaseTest {

	public void caputuringFirstRowofFirstCellData_CityName  ()
	{
	By cityNameProperty=By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
	WebElement cityName=driver.findElement(cityNameProperty);
	String cityNameText=cityName.getText();
	System.out.println(cityNameText);
	}
	
	//html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebTable_capturingfirstrowoffirstcelldata_cityname WebTable=new WebTable_capturingfirstrowoffirstcelldata_cityname();
		WebTable.applicationLaunch();
		WebTable.caputuringFirstRowofFirstCellData_CityName();
		WebTable.applicationclose();
	
	

		// TODO Auto-generated method stub

	}

}
