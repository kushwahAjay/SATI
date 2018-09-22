package com.qspiders.exceptionDemo;

public class Demo109 {

	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println(test());
		System.out.println("main ends");
	}
	static String test()
	{
		int i=10;
		int j;
		try
		{
			j=i/2;
			return "pass";
		}
		catch (ArithmeticException e) {
	     e.printStackTrace();
	     return "fail";
		}
	}

}
