import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	Account feedback = new Account();

	System.out.print(" set your name:  ");
	String name = input.next();
	feedback.setName(name);

	System.out.print(feedback.getName());
}
}