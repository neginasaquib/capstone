package ClassesAndObjects;
import java.util.ArrayList;
public class Book {
	// keyword 'this' will refer to the variables out of the current scope
	// or in other words, to the variables in the body of the class
	// method 'toString' is a special method that comes with java, and it will get
	// ran
	// any time that you print name of the object of that class
	// so you need to define this method for your class if you want the information
	// to be printed
	// in the cases that you print the name of the object
	// things to think about when you are designing your class
//	1. creating the variables of the class
	String author;
	String title;
	int publishYear;
	String iSBN;
	/// here
//	2. creating constructors for the class
//	2.1 creating the default constructor
	public Book() {
		author = "";
		title = "";
		publishYear = 0;
		iSBN = "";
	}
//  2.2 creating a parameterized constructor
	public Book(String author, String title, int publishYear, String iSBN) {
		this.author = author;
		this.title = title;
		this.publishYear = publishYear;
		this.iSBN = iSBN;
	}
	// the way that you can make sure your definition of the toString method is
	// valid
	// you see a green arrow on the line number
	// use @Override to see if your method is correct
	@Override
	public String toString() {
		return "Book[Title: " + title + ", Author: " + author + ", Year Published: "
				+ publishYear + ", ISBN: " + iSBN + "]";
	}
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4 };
		System.out.println(x);
		ArrayList<String> y = new ArrayList<>();
		y.add("test");
		y.add("test");
		y.add("test");
		y.add("test");
		System.out.println(y);
		Book obj = new Book();
		Book obj2 = new Book("JK Rowling", "HP and the Azkaban Prisoner", 2005, "as54sad49854a4sd");
		System.out.println(obj);
		System.out.println(obj2);
	}
}