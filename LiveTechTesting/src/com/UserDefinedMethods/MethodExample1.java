package com.UserDefinedMethods;

public class MethodExample1 {
	
	
	public void addition() {
		int var1=20;
		int var2=30;
		int var3;
		var3=var1+var2;
		System.out.println("The value of the variable of the var3 after addition is:-"+var3);
	}
	public static void main(String[] args) {
	MethodExample1 m1=new MethodExample1();
	m1.addition();
	m1.subtraction();
	}
	public void subtraction()
	{
		int var1=20;
		int var2=30;
		int var3;
		var3=var1-var2;
		System.out.println("The value of the variable of the var3 after subtraction is:-"+var3);
	}
	}

	

	


