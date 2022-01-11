package InterviewQuestions;
public class PalindromeQ {
	public static void main(String[] args) {
		String word = "abc";
		System.out.println("method 1 " + word + " - " + isPalindrome1(word));
		System.out.println("method 2 " + word + " - " + isPalindrome2(word));
		System.out.println("method 3 " + word + " - " + isPalindrome3(word));
	}
	public static boolean isPalindrome1(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return str.equals(rev);
	}
	public static boolean isPalindrome2(String str) {
		// String builder and String buffer
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return String.valueOf(sb).equals(str);
	}
	public static boolean isPalindrome3(String str) {
		for (int f = 0, b = str.length() - 1; f < str.length(); f++, b--) {
			
			if(str.charAt(f) != str.charAt(b)) {
				return false;
			}
			if(f == b || f > b) {
				return true;
			}
		}
		return true;
	}
}