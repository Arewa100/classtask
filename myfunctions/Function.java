public class Function {
	
	public int factorial(int number) {
		int productOfNumber = 1;
		while (number >= 1) {
			productOfNumber *= number;
			number = number - 1;
		}
	return productOfNumber;
}
	public int reverse(int number) {
	
	int numberReverse = 0
	while(number != 0) {
		numberReverse = numberReverse * 10 + numberReverse % 10;
	}
	}
}