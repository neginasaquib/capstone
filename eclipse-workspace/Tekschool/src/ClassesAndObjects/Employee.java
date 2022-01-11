package ClassesAndObjects;
public class Employee {
	// to encapsulate our class, we make the variables private
	// so that they are no longer directly accessible from outside of the class
	private int idNumber;
	private String firstName;
	private String lastName;
	public Employee() {
		this.firstName = "";
		this.lastName = "";
		this.idNumber = 0;
	}
	public Employee(int idNumber, String firstName, String lastName) {
		this.idNumber = idNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return idNumber + " (" + lastName + ", " + firstName + ")";
	}
	// getter methods are used to return the private variables of a class
	// we also call these getter methods, accessor
	public int getIdNumber() {
		return idNumber;
	}
	// setter methods are used to assign a new value to a private variable
	// we also call setter methods, mutators
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	// Access Modifiers
	// 1. private (you can only access the member in the same class)
	// 2. protected
	// 3. default -- when you do not put an access modifier
	// 4. public (you can access the member in the entire project)
}