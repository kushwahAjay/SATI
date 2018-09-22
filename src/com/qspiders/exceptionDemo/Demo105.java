package com.qspiders.exceptionDemo;

public class Demo105 {

public static void main(String[] args) {
 int i=10;
 int j=0;
 try
 {
	 System.out.println("inside the try block");
	 j=i/0;
	 
 }
 catch (ArithmeticException exp) 
 {
	 System.out.println("inside Arithmetic exception  catch block");
	 //exp.printStackTrace();
 }
 try
 {
	 System.out.println("inside Numberformat exception try block");
	 int k=Integer.parseInt("test");
 }
 catch (NumberFormatException exp) 
 {
	System.out.println("inside NumberFormatException catch block");
	//exp.printStackTrace();
	
}
 System.out.println("i="+i);
	}

}
