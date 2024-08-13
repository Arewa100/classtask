import java.util.Arrays;
public class bubblesort {
	public static void main(String[] args) {
		
	int[] numbers = {5, 1, 3, 9, 10, 4, 8, 7, 6, 2};

	for(int count = 0; count < numbers.length; count++) {
		for(int index = count + 1; index < numbers.length; index++) {
			if(numbers[count] > numbers[index]) { 
			numbers[index] = numbers[count] + numbers[index];
			numbers[count] = numbers[index] - numbers[count];  
			numbers[index] = numbers[index] - numbers[count];
			System.out.println(numbers);
			
			
			}
		}
	}
	System.out.println(Arrays.toString(numbers));	
}
}