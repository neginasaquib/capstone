package Selfpractice110821;

import java.util.Scanner;

public class ScannerExampleNumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numEntered = 0;
		System.out.println("Please enter a number:");
		
		if(sc.hasNextInt()) {
			numEntered = sc.nextInt();
		}
	
	}
}
