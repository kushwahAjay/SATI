package com.qspiders.exceptionDemo;

public class chainexceptiondemo {

		public static void print()
		{
		try
		{
		String [] str= {"Hello"};
		System.out.println(str[5]);
		}
		catch(ArrayIndexOutOfBoundsException aiob)
		{
			throw new RuntimeException(aiob);
		}
		
		}
public static void main(String[] args) {
	try
	{
		print();
	}
	catch(RuntimeException re)
	{
		System.out.println(re.getClass());
		System.out.println(re.getCause());
	}
	
}
}
  

