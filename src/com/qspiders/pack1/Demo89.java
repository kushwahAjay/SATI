package com.qspiders.pack1;

public class Demo89 {

	public static void main(String[] args) {
		String s1="java";
        String s2=new String("Bangalore");
        String s3="java";
        String s4=new String("bangalore");
       System.out.println(s1==s3);//== relational operator compares Addresses
       System.out.println(s2==s4);
       String s5=new String("java");
       System.out.println(s1==s5);
       System.out.println(s3.equals(s5));
	}

}
