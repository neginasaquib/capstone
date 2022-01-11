package myFirstJavaSession;

public class WhileLoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 1;
while (x <= 10) {
	System.out.println(x++);
	
}
System.out.println("End of the Program");
	

int number = 6;  
while (number <= 10) {System.out.println(number++);	
}

int number2 = 3;
while (number2 < 11) {System.out.println(number2);
number2+=2; 
}

int num3 = 1;
int num4 = 1;
while (num3 <= 5) {
	while (num4 <= 5) {
		System.out.print(num4);
		num4++;
	}
	System.out.println();
	num4 = 1;
	num3++;
}



String state = "FL"; 
switch (state) {
case "VA":
	System.out.println("Virginia");
	break; 
case "NY":
	System.out.println("New York");
	break; 
case "CA": 
	System.out.println("California");
	break; 
	default: 
		System.out.println("Search is not matching.");
	
}


double amount = 5000;
double shipping = 0;
double discount = 0;

if (amount < 100) 
{shipping = 100 * 0.05; 
discount = 0;
	}
else if (amount >= 100){
	shipping = 0;
	discount = 100 * 0.02; 
}
else if (amount >= 300) 
{ shipping = 0;
  discount = 300 * 0.05; 
	}
else if (amount >= 500)
{ shipping = 0;
		discount = 500 * 0.07; 
	}
else if (amount > 1000)
{ shipping = 0;
	discount = 1000 * 0.1; 
}

System.out.println("Shipping cost applied to this order\t" + shipping);
System.out.println("Discount applied to this order\n" + discount);
	

int numberr = 29; 
if (numberr % 2 == 0) {
	System.out.println("This number is even"); }
	else if (numberr % 2 != 0) {	
		System.out.println("This number is odd");
	}


}
}