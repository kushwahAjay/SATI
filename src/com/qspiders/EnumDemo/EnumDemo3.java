package com.qspiders.EnumDemo;
enum Payment2
{
	CHEQUE(1000), CREDITCARD(1500), DEBITCARD(2000);
	private int minpaymt;
	Payment2(int i)
	{
		minpaymt=i;
	}
int getminpaymt()
{
	return minpaymt;
}
}
public class EnumDemo3 {

	public static void main(String[] args) {
		Payment pmt;
		pmt=Payment.CREDITCARD;
		System.out.println("minimum payment for cheque is"+Payment2.CHEQUE.getminpaymt());
		System.out.println("minimum payment for defferent mode");
		Payment pts[]=Payment.values();
		for(Payment p:pts)
		{
			System.out.println(p);
		}
		
	}

}
