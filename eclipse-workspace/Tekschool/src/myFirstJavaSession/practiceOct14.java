package myFirstJavaSession;

public class practiceOct14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if a number is divisible by 3 print for me "fizz"
				// if a number is divisible by 3 && 5 print for me "fizzBuzz"
				// if number is divisible by 5 print for me "Buzz"
	int x = 15;
	
	if (x % 3 == 0)
		{System.out.println("Fizz");
		}
	else if (x % 3 == 0 && x % 5 == 0)
	{System.out.println("fizzBuzz");}
	else if (x % 5 == 0)
	{System.out.println("Buzz");
	}
	else {System.out.println("This number is not fizzBuzz number");}
	
	for (int f = 7; f < 18; f++) {System.out.println(f);}
	
	for (int f = 9; f <= 15; f++) {System.out.println(f);}
	for (int f = -5; f <= 5; f++) {System.out.println(f);}
	for (int f = -10; f <= 0; f++) {System.out.println(f);}
	for (char f = 'a'; f < 'd'; f++) {System.out.println(f);}

	
}
}
