package OOPPolyMorphismExample;
public class A {
	private String name;
	private int age;
	private double balance;
	private String address;
	// helps creating an object of a class - initialize all of the variables
	// default constructor
	public A() {
		super();
		this.name = "";
		this.age = 0;
		this.balance = 0;
		this.address = "";
	}
	// parameterized constructor 1
	public A(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}
	// parameterized constructor 2
	public A(String name, int age, double balance, String address) {
		this(name, age);
		this.balance = balance;
		this.address = address;
	}
	// methods overloading is a type of static Polymorphism that happens during
	// compile time
	// overloading is the idea of having different versions of the same method in
	// the same class
	// you would have to have different signatures if you want to have different
	// versions of the same method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	// overriding is a dynamic polymorphism that happens during runtime
	// overriding is the idea of redefining a method that we inherit in the current
	// class
	// the tag @Override will be added to make sure that you are actually matching
	// the definition of a method that you inherit. doing so, we are making sure
	// that you are actually overriding something and not making a new method
	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + ", balance=" + balance + ", address=" + address + "]";
	}
}