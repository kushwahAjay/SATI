package com.qspiders.GcDemo;

public class Demo125 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("java");
		System.out.println(sb);
		sb=null;//eligible for collection
		String s1=new String("Hello");
		String s2=new String("Java");
		System.out.println(s1);
		s1=s2;//Hello object is eligible for collection
		System.out.println(new String("Bangalore").length());
		

	}

}
