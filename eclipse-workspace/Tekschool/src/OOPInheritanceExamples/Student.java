package OOPInheritanceExamples;
public class Student extends Person {
	private double gpa;
	private String major;
	// keywords this and super are referring to different scopes
	// this means that you refer to the current class
	// super means that you are referring to the parent class
	public Student() {
		super();
		this.gpa = 0;
		this.major = "";
	}
	public Student(String firstName, String lastName, int age, double gpa, String major) {
		super(firstName, lastName, age);
		this.gpa = gpa;
		this.major = major;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}

