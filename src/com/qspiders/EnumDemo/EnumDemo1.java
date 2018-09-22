package com.qspiders.EnumDemo;
enum Payment
{
	CHEQUE,CREDITCARD,DEBITCARD
}
public class EnumDemo1 {

	public static void main(String[] args) {
		
 Payment pmt;
 pmt=Payment.CREDITCARD;
 System.out.println("value of pmt:"+pmt);
 
 switch(pmt)
 {
 case CREDITCARD:
	 System.out.println("payment made by :"+pmt);
	 break;
 case CHEQUE:
	 System.out.println("payment made by :"+pmt);
	 break;
 case DEBITCARD:
	 System.out.println("payment made by :"+pmt);
	 
	 
	 
 }
	}

}
