package com.qspiders.exceptionDemo;

public class Demo107 {

	public static void main(String[] args) {
		System.out.println("main method starts");
		System.out.println(test());
		System.out.println("main method ends");

	}
  static String test()
  {
	  int i=10;
	  int j=0;
	  try
	  {
		  System.out.println("inside try block");
		  j=i/0;
	  }
	  catch (ArithmeticException e) 
	    {
		System.out.println("inside catch block");
	    }
	  finally
	  {
		  System.out.println("inside finally block");
	  }
	  return "from outside";
  }
}
