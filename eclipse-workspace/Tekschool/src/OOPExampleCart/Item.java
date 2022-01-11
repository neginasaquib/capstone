package OOPExampleCart;
public class Item {
	// defining variables of the class
	private String name;
	private double price;
	private int quantity;
	// creating the default constructor
	public Item() {
		this.name = "";
		this.price = 0;
		this.quantity = 0;
	}
	// creating the parameterized constructor
	public Item(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	// creating the getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	// creating the toString method
	@Override
	public String toString() {
		return name + "................... $" + price + "(" + quantity + ")";
	}
}