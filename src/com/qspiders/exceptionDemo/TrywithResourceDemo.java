package com.qspiders.exceptionDemo;

import java.util.Scanner;

public class TrywithResourceDemo {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("enter a no.");
			int i=sc.nextInt();
		}
      catch(Exception e)
		{
    	  
		}
	}

}
