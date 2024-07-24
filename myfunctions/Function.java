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
	
	int numberReverse = 0;
		while(number != 0) {

		numberReverse = numberReverse * 10 + (number % 10);
		number = number / 10;
		}

	return numberReverse;
}
	public int power(int firstNumber, int secondNumber) {
		int counter = 1;
		int exponent = 1;

		if(secondNumber == 0) {
		    	return exponent;

		} else {
			while(counter <= secondNumber) { 
				exponent = (exponent * firstNumber);

			counter = counter + 1;
			}
		      	return exponent;
		}
}
	public static void sort(int[] numbers) {        [22, 33, 11, 4, 19]
		int[] newNumber = new int[];
		
		for(int index = 0; index < numbers.length; index++) {
			int max = 0;
			int min = 0;	
			int value = numbers[index];
			for(int count = 0; count < numbers.length; count++) {
				if(value <= numbers[count]) {
					min = value;
				} else {
					min = numbers[count];

				}

			}
		}
}
}