import java.util.Scanner;
public class myarraypractice {

	public static void main(String[] args) {

		System.out.println("Welcome my friend");

	Scanner input = new Scanner(System.in);

	String stringOne = "yes";
	String stringTwo = "";
	
		System.out.println("Enter yes to display what's in the statement below");
		stringTwo = input.nextLine();           
		

		if(stringOne == stringTwo) {

		System.out.println("it points to the same memory");
	} else {
		System.out.println("it is not pointing to each other");
	}
}
}