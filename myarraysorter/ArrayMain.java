import java.util.Scanner;
import java.util.Arrays;
public class ArrayMain {

	public static void main(String[] args) {
		System.out.println("Welcome friend, Omo today is another day\n");

	Scanner input = new Scanner(System.in);

	ArrayMain feedback = new ArrayMain();
		
	int[] userInput = {10, 3, 5, 8, 9, 1, 3, 2, 4, 7};

	int[] result = feedback.arraysorter(userInput);


	System.out.print(Arrays.toString(result));

}



	public int[] arraysorter(int[] numbers) {
	
	int counter = 0;
	while(counter < numbers.length) {  
		int count = counter + 1;

		while(count < numbers.length) {
			if(numbers[counter] > numbers[count]) {
				numbers[counter] = numbers[counter] + numbers[count]; 	
				numbers[count] = numbers[counter] - numbers[count];		
				numbers[counter] = numbers[counter] - numbers[count];         
			}
		count = count + 1;
		}

	counter = counter + 1;
	}
		

	return numbers;
		
}
}