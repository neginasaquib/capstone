package Inheritance;
public class B extends A {
	private int numB;
	
	public B() {
		super();
		numB = 0;
	}
	public B(int num, int numB) {
		super(num);
		this.numB = numB;
	}
	public int getNumB() {
		return numB;
	}
	public void setNumB(int numB) {
		this.numB = numB;
	}
	
}