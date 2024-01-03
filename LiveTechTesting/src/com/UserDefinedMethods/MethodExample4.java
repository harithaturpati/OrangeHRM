package com.UserDefinedMethods;

public class MethodExample4 {
	protected void divison() {
		int var1=40;
		int var2=20;
		int var3;
		var3=var1/var2;
		System.out.println("The value of the variable var3 after division is:-"+var3);
	}
public static void main(String[] args) {
	MethodExample4 m4=new MethodExample4();
	m4.divison();
}
}
