package myFirstJavaSession;
public class Instructor {
	String firstName;
	String lastName;
	String phone;
	String email;
	String subject;
	public Instructor() {
		firstName = "";
		lastName = "";
		phone = "";
		email = "";
		subject = "";
	}
	public Instructor(String fn, String ln, String newPhone, String newEmail, String newSubject) {
		firstName = fn;
		lastName = ln;
		phone = newPhone;
		email = newEmail;
		subject = newSubject;
	}
	public void printInfo() {
		System.out.println("Instructor Info: " + lastName + ", " + firstName);
	}
}