public class Cryptography {
	
	public int encrypt(String userInput) {
		
		int numbers = Integer.parseInt(userInput);   
		
		int fourth = (numbers % 10) + 7;
		int firstDivision = numbers / 10;
		int third = (firstDivision % 10) + 7; 
		int secondDivision = firstDivision / 10;
		int second = (secondDivision % 10) + 7;
		int first = (secondDivision / 10) + 7;

		int firstNumber = (first % 10);
		int secondNumber = (second % 10);
		int thirdNumber = (third % 10);
		int fourthNumber = (fourth % 10);
		
		Cryptography data = new Cryptography();
		int result = data.swap(firstNumber, secondNumber, thirdNumber, fourthNumber);
		
	return result;
		
			
		
}
	public int swap(int firstnumber, int secondnumber, int thirdnumber, int fourthnumber) {
		
		
		int[] numberSwap = {thirdnumber, fourthnumber, firstnumber, secondnumber};
		int newNumber = 0;
		for(int counter = 0; counter < 1; counter++) {
			newNumber = numberSwap[counter];
			for(int count = 1; count < numberSwap.length; count++) {
				newNumber = (newNumber * 10);
				newNumber = newNumber + numberSwap[count]; 
			}
		}

	return newNumber;

}
		public String decrypt(int numbers) {
		
		int fourth = (numbers % 10) + 3;
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

		String newStringedNumber = "";

			for(int count = 0; count < numberSwap.length; count++) {
				
				newStringedNumber = newStringedNumber + numberSwap[count]; 
			}

		return newStringedNumber;
		
}
} 