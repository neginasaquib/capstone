package Abs_exampl2;
public interface SampleInterface extends AccountGeneralMethods {
	
	
	
	// interface vs abstract class
	// interface is used for 100% abstraction
	// you can implement as many interfaces as you want
	
	// abstract classes are still classes and you can extend only one class - does not matter if its abstract or not
	// in any abstract class, you can have zero or many abstract methods
	
	// you can not create objects of either abstract class or interfaces
	
	// the only cases that you can have implementation for a method in an interface is
	// 1. static methods
	// 2. default methods
	
	
	public final static int x = 10;
	
	public static void someMethod() {
		System.out.println("somemethod");
	}
	
	public void doSomething();
	
	public default void doSomethingElse() {
		System.out.println("default implementation of that dosomethingelse method");
	}
	
}