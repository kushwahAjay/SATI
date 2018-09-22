package com.qspiders.EnumDemo;
enum Payment1
{
	CHEQUE,CREDITCARD,DEBITCARD
}
public class EnumDemo2 {

	public static void main(String[] args) {
		Payment1 pmt;
		pmt=Payment1.CREDITCARD;
		System.out.println("printing all payment constants");
		Payment1 pts[]=Payment1.values();
		for(Payment1 p:pts)
		{
			System.out.println(p);
		}

	}

}
