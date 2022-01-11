package SpecifiersExamples;
public class StaticKeywordExample {
	public static void main(String[] args) {
		
		Student obj1 = new Student();
		obj1.name = "Jack";
		
		Student obj2 = new Student();
		obj2.name = "David";	
		
		Student obj3 = new Student();
		obj3.name = "David";	
		
		Student obj4 = new Student();
		obj4.name = "David";	
		
		Student obj5 = new Student();
		obj5.name = "David";	
		
		Student obj6 = new Student();
		obj6.name = "David";	
		
		System.out.println(Student.count);
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// int and long
		
		
		
		System.out.println(numPower(5, 3));
		
		System.out.println(Math.pow(5, 3));
		System.out.println(Math.max(10, 5));
	}
	
	
	
	// power 2^2 2*2
	// 3^3 3*3*3
	// 4^3 4*4*4
	
	public static int numPower(int num, int pow) {
		int result = num;
		for (int i = 1; i < pow; i++) {
			result *= num;
		}
		
		return result;
	}
	
	
	
	
	public static void writeSoemthingToExcelFile(String path, int row, int col, String value) {
		//Apache POI
	}
	
	
	
	
	
}