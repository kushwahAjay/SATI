package com.qspiders.GcDemo;

public class GarbageCollection {

	public static void main(String[] args) throws Exception {
		
 Runtime rs=Runtime.getRuntime();
 System.out.println("Free memory in jvm before garbage collection="+rs.freeMemory());
	}

}
