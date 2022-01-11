
public class BankAccount {

	private int accountNumber;
	private String firstName;
	private String lastName; 
	private String dob; 
	private double balance; 
	
	public BankAccount() {
		accountNumber = 0;
		firstName = "";
		lastName = "";
		dob = "";
		balance = 0;
	}
	public BankAccount(int accountNumber, String firstName, String lastName, String dob, double balance) {
		this.accountNumber = accountNumber;
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.dob = dob; 
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setaccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
	
	}
public String getfirstName() {
	return firstName; 
}
public void setfirstName(String firstName) {
	this.firstName = firstName; 
	}
public String getlastName() {
	return lastName; 	
}

public void setlastName(String lastName){
this.lastName = lastName; 	
}
public String getdob() {
	return dob;
}
public void setdob(String dob) {
	this.dob = dob;
}
public double getbalance() {
	return balance;
}
public double deposit(double amount) {
	balance = balance + amount;
	return balance;
}
public double withdraw(double amount) {
	balance = balance - amount; 
	return balance; 
}
public double withdraw1(double amount) {
	if(amount > balance) {
		System.out.println("You actually don't have that much money with us!");
		System.out.println("Withdrawal failed!");
		return balance; }   
		else {
			balance = balance - amount;
			System.out.println("Withdrawal of $" + amount + " is done successfully!");
			return balance;
		}
	}
}



