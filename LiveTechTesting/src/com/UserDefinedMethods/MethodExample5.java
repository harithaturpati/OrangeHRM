package com.UserDefinedMethods;

public class MethodExample5 {
	void divisionByZero()
{
		try 
		{
		int var1=40;
		int var2=20;
		int var3;
		var3=var1/var2;
		System.out.println("The value of the variable var3 after division is:-"+var3);
	}
	catch (Exception exceptioncaught)
	{  
		System.out.println("Unable to perform the operation of division method ,the exception is:-"+exceptioncaught);
		
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println();
System.out.println("Division method of methodexample4 class ");
System.out.println();
MethodExample4 m4= new MethodExample4();
m4.divison();
MethodExample5 m5= new MethodExample5();
m5.divisionByZero();
	}

}
