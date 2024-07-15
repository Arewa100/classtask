import java.util.Scanner;

public class TenScores {
	public static void main(String[] args) {
		System.out.println("Welcome to Forcados High School");
	
	Scanner input = new Scanner(System.in);
	
	int firstScore;
	int secondScore;
	int thirdScore;
	int fourthScore;
	int fifthScore;
	int sixthScore;
	int seventhScore;
	int eightScore;
	int ninthScore;
	int tenthScore;

	System.out.println("Enter score one");
		firstScore = input.nextInt();

	System.out.println("Enter score two");
		secondScore = input.nextInt();

	System.out.println("Enter score three");
		thirdScore = input.nextInt();

	System.out.println("Enter score four");
		fourthScore = input.nextInt();

	System.out.println("Enter score five");
		fifthScore = input.nextInt();

	System.out.println("Enter score six");
		sixthScore = input.nextInt();

	System.out.println("Enter score seven");
		seventhScore = input.nextInt();

	System.out.println("Enter score eight");
		eightScore = input.nextInt();

	System.out.println("Enter score nine");
		ninthScore = input.nextInt();

	System.out.println("Enter score ten\n");
		tenthScore = input.nextInt();

	System.out.printf("%d, %d, %d, %d, %d, %d, %d, %d, %d, %d", firstScore, secondScore, thirdScore, fourthScore, fifthScore, sixthScore, seventhScore, eightScore, ninthScore, tenthScore);
}
}