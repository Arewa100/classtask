import java.util.Scanner;
public class WorldPopulation {
	public static void main(String[] args) {
		System.out.println("Welcome to my population growth rate calculator");
		
	Scanner input = new Scanner(System.in);
	
		
		long currentWorldPopulation;
		double growthRate;
		int numberOfYears;
		double sum;
		double result = 0;
		double estmatedPopulation;
	
	
		System.out.println("Enter the current world population");
			currentWorldPopulation = input.nextLong();

		System.out.println("Enter the annual growth rate");
			growthRate = input.nextDouble();
			
		System.out.println("Enter the number of years");
			numberOfYears = input.nextInt();
		
		sum = (1 + (growthRate/100));

		System.out.printf("%6s %10s %10s %n", "YEARS", "WORLD POPULATION", "NUMERICAL INCREASE");
		
		for(int count = 1; count <= numberOfYears; count++) {
			result = Math.pow(sum, count);
			estmatedPopulation = (currentWorldPopulation * result);
	
			System.out.printf("%5d %10.2f%n", count, estmatedPopulation);
		}
			
	
}

}