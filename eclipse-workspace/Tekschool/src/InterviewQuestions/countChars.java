package InterviewQuestions;

import java.util.HashMap;

public class countChars {

	public static void main(String[] args) {
	//count the frequency of each character in a given string.
	
	String str = "this is a test string that we should count the number of occurance of each character.";
	
	int count_t = 0;
	for(int i = 0; i < str.length(); i++) {
		if(str.charAt(i) == 't') {
			count_t++;
			
		}
		
		
	}
	System.out.println("t" + count_t);	
	
	// count occurrence of all chars
	//make a map with chars as keys and int as value
	// we will store count of each char, in the value
	HashMap<Character, Integer> charOccurrence = new HashMap<>();
	
	// 1. go through all of the chars
	// 2. we check to see if the char is already in the map. 
	// - if yes, increase the current count
	// - no, then add the char to the map and give it count of 1 in value
	
	for (char c : str.toCharArray()) {
		if(charOccurrence.containsKey(c)) {
			
			//true means the char is already in the map
			//we have to get the current count
			//in crease the current count	
			int newCount = charOccurrence.get(c) + 1;
			charOccurrence.put(c,  newCount);
		}
		else {
			//the char is not in the map
			//it's the first time, we are seeing this char
			//add the char to the map
			//add the value 1 for the count
			charOccurrence.put(c, 1);
		}
		
	}
	System.out.println(charOccurrence);
	
	
	
}
}
