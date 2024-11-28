package homework;

public class VowelCount {

	public static void main(String[] args) {
		
		  String inputString = "Hello World";
	        int vowelCount = 0;

	        for (int i = 0; i < inputString.length(); i++) {
	            char ch = inputString.charAt(i);
	            if (isVowel(ch)) {
	                vowelCount++;
	            }
	        }

	        System.out.println("Number of vowels in the string: " + vowelCount);
	    }

	    public static boolean isVowel(char ch) {
	        ch = Character.toLowerCase(ch);
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';

	}

}
