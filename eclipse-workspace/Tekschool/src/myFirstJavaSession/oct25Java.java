package myFirstJavaSession;

import java.util.ArrayList; 

public class oct25Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][][][] numbers = new int [2][3][5][5];
		int x = 1;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				for (int k = 0; k < numbers[i][j].length; k++) {
					for (int d = 0; d < numbers[i][j][k].length; d++) {
						numbers[i][j][k][d] = x++;
						System.out.print(numbers[i][j][k][d] + "\t");
					}
					System.out.println("    next line");
				}
				System.out.println("----- next table ");
			}
			System.out.println("Next collection of tables");
		}
		
		System.out.println("-------------------------------------------------------------");

		//array lists are dynamic and not fixed in size. No size limit.
		//Can't use primitives. 
		
		Integer x2 = 10;
int y = 10; 
String z = "5"; 

System.out.println(x2 + y + Integer.valueOf(z));

System.out.println("-------------------------------------");

ArrayList<Integer> test = new ArrayList<Integer>();
test.add(1);
test.add(2);
test.add(3);
test.add(4);
test.add(5);
test.add(6);
test.add(7);
test.add(8);

System.out.println(test.get(1));
System.out.println(test.size());
System.out.println("------------------------------------");

	// or loop through it
for(int i = 0; i < test.size(); i++)
	System.out.println(test.get(i));
System.out.println("------------------------------------");
for(Integer i : test) {
	System.out.println(i);
}

System.out.println(test);
//create an ArrayList that takes String values
//add these values "DC", "VA", "CA", "TX"
//create a loop that goes through from a-z
//create a loop that goes through from z-a
//go through the list with foreach loop
//print the list without a loop by printing the name of the list
System.out.println("-----------------");

ArrayList<String> states = new ArrayList<String>(); 
states.add("DC");
states.add("VA");
states.add("CA");
states.add("TX"); 


System.out.println("for loop first to last:");
for(int i = 0; i < states.size(); i++) {
	System.out.println(states.get(i));
}
System.out.println("---------------");

System.out.println("for loop - last to first:");
//for loop - last to first
for(int i = states.size() - 1; i >=0; i--) {
	System.out.println(states.get(i));
}
System.out.println("---------------");

System.out.println("for each loop:");
//for each loop: 
for(String i : states) {
	System.out.println(i);
	System.out.println();
	System.out.println("----------------");
	
	System.out.println("list print:");

//list print 
System.out.println(states);
}

//class is blueprint, object is instance/copy of that class. 
//constructors or constructor methods are used to create an object of the class. 
//you start with access modifier. Public is one, means you can use it anywhere in the project.
//

ArrayList<String> data = new ArrayList<String>();
data.add("one");
data.add("two");

System.out.println(data.get(1));
System.out.println(data.size());

}

}
