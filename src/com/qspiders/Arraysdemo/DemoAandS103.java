package com.qspiders.Arraysdemo;

public class DemoAandS103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[][]= {{3,5,7,9},{4,2},{5,7,8,6},{6}};
 for(int i=0;i<arr.length;i++)
 {
	 for(int j=0;j<arr[i].length;j++)
	 {
		 System.out.print(arr[i][j]);
	 }
	 System.out.println();
 }
 System.out.println("-----enhanced for loop------");
      for(int sa[]:arr)
      {
    	for(int i:sa) 
    	{
    		System.out.print(i);
    	}
    	System.out.println();
      }
	}

}
