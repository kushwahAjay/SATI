package com.qspiders.Arraysdemo;

import java.util.Arrays;

public class TwodArray102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[][]=new int[3][3];
      int val=10;
      for(int i=0;i<arr.length;i++)//assigning values
      {
    	  for(int j=0;j<arr.length;j++)
    	  {
    		  arr[i][j]=val;
    		  val+=10;
    		  System.out.print(arr[i][j]);
    	  }
    	 System.out.println(); 
      }
      for(int i=0;i<arr.length;i++)//printing values
      {
    	  for(int j=0;j<arr.length;j++)
    	  {
    		  
    		  System.out.print(arr[i][j]);
    	  }
    	  System.out.println();
      }
      
      int arr1[][]= {{10,20,30},{40,50,60},{70,80,90}};
      int arr2[][]=new int[][] {{10,20,30},{40,50,60},{70,80,90}};
	}

}
