package com.qspiders.GcDemo;

public class FinalizeDemo{
public static void main(String[] args) {
}
protected void finalize() throws Throwable
{
//super.finalize();//empty biscuit
System.out.println("our cleaning");
}
}
