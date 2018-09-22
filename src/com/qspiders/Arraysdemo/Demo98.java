package com.qspiders.Arraysdemo;

public class Demo98 {
public static void main(String[] args) {
	int arr[]= {12,21,(int)10.78,(int)12.45};//10.78,12.45-explicit narrowing
	for(int i:arr)
	{
		System.out.println(i);
	}
	System.out.println("----------------------");
	double arr1[]= {12.66,7,8,6.7};//7,8 -autowidening
	for(double val:arr1)
	{
		System.out.println(val);
	}
	
}
}
