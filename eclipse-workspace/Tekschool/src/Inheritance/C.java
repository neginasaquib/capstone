package Inheritance;
public class C extends B {
	private int numC1;
	private int numC2;
	
	public C() {
		super();
		numC1 = 0;
		numC2 = 0;
	}
	
	public C(int numC1, int numC2) {
		super();
		this.numC1 = numC1;
		this.numC2 = numC2;
	}
	public C(int num, int numB, int numC1, int numC2) {
		super(num, numB);
		this.numC1 = numC1;
		this.numC2 = numC2;
	}
	
	
	
	public int getNumC1() {
		return numC1;
	}
	public void setNumC1(int numC1) {
		this.numC1 = numC1;
	}
	public int getNumC2() {
		return numC2;
	}
	public void setNumC2(int numC2) {
		this.numC2 = numC2;
	}
	// will be back at 8:30 pm est
	
	
}