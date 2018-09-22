package com.qspiders.pack1;

public class StringReverse {
	public static void main(String[] args) {
		
String str1="I love java";
StringBuffer sb1=new StringBuffer("I love java");
String str=sb1.reverse().toString();
System.out.println(str);
System.out.println(sb1.reverse());
System.out.println();
System.out.println("--------------------");
String s6="this is java class";
String arr1[]=s6.split("");
for(int i=arr1.length-1;i>=0;i--)
{
	if(arr1.length>0)
	  System.out.print(arr1[i]+" ");
}	
	System.out.println();	

 

System.out.println();
for(int i=0;i<=arr1.length-1;i++)
	  
{
	  System.out.print(arr1[i]+" ");
	
}
System.out.println();

int  i=1234;

i=Integer.parseInt(new StringBuffer(Integer.toString(i)).reverse().toString());
System.out.println(i);
System.out.println("--------------------");
String str2="james bond";
String str3="";
for(int i1=str2.length()-1;i1>=0;i1--)
{
	System.out.print(str2.charAt(i1));
}
System.out.println();
String str4=new StringBuffer(str2).reverse().toString();
System.out.println(str4);

}
}