Zpackage myFirstJavaSession;

public class increment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		x = x + 1; 
		x++;
		x--; 
		x *= 2; 
		int y = x + 10; 
		y = x++; 
		System.out.println("what is the value of this => " + ++x );

		int num2 = 10; 
num2++; 
num2 = num2++ - --num2;
System.out.println(num2 - 5);
	
System.out.println("----------------------");

int num3 = 21; 
 
num3 = num3++ + 10 - 2; //post increment so num3 stays 21 then becomes 22
num3 *= ++num3; 

System.out.println("the value of num3 is " +num3);


int num4 = 19;  
int num5 = num4 + 58; // 19+58 = 77
num4 = num5; // 77 = 77
num5 = ++num4 + 10 - 5; // 77 = 1+77+10-5 = 83
num4 = num4 + 1; // 78 = 78 + 1 = 79 
System.out.println("value of num4 is " +num4);
System.out.println("value of num5 is " +num5);

int age = 15;
if(age >= 17) {
	System.out.println("You can drive now, yay!");}
	else
	{System.out.println("You cannot drive, bohoo!");}


int age2 = 14; 
if(age2 >= 17) {
	System.out.println("You can drive now! yay!!");}
else 
{System.out.println("No you cannot! haha!");}
	

double grade = 78; 
System.out.println(grade);

if (grade >= 90) {System.out.println("You got an A");}	
	else if (grade >= 80) {System.out.println("You got a B");
	}
	else if (grade >= 70) {System.out.println("You got a C");
	}
	else if (grade >= 60) {System.out.println("You got a D");
	}
	else {System.out.println("F");}

double grade2 = 91; 
System.out.println(grade2);

if (grade2 >= 95) {System.out.println("You got an A+");}	
	else if (grade2 <= 94) {System.out.println("You got a A-");
	}
	else if (grade2 >= 85) {System.out.println("You got a B+");
	}
	else if (grade2 <= 80) {System.out.println("You got a B-");
	}
	else {System.out.println("C");}

double grade3 = 95; 
if (grade3 >= 95) {System.out.println("You got an A+");}
else {System.out.println("You got an A-");}
if (grade3 >= 85) {System.out.println("You got a B+");}
else {System.out.println("You got B-");}
	
double grade5 = 78;
System.out.println(grade5);
if (grade5 >= 90) {
	System.out.print("A");
	if (grade5 >= 95) {
		System.out.println("+");
	} else {
		System.out.println("-");
	}
} else if (grade5 >= 80) {
	System.out.print("B");
	if (grade5 >= 85) {
		System.out.println("+");
	} else {
		System.out.println("-");
	}
} else if (grade5 >= 70) {
	System.out.print("C");
	if (grade5 >= 75) {
		System.out.println("+");
	} else {
		System.out.println("-");
	}
} else if (grade5 >= 60) {
	System.out.print("D");
	if (grade5 >= 65) {
		System.out.println("+");
	} else {
		System.out.println("-");
	}
} else {
	System.out.println("F");
}
System.out.println("---------------------------");

double grade6 = 90; 
if (grade6 >= 95) {
	System.out.println("A+");
} else if (grade6 >= 90) {
	System.out.println("A-");
} else if (grade6 >= 85) {
	System.out.println("B+");
} else if (grade6 >= 80) {
	System.out.println("B-");
} else if (grade6 >= 75) {
	System.out.println("C+");
} else if (grade6 >= 70) {
	System.out.println("C-");
} else if (grade6 >= 65) {
	System.out.println("D+");
} else if (grade6 >= 60) {
	System.out.println("D-");
} else {
	System.out.println("F");
}

int age5 = 17; 
double income = 18000; 
if (age5 > 50) {System.out.println("5% discount");}
else if (income < 20000) 
{System.out.println("3% discount");}

System.out.println("------------------------------");

int x10 = 10; 
int y10 = 10;
//relational operators: compares two objects to check if they're equal to each other.
System.out.println(x10 == y10); 
System.out.println(x10 + 1 == ++y10);
System.out.println(x10 >= y10);
System.out.println(x10 <= y10);

System.out.println("----------------------");

//OR Block
int num11 = 10;
int num12 = 20;
int num13 = 30; 

if (num11 > num12 || num13 > num12);
	{System.out.println("Block is true");
	}
int temp = 5;
{
System.out.println(true || ++temp > 50);}
	
	
	}
}
