package SpecifiersExamples; 

public class switchCase {
	public static void main(String[] args) {

		String[] data = { "value 1", "value 2" };

		data[0] = "OK";

		System.out.println(data[1]);

		double[] numbers = new double[5];

		numbers[0] = 10;

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (i + 1) * 5;
			System.out.println(numbers[i]);
			
		}
		

	}
}
