package com.qspiders.pack1;

public class Demo88 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Bangalore");
		System.out.println(s1+" "+s2);
		String s3="    i  love   java     ";
		char[] s6 = s3.toCharArray();
		//String s4 = s3.trim();
		System.out.println(s6);
   String s5=" ";
     for(int i=0;i<s6.length;i++)
     {
   
    	 //s5=s3.charAt(i)+s5;
    	 s5=s5+s6[i];
        
     }
     System.out.println(s5);
	}

}
