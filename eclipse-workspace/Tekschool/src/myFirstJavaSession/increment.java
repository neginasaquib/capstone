package myFirstJavaSession;

public class increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 10;
System.out.println(x);
System.out.println(++x);
System.out.println(--x);
System.out.println(--x);
System.out.println(--x);


double income = 150000;
double taxrate = 3.5; 

double taxamount = income * taxrate /100; 
System.out.println(taxamount);

int x = 0;
--x; 
x++; 

System.out.println("what is the value of this => " + ++x );
	}

}
