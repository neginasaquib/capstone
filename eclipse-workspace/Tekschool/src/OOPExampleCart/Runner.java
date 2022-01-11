package OOPExampleCart;
import java.util.ArrayList;
import java.util.Scanner;
public class Runner {
	public static void main(String[] args) {
		// creating a list to store the items added to the cart
		ArrayList<Item> cart = new ArrayList<>();
		// list of items available
		ArrayList<Item> availableItems = new ArrayList<>();
		// we need add some example items to the list to test our code with
		availableItems.add(new Item("Book", 19.99, 24));
		availableItems.add(new Item("Computer", 1700.89, 5));
		availableItems.add(new Item("Redbull", 2.99, 558));
		availableItems.add(new Item("Pen", 5.99, 245));
		availableItems.add(new Item("Pencil", 3.99, 15));
		// create scanner and a menu of option to choose from
		Scanner sc = new Scanner(System.in);
		// creating a flag 'checkOut' to know if the user want to check out
		// if check out is selected, we have to stop asking the user to select an option
		// if check out is selected, print the cart
		boolean checkOut = false;
		while (checkOut == false) { // this <<< can be said as !checkOut
			// keep asking user to add items to the cart
			// print a list of options
			System.out.println("Please choose one of the following items:");
			for (int i = 0; i < availableItems.size(); i++) {
				System.out.println((i + 1) + ", " + availableItems.get(i));
			}
			int chkOutLineNum = (availableItems.size() + 1);
			System.out.println(chkOutLineNum + ", CheckOut");
			int opt = sc.nextInt();
			// user selected the checkout option
			if (opt == chkOutLineNum) {
				checkOut = true; // set the flag for the loop to true
				// reduce the qty of available items based on the items that we are checking out
				for (Item cartItem : cart) {
					// i on the first iteration is book
					// go through list of available items, find book
					for (Item availableItem : availableItems) {
						// check to see if the name of the item in the cart matches the item in the list
						if (cartItem.getName().equals(availableItem.getName())) {
							// change the quantity of the item
							// current quantity - quantity that we are checking out
							availableItem.setQuantity(availableItem.getQuantity() - cartItem.getQuantity());
							break;
						}
					}
				}
				System.out.println("Checking Out!");
				break; // stop and get out of the loop
				// we do not want to keep asking user to select options anymore
			}
			System.out.print("Please enter the quantity you want: ");
			int qty = sc.nextInt();
			System.out.println("\n*\nItem Added to the Cart!\n*\n");
			// adding item to the cart
			cart.add(new Item(availableItems.get(opt - 1).getName(), availableItems.get(opt - 1).getPrice(), qty));
		} // <<<< this is end of the loop that selects options to add to cart
		// user selected checked out, lets do the following
		// print the cart
		System.out.println("***************** Printing the Cart *****************");
		double grdTotal = 0;
		for (int i = 0; i < cart.size(); i++) {
			double sum = cart.get(i).getPrice() * cart.get(i).getQuantity();
			System.out.println((i + 1) + ", " + cart.get(i) + " ---- $" + sum);
			grdTotal += sum;
		}
		System.out.println("---------------------");
		System.out.println("Grand Total \t\t\t $" + grdTotal);
		if (grdTotal > 500) {
			System.out.println("Discount \t\t\t $" + grdTotal * 0.05);
			System.out.println("Total after discount \t\t\t $" + (grdTotal - (grdTotal * 0.05)));
		}
		System.out.println("------------------------------");
	}
}