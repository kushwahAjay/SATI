package com.qspiders.exceptionDemo;

public class Demo111 {

	public static void main(String[] args) {
		Demo111 r=new Demo111();
		r.test1();

	}
	void test1()
	{
		test2();
	}
	void test2()
	{
		test3();
	}
	void test3()
	{
		test4();
	}
	void test4()
	{
		int i=10/0;
	}

}
