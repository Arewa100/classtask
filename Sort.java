
import java.util.Arrays;
public class Sort {
	public static void main(String[] args) {
	
	int[] numbers = {5, 8, 3, 7, 4, 2};
	int[] newNumbers = new int[6];

		for(int index = 0; index < numbers.length; index++) {
			int max = 0;
			int min = 0;
			int value = numbers[index];
			int count;
			for(count = 0; count < numbers.length; count++) {
				
				if(numbers[count] <= value) {
					min = numbers[count];
				}
				value = min;

			}
		count = count + 1;
		newNumbers[index] = min;
		}
	System.out.print(Arrays.toString(newNumbers));
}
}