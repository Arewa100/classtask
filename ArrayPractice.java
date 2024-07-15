import java.util.Arrays;
public class ArrayPractice {
	public static void main(String[] args) {
		System.out.println("Welcome to my array class"); 
	
	int[] numbers = {10, 20, 30, 40}; //this is static initialization method
	int[] scores = new int[10]; //using array constructor
	

	System.out.println("numbers: " + Arrays.toString(numbers));
	System.out.println("scores: " + Arrays.toString(scores));
}
}