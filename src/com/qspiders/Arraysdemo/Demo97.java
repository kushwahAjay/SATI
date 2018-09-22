package com.qspiders.Arraysdemo;

public class Demo97 {

	public static void main(String[] args) {
		int arr[]=new int[3];
		arr[0]=10;
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		String arr1[]=new String[3];
		arr1[0]="Hello";
		for(String s:arr1)
		{
			System.out.println(s);
		}
		Apple arr2[]=new Apple[3];
		Apple a2=new Apple();
       arr2[0]=new Apple();
       arr2[1]=a2;
       for(Apple a:arr2)
       {
    	   System.out.println(a);
       }
	}

}

 class Apple {

}
