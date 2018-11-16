package Loan;

import java.util.Date;

public class Main {
	

	
	public static void main(String[]args) {
		
		Date date1 = new Date();
		date1.setTime(100);
		Date date2 = new Date();
		date2.setTime(1000);
		Date date3 = new Date();
		date3.setTime(500);
		Date date4 = new Date();
		date4.setTime(20);
		Date date5 = new Date();
		date5.setTime(240);
		Date date6 = new Date();
		date6.setTime(241);
		Date date7 = new Date();
		date7.setTime(10);
		Date date8 = new Date();
		date8.setTime(10);
		Date date9 = new Date();
		date9.setTime(90);
		Date date10 = new Date();
		date10.setTime(1);
		Date date11 = new Date();
		date11.setTime(120);
		Date date12 = new Date();
		date12.setTime(11);
		
		
		
		Lenders lender1 = new Lenders(6.0,2000,date1);
		Lenders lender2 = new Lenders(8.0,100,date2);
		Lenders lender3 = new Lenders(9.0,500,date3);
		Lenders lender4 = new Lenders(10.0,350,date4);
		Lenders lender5 = new Lenders(10.0,900,date5);
		Lenders lender6 = new Lenders(10.0,1000d,date6);
		
		Buyers buyer1 = new Buyers(8.0,1500,date7);
		Buyers buyer2 = new Buyers(6.0,1000,date8);
		Buyers buyer3 = new Buyers(7.0,100,date9);
		Buyers buyer4 = new Buyers(7.0,300,date10);
		
		System.out.println(lender1.matchToBuyer().amount);
	}
}
