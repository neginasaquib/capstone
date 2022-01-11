package mutationExamples;
public class MutationsExamples {
	public static void main(String[] args) {
		
		
		
		// Mutation
		// Immutable - when you change the value of the object, it will go and create a new object in the heap and refer to that
		// Mutable - when you change the value of the object, it will change the value in the same location in the heap
		
		
		String x = "test";
		
		x = "test2";
		
		x = x.replace('t', 'a');
		
		System.out.println(x);
		
		
		
		StringBuilder sb = new StringBuilder("test2");
		sb.replace(0, 2, "aa");
		
		System.out.println(sb);
		
		
		
		// mutable
		StringBuilder sbuil = new StringBuilder("test"); // not thread safe
		StringBuffer sbuffer = new StringBuffer("test"); // thread safe
		
		//immutable
		String st = new String("test");
		String st2 = "test";
		
		
		
		
		
		
	
		
		
		
	}
}