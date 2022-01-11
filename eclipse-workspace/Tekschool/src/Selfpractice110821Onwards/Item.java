package Selfpractice110821Onwards;
public class Item {
	String name;
	double price;
	int serialNumber;
	
public Item() {
	String name = "";
	double price = 0.0;
	int serialNumber = 0;	
}
public Item(String name, double price, int serialNumber) {
	name = name;
	price = price;
	serialNumber = serialNumber;
	
}


public static void main(String[] args) {
	Item x = new Item("Lysol ", 19.99, 3532523); 
	x.setName("Lysol");
	x.setPrice(19.99);
	x.setSerialNumber(3532523);
	System.out.println(x);

	
	Item y = new Item("Clorox", 12.99, 3523520);
	y.name = "Clorox ";
	y.price = 12.99 ;
	y.serialNumber = 3523520;

	System.out.println(y);
}

public String getName() {
	return name; 
}

public void setName(String name) {
	this.name = name; 
}

public double getPrice() {
	return price;
}

public void  setPrice(double price) {
	this.price = price;
}

public int getSerialNumber() {
	return serialNumber;
}

public void setSerialNumber(int serialNumber) {
	this.serialNumber = serialNumber; 
}

public String toString() {
	return name + ": $" + price + ", Serial Number: " + serialNumber;
	
	}


}