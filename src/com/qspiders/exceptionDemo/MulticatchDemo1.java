package com.qspiders.exceptionDemo;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MulticatchDemo1 {

	public static void main(String[] args) {
		String str="12";
		
		Scanner sc=new Scanner(str);
		//sc.close();
		try
		{
			sc.nextInt();
		}
		catch(NoSuchElementException|IllegalStateException isexp)
		{
			System.out.println(isexp);
		}

	}

}
