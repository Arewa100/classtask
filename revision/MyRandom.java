import java.security.SecureRandom;
public class MyRandom {
	public static void main(String[] args) {
	
	System.out.println("Testing Random numbers");
	
	SecureRandom randomNum = new SecureRandom();

	int randomValue = 1 + randomNum.nextInt(10);

	System.out.printf("%d", randomValue);
}
}