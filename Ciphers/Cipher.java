public class Cipher {
	
	private char[] alphabets; 
	
	public Cipher() {
		char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
			
		this.alphabets = alphabets;
	}
	
	public String encrypt(String text) {    

		final int LENGTH_OF_TEXT = text.length();
		int counter = 0;
		String cipherText = "";
		
		
		while(counter < LENGTH_OF_TEXT) {
			char elementOfTheText = text.charAt(counter);   

			for(int alphabetIndex = 0; alphabetIndex < alphabets.length; alphabetIndex++) {

				if(elementOfTheText == alphabets[alphabetIndex])  {  
					if(elementOfTheText == 'x' || elementOfTheText == 'y' || elementOfTheText == 'z') {
						
						int currentIndex = 26 - alphabetIndex;
						int newIndex = 3 - currentIndex;
						char newCipherText = alphabets[newIndex];
						cipherText = cipherText + newCipherText;
						
					} else {    
						int newIndex = alphabetIndex + 3;
						char newCipherText = alphabets[newIndex];
						cipherText = cipherText + newCipherText;
					}  
				}
			}

			counter = counter + 1;
		}
		
		return cipherText;
	}
}