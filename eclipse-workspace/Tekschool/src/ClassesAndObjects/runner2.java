package ClassesAndObjects;

import java.util.ArrayList;

public class runner2 {
	public static void main(String[] args) {
		Book obj2 = new Book("JK Rowling", "HP and the Azkaban Prisoner", 2005, "as54sad49854a4sd");
		
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("some name1", "some title", 1990, "someISBN165814651"));
		library.add(new Book("some name2", "some title", 1990, "someISBN165814651"));
		library.add(new Book("some name3", "some title", 1990, "someISBN165814651"));
		library.add(new Book("some name4", "some title", 1990, "someISBN165814651"));
		library.add(new Book("some name5", "some title", 1990, "someISBN165814651"));
		library.add(new Book("some name6", "some title", 1990, "someISBN165814651"));
		library.add(new Book("some name7", "some title", 1990, "someISBN165814651"));
		library.add(new Book("some name8", "some title", 1990, "someISBN165814651"));
		library.add(new Book("some name9", "some title", 1990, "someISBN165814651"));
		library.add(new Book("some name10", "some title", 1990, "someISBN165814651"));
		
		
		
		for (Book b : library) {
			System.out.println(b);
		}
		
		
		
		System.out.println(obj2.toString());
		
	}

}
