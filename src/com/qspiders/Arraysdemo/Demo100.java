package com.qspiders.Arraysdemo;
import java.util.Arrays;
public class Demo100 {

	public static void main(String[] args) {
		
  int a[]= {10,3,47,04,8};
  System.out.println("Array element before sort");
  //1st way
  for(int x:a)
  {
	  System.out.print(x+" ");
	 
  }
  System.out.println();
  //2nd way
  System.out.println(Arrays.toString(a));
  
  System.out.println("Array element after sort");
  
  Arrays.sort(a);
  //1st way
  for(int x:a)
  {
	  System.out.println(x);
  }
	}
	
	

}
