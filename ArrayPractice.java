import java.util.Arrays;
public class ArrayPractice {
	public static void main(String[] args) {
		System.out.println("Welcome to my array class"); 
	
	int[] collections = new int[10];
	int numbers = 1;
	
	for(int index = 0; index < collections.length; index++) {
		collections[index] = numbers;
		
		numbers = numbers + 1;
	}

	System.out.println(Arrays.toString(collections));

	int total = 0;
	for(int counter = 0; counter < collections.length; counter++) {
		System.out.printf("%d %n", collections[counter]);
		total = total + collections[counter];
	}

	System.out.printf("the total is %d%n%n", total);
	
	int[] evenIndexes = new int[10];
	int number = 1;

	for(int index = 0; index < evenIndexes.length; index++) {
		if(index % 2 == 0) {
			evenIndexes[index] = number;
		number = number + 1;
		}
	}

	System.out.println(Arrays.toString(evenIndexes));
	for(int counter = 0; counter < evenIndexes.length; counter++) {
		System.out.printf("%d %n", evenIndexes[counter]);
	}
	

	int[] oddIndexes = new int[10];
	
	int numberr = 1;
	for(int index = 0; index < oddIndexes.length; index++) {
		if(index % 2 != 0) {
			oddIndexes[index] = numberr;
		numberr = numberr + 1;
	}
	}
	System.out.println(Arrays.toString(oddIndexes));
	for(int counter = 0; counter < oddIndexes.length; counter++) {
		System.out.printf("%d %n", oddIndexes[counter]);
	}
		
	int[] storage = new int[10];
	int reverseNumber = 10;
	for(int index = 0; index < storage.length; index++) {
	storage[index] = reverseNumber;
	reverseNumber = reverseNumber - 1;
	}
	System.out.println(Arrays.toString(storage));
}
}