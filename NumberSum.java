import java.util.Scanner;

public class NumberSum {
	public static void main(String[] args) {
		System.out.println("welcome friend\n");
	
	Scanner input = new Scanner(System.in);

	int number = 0;
	int counter = 1;
	int evenNumberSum = 0;
	int oddNumberSum = 0;
	
	while(counter <= 10) {
		System.out.print("Enter a number:  ");
			number = input.nextInt();

			int firstInstance = (number % 2);
			int secondInstance = (number % 2);

		if(firstInstance == 0) {
			evenNumberSum = evenNumberSum + number;
		} else if(secondInstance == 1) {
			oddNumberSum = oddNumberSum + number;
		}
		counter = counter + 1;
	}
		System.out.printf("the sum of the even number is %d and sum of odd numbers is %d", evenNumberSum, oddNumberSum);
} 
}