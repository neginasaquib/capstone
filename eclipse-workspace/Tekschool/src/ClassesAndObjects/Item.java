package ClassesAndObjects;

public class Item {
	
	String name;
	double price; 
	int serialNumber; 
	
	public Item(String name, double price, int serialNumber) {
	this.name = name;
	this.price = price; 
	this.serialNumber = serialNumber;
	}	
	
	public Item(String name, int serialNumber) {
		
		this.name = name; 
		this.serialNumber = serialNumber; 
		this.price = 0.0;
				
	}
	public String toString() {
		return "Item[name: " + name + ", price: " + price + ", serialNumber: " 
	+ serialNumber + "]";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
Item x = new Item("Chocolate", 15.99, 154435345);
x.name = "test item 1";
x.price = 16.99; 
System.out.println(x.name);

Item y = new Item("RedBull", 5436436);
y.name = "test item 2";

System.out.println("----------");
System.out.println(x);
System.out.println(y);

	}

}
