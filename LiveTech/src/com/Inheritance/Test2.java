package com.Inheritance;

public class Test2 extends Test1 {
	private void subtraction ()
	{
		int var1=20;
		int var2=30;
		int var3;
		var3=var1-var2;
		System.out.println("The value of the variable var3 after addition is:-"+var3);
		
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("***Methods of Test2 java class****");
  Test2 t2=new Test2();
  t2.subtraction();
  t2.multiplication();
  System.out.println();
  
  System.out.println("****Methods of Test1 java clas*****");
  t2.addition();
	}

protected void multiplication()
	// TODO Auto-generated method stub
{
int var1=20;
int var2=30;
int var3;
var3=var1*var2;
{
	System.out.println("The value of the variable var3 after multiplication is:-"+var3);
}
}

}
