import java.util.Scanner;

public class MinimumMaximum {
	public static void main(String[] args) {
		System.out.println("welcome friend. We are checking for the minimum and maximum number in an entry of ten numbers");
		
	Scanner input = new Scanner(System.in);
	
	int minimum = Integer.MAX_VALUE;
	int maximum = Integer.MIN_VALUE;
	int counter = 1;
	int number = 0;
		
	while(counter <= 10) {
		System.out.print("Enter a number:  ");
			number = input.nextInt();
	
		if(maximum < number) {
			maximum = number;
		} else if(number < minimum) {
			minimum = number;

		}
		counter = counter + 1;
	}
	System.out.printf("the minimum value is %d, and the maximum value is %d", minimum, maximum); 
}
}