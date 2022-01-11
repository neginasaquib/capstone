package SpecifiersExamples;
public class ContinueVsBreak {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
		
		outter: for (int i = 0; i < 10; i++) {
			inner: for (int j = 0; j < 10; j++) {
				System.out.print(j*i + "\t");
				if(j*i > 20) {
					break outter;
				}
				
			}
			System.out.println();
		}
		
		
		
	}
}