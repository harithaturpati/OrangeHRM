package com.UserDefinedMethods;

public class MethodExample2 {   
	public void addition() {
	int var1=20;
	int var2=10;
	int var3;
	var3=var1+var2;
	System.out.println("The value of the variable of the var3 after addition is:-"+var3);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodExample2 m2=new MethodExample2();
		m2.addition();
		m2.subtraction();
	}
		private void subtraction()
		{
		int var1=10;
		int var2=20;
		int var3;
		var3=var1-var2;
		System.out.println("The value of the variable of the var3 after subtraction is:-"+var3);
		
		}
		
		
		

	}


