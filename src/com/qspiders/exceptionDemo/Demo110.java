package com.qspiders.exceptionDemo;

public class Demo110 {

	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println(test());
		System.out.println("main end");

	}
 static String test()
 {
	int i=0;
	int j;
	try
	{
		j=i/2;
		return "pass";
	}
	catch (ArithmeticException exp) {
		exp.printStackTrace();
		return "fail";
	}
	finally
	{
		return "pass fail";
	}
 }
}
