//StringBuffer & string Builder
package com.qspiders.pack1;

public class Demo93 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		sb1.append("hello");
		StringBuffer sb2=new StringBuffer("Bangalore");
		System.out.println(sb1+""+sb2);
		System.out.println(sb1.reverse());
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		StringBuffer sb3=sb2.reverse();
		System.out.println(sb2);
		System.out.println(sb3);
		System.out.println(sb1);
		System.out.println(sb2==sb3);
		
		//sb1.setLength(0);
		sb1.delete(0, sb1.length());
		System.out.println(sb1.length());
		System.out.println("-------");
		StringBuffer sb4=new StringBuffer("I love you java");
		String str1=sb4.delete(7, 11).toString();
		System.out.println(str1);
		StringBuffer sb5=new StringBuffer("I love you java");
		String str2=sb5.deleteCharAt(11).toString();
		System.out.println(str2);
		sb4=new StringBuffer();
		System.out.println(sb4.length());
		System.out.println("---------");
		sb4.append("java Developer");
		System.out.println(sb4.length());
		sb4.insert(4, "haha");
		System.out.println(sb4);
		sb4.insert(sb4.length(), "huhu");
		System.out.println(sb4);
		sb4.insert(4, 6);
		System.out.println(sb4);
		sb4.insert(0, "huhu");
		System.out.println(sb4);
		System.out.println(sb4.deleteCharAt(4));
	StringBuilder sb6=new StringBuilder("selenium");
	System.out.println(sb6);
	StringBuilder sbl;
	System.out.println(sbl=sb6.insert(4, "haha"));
	System.out.println(sbl);
	System.out.println(sbl==sb6);
	System.out.println(sb6.equals(sbl));
	System.out.println("------------------");
	StringBuilder sbl2=new StringBuilder("hello");
	StringBuilder sbl3=new StringBuilder("hello");
	System.out.println(sbl2.equals(sbl3));
	
	StringBuffer sb7=new StringBuffer("Bangalore");
	System.out.println(sb7);
	System.out.println(sb7.reverse());
	sb7.reverse();
	System.out.println(sb7.delete(3, 7));
	//assigning stringBuffer to string class
	String s=sb1.toString();
	//first way//of assigning string to stringBuffer class
	StringBuffer sb8=new StringBuffer("Hello");
	////2nd way of assigning string to stringBuffer class
	sb8.append("Bangalore");
	System.out.println(sb8);
	sb8.append("");
	System.out.println(sb8);
	}
		


}
