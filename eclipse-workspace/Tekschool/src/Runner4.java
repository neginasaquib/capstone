
public class Runner4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
BankAccount customer1 = new BankAccount(12345, "Jack", "Schmidtt", "10/01/2001", 500);

System.out.println(customer1.getbalance());
customer1.deposit(199.00);
customer1.deposit(10.00);
customer1.withdraw(50.00);
customer1.withdraw(500);

System.out.println(customer1.getbalance());
System.out.println("--------------------------------");
System.out.println(customer1.getAccountNumber());
customer1.setaccountNumber(67867867);
	System.out.println(customer1.getAccountNumber());
	}

}
