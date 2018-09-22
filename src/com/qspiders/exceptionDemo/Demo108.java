package com.qspiders.exceptionDemo;

public class Demo108 {

	public static void main(String[] args) {
		int i=10;
		int j=0;
		try
		{
			System.out.println("inside try block");
			j=i/0;
			System.out.println("exiting try block");
		}
catch (ArithmeticException e) 
{
	System.out.println("inside catch block");
}
		finally//to mandatory execute block of code
		{
			System.out.println("inside finally block");
		}
		System.out.println("i="+i);
	}

}
