package homework;

public class LargestElement {

	public static void main(String[] args) {
		
		  int[] numbers = {23, 49, 67, 17, 99, 38};
	        int max = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	        }

	        System.out.println("The largest element in the array is: " + max);
	}

}
