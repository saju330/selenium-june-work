package homework;

public class Reverseword {

	public static void main(String[] args) {
		
		        String originalString = "testing training center";
		        String[] words = originalString.split(" ");
		        StringBuilder reversedString = new StringBuilder();

		        for (int i = words.length - 1; i >= 0; i--) {
		            reversedString.append(words[i]).append(" ");
		        }

		        System.out.println(reversedString.toString().trim());
		    
          

	}

}
