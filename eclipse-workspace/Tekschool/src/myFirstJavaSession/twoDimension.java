package myFirstJavaSession;

public class twoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = {{1, 2, 3, 4}, 
				{5, 6, 7, 8}, 
				{9, 10, 11, 12}, 
				{13, 14, 15, 16}, 
				{17, 18, 19, 20}, 
				{21, 22, 23, 24}, 
				{25, 26, 27, 28}};
		for(int i=0; i < num[i].length; i++) {
		for(int j = 0; j < num[j].length; j++) {
			System.out.print(num[i][j]+ " ");
		}
 		System.out.println();

		}
		
		
		
System.out.println("---------------------------");		
		int range = 20;
		int [] fibNumbers = new int [range];
		fibNumbers[0] = 0;
		fibNumbers[1] = 1; 
		for(int i = 2; i < fibNumbers.length; i++) {
			fibNumbers[i] = fibNumbers[i-1] + fibNumbers[i-2];
			System.out.println(fibNumbers[i]);
			
			
		}
	}
}
