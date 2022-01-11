package myFirstJavaSession;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "Richmond";
		String name2 = name1;
		String name3 = name1;
		String name4 = name1;
		String name5 = name1;
		System.out.println(name1 +": "+name2 +": "+name3 +": "+name4 +": "+name5);
	
		int num1 = 5;
		int num2 = 8;
		int num3 = 13;
				
		System.out.println("num1 before =  " + num1);
		num1 = num2;
		System.out.println("num1 after =  " + num1);
		num2 = num3; 
		System.out.println("num3 before =  " + num3);
		num3 = num1;
		System.out.println("num3 after =  " + num3);
		System.out.println(num3); 
		
		//Primitive Datatype
		//byte
		byte byteNumber = 127;
		//short
		short shortNumber = 234;
		//int
		int intNumber = 4546;
		//long
		long longNumber = 243243434L;
		//the above ones are only going to be used for whole number
		
		//float
		float floatNumber = 5.5f;
		//double
		double doubleNumber = 56.7d;
		//the above ones are for decimal point number, but we can also store whole number
		
		//char
		char charChar = 'a';
		
		//boolean
		boolean blnDataType = true;
		boolean blnDatatype2 = false; 
		
	}

}
	
		
			
			
