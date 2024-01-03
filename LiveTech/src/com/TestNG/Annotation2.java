
package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2 {
	@BeforeTest(description="Launching Gmail Application ")
	public void gmailApplicationLaunch()
	{
		System.out.println("****gmail Application Launch Successfully*****");

		}
	@Test(priority=4,description="Validating sentmail functionality")
	 public void SentMail()
	 {
	 	System.out.println("****SentMail Test Executed Successfully*****");

	 	}
	@Test(priority=3,description="validating composemail functionality")
	public void  ComposeMail()
	{
		System.out.println("****ComposeMail Test Executed Successfully*****");
	}
		
		
	@Test(priority=2,description="validating login functionality")
	public void  loginTest()
	{
		System.out.println("****login Test Executed Successfully*****");
	}
	@Test(enabled=true ,description="validating Draftmail functionality")
	public void DraftMail()
	{
		System.out.println("Draft Test executed successfully");
	}
   @AfterTest(description="****Application closed successfully****88")
  public void ApplicationCloseTest()
  {
	 System.out.println("Application closed suucessfully");  
  }
}




