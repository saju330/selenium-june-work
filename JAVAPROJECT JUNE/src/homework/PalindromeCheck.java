package homework;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		String originalString = "mukesh";
        String reverseString = new StringBuilder(originalString).reverse().toString();

        if (originalString.equals(reverseString)) {
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }

	}

}
