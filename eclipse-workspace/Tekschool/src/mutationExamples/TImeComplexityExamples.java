package mutationExamples;
public class TImeComplexityExamples {
	public static void main(String[] args) {
		// O(n^2)
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++) {
			}
		}
		// O(n)
		for (int j = 0; j < 15; j++) {
		}
		// O(2n)
		for (int j = 0; j < 15; j++) {
		}
		for (int j = 0; j < 15; j++) {
		}
		
		//O(n^3)
		for (int j = 0; j < 15; j++) {
			for (int i = 0; i < 10; i++) {
				for (int k = 0; k < 8; k++) {
				}
			}
		}
		
	}
}