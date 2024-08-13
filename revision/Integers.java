import java.util.Scanner;

public class Integers {
	public static void main(String[] args) {
		System.out.println("Welcome to my revision code");
	
	Scanner input = new Scanner(System.in);

	
	int number = 0;
	int counter = 1;

	int maxNumber  = 0;
	int smallNumber = 0;
	int divisibleByThree = 0;
		
	
	while(counter <= 5) {
		System.out.println("enter an integer");
			number = input.nextInt();
		if(number > maxNumber)  {
		 maxNumber = number;
}		else if(number < maxNumber) {
			smallNumber = number;
}		
		counter = counter + 1;	
}
		System.out.printf("%d is the maximum number%n", maxNumber);
		System.out.printf("%d is the smallest number%n%n", smallNumber);

		if(maxNumber % 3 == 0) {

		System.out.printf("%d is divisble by 3", divisibleByThree);
}

}

}