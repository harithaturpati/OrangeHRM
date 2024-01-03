package com.UserDefinedMethods;

public class MethodExample3 {
public void multiplication()
{
	int var1=10;
	int var2=20;
	int var3;
	var3=var1*var2;
	System.out.println("The value of the variable var3 after multiplication is:-"+var3);
	
}
	public static void main(String[] args) {
	MethodExample3 m3=new MethodExample3();
	m3.multiplication();
	MethodExample2 m2=new MethodExample2();
	m2.addition();
	System.out.println();
	}
	
	
	

}
