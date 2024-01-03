package com.Inheritance;

public class Test3  extends Test2{
	void division()
	{
		int var1=20;
		int var2=5;
		int var3;
		var3=var1-var2;
		
			System.out.println("The value of the variable var3 after division is:-"+var3);
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			 System.out.println("***Methods of Test3 java class****");
			  Test3 t3=new Test3();
			  t3.division();
			  t3.addition();
			  System.out.println();
			  
			  System.out.println("****Methods of Test2 java class user-defined method which is private cannot be accessed in the currennt class");
			  t3.multiplication();
			  System.out.println();
			  System.out.println("***Methods of Test1 java class****");
			  Test1 t1=new Test1();
			  t1.addition();
			 // t2.subtraction();//private method
	}

}
