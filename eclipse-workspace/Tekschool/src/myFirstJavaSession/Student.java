package myFirstJavaSession;
public class Student {
	// 1 create variables for the class
	String firstName;
	String lastName;
	int age;
	String phone;
	String email;
	String ssn;
	// 2 create constructors
	// default constructor - initializing the variables to the default values
	public Student() {
		firstName = "";
		lastName = "";
		age = 0;
		phone = "";
		email = "";
		ssn = "";
	}
	public Student(String fn, String ln, int newAge, String ph, String em, String newSSN) {
		firstName = fn;
		lastName = ln;
		age = newAge;
		phone = ph;
		email = em;
		ssn = newSSN;
	}
	// create a method to print student information in this format
	// lastname, firstname age: ??? ssn: **-***-0000
	// Contact Info: email@domain.??? Phone: (000) 000 - 000
	public void printInfo() {
		String seperator = "-------------------------------------";
		String tempSSN = "***-**-" + ssn.substring(7);
		String tempPhone = "(" + phone.substring(0, 3) + ")" + phone.substring(3, 6) + "-" + phone.substring(6);
		String line1 = lastName + ", " + firstName + "\tAge: " + age + "\t\tSSN: " + tempSSN;
		String line2 = "Contact Info(Email: " + email + "\tPhone: " + tempPhone + " )";
		System.out.println(seperator + "\n" + line1 + "\n" + line2 + "\n" + seperator);
	}
}