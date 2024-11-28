package homework;

public class InsertWordString {

	public static void main(String[] args) {
		
		String originalString = "java 3.0";
        String insert = "tutorial";

        String[] parts = originalString.split(" ");
        String newString = parts[0] + " " + insert + " " + parts[1];
        
        System.out.println(newString);

	}

}
