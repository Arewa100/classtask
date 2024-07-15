public class Factorial {
	
	public int factorial(int number) {
		int productOfNumber = 1;
		while (number >= 1) {
			productOfNumber *= number;
			number = number - 1;
		}
	return productOfNumber;
}
}