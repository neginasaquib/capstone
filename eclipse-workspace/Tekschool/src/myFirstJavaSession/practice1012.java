package myFirstJavaSession;

public class practice1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num14 = 3;
		int num15 = 6;

		int totalNum14Num15 = num14 + num15;
		System.out.println("First Line:       " + totalNum14Num15);

		int num16 = 10;
		int num17 = 5; 
		System.out.println("Second Line:      " + num14 + num15);
		
		// 		// total < 100, 5% shipping and no discount
		// total >= 100, free shipping and 2% discount
		// total >= 300, free shipping and 5% discount
		// total >= 500, free expedited shipping and 7% discount
		// total > 1000, free expedited shipping and 10% discount
		
		double amount = 99;
		
		double shipping = 0;
		double discountAmount = 0;
		boolean expedited = false;
		
		
		if(amount < 100) {
			// add 5% for shipping and 0 for discount
			shipping = amount * 0.05;
			discountAmount = 0;
			expedited = false;
		} else if (amount >= 100 && amount < 300) {
			// free shipping and 2% discount
			shipping = 0;
			discountAmount = amount * 0.02;
			expedited = false;
		} else if(amount >= 300 && amount < 500) {
			// free shipping and 5% discount
			shipping = 0;
			discountAmount = amount * 0.05;
			expedited = false;
		} else if(amount >= 500 && amount < 1000) {
			// free expedited shipping and 7% discount
			shipping = 0;
			discountAmount = amount * 0.07;
			expedited = true;
		} else {
			// free expedited shipping and 10% discount
			shipping = 0;
			discountAmount = amount * 0.1;
			expedited = true;
		}
		
		
		System.out.println("--------------------------");
		System.out.println("Amount:\t\t$" + amount);
		System.out.println("shipping:\t + $" + shipping);
		if(expedited == true) {
			System.out.println("Expedited Shipping!");
		} else {
			System.out.println("Standard Shipping!");
		}
		System.out.println("Discount:\t - $" + discountAmount);
		System.out.println("Total:\t\t$" + (amount + shipping - discountAmount));
		System.out.println("--------------------------");
///String type = "";
		//double amount = 100;
		
		// use switch or if statements or conditional operators
		
		// we have 3 types of accounts, checking, saving, credit
		// if checking and amount is not more than 500, print "Transaction OK"
		// if saving with any amount, print "You can not directly withdraw from saving"
		// if credit, and amount is less than 1000, print "Transaction OK"
		// 		also, if amount > 500 print "Confirmation message sent!"
		String type = "";
		double amount2 = 100;
		switch (type) {
		case "checking":
			System.out.println(amount2 < 500 ? "Transaction OK!" : "");
			break;
		case "saving":
			System.out.println("You can not directly withdraw from saving");
			break;
		case "credit":
			if(amount2 < 1000) {
				System.out.println("Transaction OK!");
			}
			if(amount2 > 500) {
				System.out.println("Confirmation message sent!");
			}
			break;
		}
		
		int num5 = 4;
		if (num5 % 2 == 0)
		{System.out.println(num5 + " is even");}
		 else {
			System.out.println(num5 + " is odd");
		}
		//divisible by 3, divisible by 5, divisible by 3 and 5
		int number = 10; 
		if (number % 3 == 0 && number % 5 == 0) {
		System.out.println("Tek School");
		} else if (number % 3 == 0) {
			System.out.println("Tek"); 
		} else if (number % 5 == 0) {System.out.println("School");
		} else {System.out.println(number);
		}
			
		
	}

}
