package com.qspiders.Arraysdemo;

public class Demo95 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
System.out.println("----------------------------------");

int arr1[];
 arr1=new int[5];
 int val=10;
 for(int j=0;j<arr1.length;j++)
 {
	 arr1[j]=val;
	 val+=10;
 }
 for(int j=0;j<arr1.length;j++)
 {
	 System.out.println(arr1[j]);
 }
 System.out.println("-----------------------------");
 
 int arr2[]= {10,20,30,40,50};
 for(int a:arr2)
 {
	 System.out.println(a);
 }
	}

}
