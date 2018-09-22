package com.qspiders.exceptionDemo;
import java.util.Scanner;
class InvalidAgeException  extends RuntimeException{
	InvalidAgeException(String str)
	{
		System.out.println(str);
	}
}
public class Demo14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter your age");
		int age=sc.nextInt();
		try
		{
			if(age>=60||age<=0)
			{
				System.out.println("invalid age: plz enter age between 1-60");
				throw new InvalidAgeException("invalid Age: plz enter age between 1-59");
			}
		}
		catch (InvalidAgeException exp) {
			
		}
      System.out.println("Age entered is "+age);
	}

}


