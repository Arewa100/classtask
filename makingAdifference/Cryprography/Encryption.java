public class Encryption {
	public static void main(String[] args) {
		int numbers = -1678;
		int fourth = (numbers % 10) + 3;   //8
		int firstDivision = numbers / 10; 
		int third = (firstDivision % 10) + 3; 
		int secondDivision = firstDivision / 10;
		int second = (secondDivision % 10) + 3;
		int first = (secondDivision / 10) + 3;

		int firstNumber = (first % 10);
		int secondNumber = (second % 10);
		int thirdNumber = (third % 10);
		int fourthNumber = (fourth % 10);

		int[] numberSwap = {thirdNumber, fourthNumber, firstNumber, secondNumber};

		int newNumber = 0;
		String newStringedNumber = "";

			for(int count = 0; count < numberSwap.length; count++) {
				
				newStringedNumber = newStringedNumber + numberSwap[count];
			}

		System.out.print(newStringedNumber); 
}
}