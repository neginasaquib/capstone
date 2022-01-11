package OOPExampleCart;

import java.util.ArrayList; 
public class Cart {

	private Customer customer;
	private ArrayList<Item> items = new ArrayList<>();
	
	Scanner sc =  new Scanner(System.in);
	
	// Cart features: 
	// add items to the cart
	public void addItem(Item item) {
		items.add(item);
		System.out.println("Item added to the cart!");
	}
	
	// remove items
	
	public boolean removeItem() {
		System.out.println("*** Remove Item - Please select an option:");
		for (int i = 0; i < items.size(); i++) {
			System.out.println((i+1) + ", " + items.get(i));
		}
		
		return true;
	}
	
	
	// check out cart
	// clear cart
	// change quantity


	
}
