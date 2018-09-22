package com.qspiders.Arraysdemo;

import java.util.Arrays;

public class BubbleSort {
   public static void main(String[] args) {
	int arr[]=new int[] {70,82,66,40,77,32};
	boolean flag=true;
	System.out.println(Arrays.toString(arr));
	while(flag)
	{
		flag=false;
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				flag=true;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
