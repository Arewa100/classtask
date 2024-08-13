import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		System.out.println("Welcome my friend.....omo we must pay this loan O!!!\n");
	
	Scanner input = new Scanner(System.in);
	
	double loan = 0;
	double rate;
	int years;
		
	System.out.print("Enter your loan amount:  ");
		loan = input.nextDouble();
	
	System.out.print("Enter the interest rate:  ");
		rate = input.nextInt();
	
	System.out.print("Enter the years:  ");
		years = input.nextInt();
		
	int numberOfMonth = (years * 12);
	
	double requiredRate = (rate/100);    
	
	int counter = 1;
	
	System.out.printf("%10s %20s %n", "YEAR", "LOAN-AMOUNT");

	while(counter <= numberOfMonth) {

		double montlyIncrement = (requiredRate * loan);
		loan = (loan + montlyIncrement); 
		
	
		System.out.printf("%10d %20.2f %n", counter, loan);
	
		counter = counter + 1;
		
	}

	System.out.printf("Omo you done enter an only you %.2f after %d years", loan, years);
}
}
