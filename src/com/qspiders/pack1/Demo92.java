package com.qspiders.pack1;

public class Demo92 {

	public static void main(String[] args) {
		String s1="hellollo";
		 System.out.println(s1);
		String s=s1.concat("hi");
		System.out.println(s);
		System.out.println(s1.length());
		System.out.println(s1.concat("hello"));
        String s2=new String();
         System.out.println(s2);
         System.out.println(s2.isEmpty());
         String s3=s2.concat("hello");
         System.out.println(s3.isEmpty());
         System.out.println( s1.compareTo(s3));
         System.out.println(s1.charAt(1));
         s1="Developer";
         System.out.println(s1.contains("Deve"));
         System.out.println(s1.equals(s2));
         System.out.println(s1.equals("hello"));
         System.out.println(s1.equals(null));
         System.out.println(s1.equals(new String("hello")));
         System.out.println(s1);
         System.out.println("hello".equals("hello"));
         System.out.println(new String("hello").equals(new String("hello")));
         System.out.println("".equals(""));
         System.out.println("".equals(null));
         System.out.println(s1.equals("developer"));
         System.out.println(s1.equalsIgnoreCase("developer"));
         System.out.println(s1.indexOf("Deve"));
         System.out.println(s1.indexOf('e'));
         System.out.println(s1.indexOf('e',6));
         s1="the girl is watching the birds the boy is watching the birds";
         System.out.println(s1.indexOf('z'));
         System.out.println(s1.indexOf("the",3));
         s1="ASHOKA";
         int index=0;
         int cntr=0;
         while(s1.indexOf('A',index)!=-1)
        		 {
        	 index=s1.indexOf('A',index);
        	 cntr++;
        	 index=index+1;
        		 }
      System.out.println("A is repeated "+cntr+"times");
      
      s1="javaDeveloper";
      System.out.println(s1.replace("e", "Engineer"));
      System.out.println(s1.replaceAll("e", "L"));
      System.out.println(s1.charAt(0));
      System.out.println(s1.charAt(s1.length()-1));
      System.out.println("--------");
      s1="jackAndJill";
      for(int i=0;i<s1.length();i++)
      System.out.print(s1.charAt(i));
      System.out.println("--------");
      System.out.println("printing in reverse");
      for(int i=s1.length()-1;i>=0;i--)
          System.out.print(s1.charAt(i));
       System.out.println("print reverse a string");
      System.out.println();
      s1="qspiders";
      s2="";
      for(int i=s1.length()-1;i>=0;i--)
    	  s2=s2+s1.charAt(i);
      System.out.println(s2);
      System.out.println(s1.contains("Deve"));
      System.out.println("DA".compareTo("CA"));
      System.out.println(s1.toUpperCase());
      System.out.println(s1.toLowerCase());
      System.out.println(4+5+" is the sum of 4 and 5");
      System.out.println("the sum of 4 and 5 is"+4+5);
      
      System.out.println("the sum of 4 and 5 is"+(4+5));
      s1="jackAndjill";
      char chars[]=s1.toCharArray();
      String s4="";
      System.out.println("reversing a string");
      for(int i=chars.length-1;i>=0;i--)
    	  s4=s4+s1.charAt(i);
      System.out.println(s4);
      s1= "jackAndjill";
      char arr[]=s1.toCharArray();
      for(int i=0;i<=arr.length-1;i++)
      {
    	 System.out.print(arr[i]+"\t"); 
    	 System.out.print((int)arr[i]+"\t");//printing unicode value
    	 //print the next char of the present character
    	 System.out.print((char)arr[i]+1+"\t");
    	System.out.println(++arr[i]);
    	 
      }
      
      System.out.println(new String("Hello").length());  
      System.out.println("Bangalore".length());
      String s5="   Hello   ";
      System.out.println(s5.length());
      s5.trim();
      System.out.println(s5.length());
      //alternate
      System.out.println(s5.trim().length());
      s1=" JavaDeveloper";
      System.out.println(s1.toString());
      System.out.println(s1.substring(4,s1.length()));
      System.out.println(s1.substring(4,11));
      String str="welcome Akhilesh kumar yadav to stackoverflow.com";
      System.out.println(str.substring(8,str.indexOf("to")-1));
      String s6="this is java class";
      String arr1[]=s6.split("");
      for(int i=arr1.length-1;i>=0;i--)
      {
    	  System.out.print(arr1[i]);
      }
    	  
      
      System.out.println();
      for(int i=0;i<=arr1.length-1;i++)
    	  
      {
    	  System.out.print(arr1[i]+" ");
    	
      }
      
     }
         
	}


