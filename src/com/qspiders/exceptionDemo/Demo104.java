package com.qspiders.exceptionDemo;

public class Demo104 {

	public static void main(String[] args) {
		int i=10;
		int j=0;
		try
		{
			System.out.println("inside the try block");
			j=i/0;
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println("inside the catch block");
		}

	}

}
