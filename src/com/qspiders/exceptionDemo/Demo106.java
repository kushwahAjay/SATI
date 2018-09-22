package com.qspiders.exceptionDemo;

public class Demo106 {

	public static void main(String[] args) {
		
 int i=10;
 int j=0;
 try
 {
 System.out.println("inside the try block");
	 try
	 {
		 System.out.println("inside the  inner try block");
		 int k=Integer.parseInt("test");
	 } 
    catch (NumberFormatException exp) 
    {
	System.out.println("inside inner catch block (NumberFormatException catch block)");
	//exp.printStackTrace();
    }
System.out.println("back to outer try block");
j=i/0;
 }
catch (ArithmeticException e) 
 {
 System.out.println("inside outer catch block(Arithmetic Exception)");
		 //e.printStackTrace();
 }
 System.out.println("i="+i);
	}

}