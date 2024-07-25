import java.util.Scanner;
import java.util.Arrays;
public class ArrayMain {
	public static void main(String[] args) {
		System.out.println("Welcome friend, Omo today is another day\n");

	Scanner input = new Scanner(System.in);
	
		
	int[] userInput = {-10, 2, 3, 5, 8, 9, 1, 3, 2, 4, 7};
	
	for(int counter = 0; counter < 	userInput.length; counter++) {


			int number = userInput[counter];
			userInput[counter] = (number * number); 
	}


	
	System.out.print(Arrays.toString(userInput));
	
	int[] sortedArray = new int[10];
	int minimum = 0;
	int value = 0;
	int counter;
	
	for(int count = 0; count < userInput.length; count++) {
		value = userInput[count];
			for(counter = 0; counter < userInput.length; counter++) {
				if(value <= userInput[counter]) {
					minimum = value;
				} else {
					minimum = userInput[count];
				}
			
			}

		sortedArray[count] = minimum;
		count = count + 1;
		value = userInput[count];
		counter = counter + 1;
	}




	System.out.print(Arrays.toString(sortedArray));
}
}