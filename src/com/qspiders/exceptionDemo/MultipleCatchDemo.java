package com.qspiders.exceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		String str="12.56";
		Scanner sc=new Scanner(str);
		//sc.close();
		int i=0;
		try
		{
			i=sc.nextInt();
		}
		catch (InputMismatchException imexp) 
		{
			System.out.println(imexp);
		}
		catch (IllegalStateException isexp) 
		{
			System.out.println(isexp);
		}
		System.out.println(i);

	}

}
