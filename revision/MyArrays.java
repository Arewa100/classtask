public class MyArrays {
	public static void main(String[] args) {
	
	final int ARRAY_LENGTH = 10;
	int total = 0;
	int[] storage = new int[ARRAY_LENGTH];
	
	for(int counter = 0; counter < storage.length; counter++) {
		storage[counter] = 2 + 2 * counter;
	}
	
	System.out.printf("%5s%10s%n", "index", "value");
	
	for(int counter = 0; counter < storage.length; counter++) {
		System.out.printf("%5d%10d%n", counter, storage[counter]);
	}
	
	for(int counter = 0; counter < storage.length; counter++) {
		total = total + storage[counter];
	}	
	System.out.print(total);
	
}
}