package Selfpractice110821Onwards;
import java.util.ArrayList;
public class Book {
	String author;
	String title;
	int publishYear; 
	String iSBN;
	
	public Book() {
	String author = "";
	String title = "";
	int publishYear = 0;
	String iSBN = "";	
	}
	
public Book(String author, String title, int publishYear, String iSBN) {
	this.author = author;
	this.title = title;
	this.publishYear = publishYear;
	this.iSBN = iSBN;
}

public String toString() {
	return author + "'s " + title + "\nPublished: " + publishYear + "\nISBN: " + iSBN;
}
public static void main(String[] args) {

Book obj1 = new Book("JRR Tolkien", "The Lord of the Rings", 1920, "23523523");
	System.out.println(obj1);
}

}