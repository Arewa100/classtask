import java.util.Scanner;

public class TenScoresTwo {
	public static void main(String[] args) {
		System.out.println("Welcome to Forcados High School");
	
	Scanner input = new Scanner(System.in);
	
	int firstScore = 0;
	int secondScore = 0;
	int thirdScore = 0;
	int fourthScore = 0;
	int fifthScore = 0;
	int sixthScore = 0;
	int seventhScore = 0;
	int eightScore = 0;
	int ninthScore = 0;
	int tenthScore = 0;
	
	for(int counter = 1; counter <= 10; counter++) {
			int number;
		System.out.println("Enter a score");
			number = input.nextInt();
		if(counter == 1 && number % 2 == 0) {
		firstScore = number;
	}	else if(counter == 2 && number % 2 == 0) {
		secondScore = number;
	}	else if(counter == 3 && number % 2 == 0) {
		thirdScore = number;
	}	else if(counter == 4 && number % 2 == 0) {
		fourthScore = number;
	}	else if(counter == 5 && number % 2 == 0) {
		fifthScore = number;
	}	else if(counter == 6 && number % 2 == 0) {
		sixthScore = number;
	}	else if(counter == 7 && number % 2 == 0) {
		seventhScore = number;
	}	else if(counter == 8 && number % 2 == 0) {
		eightScore = number;
	}	else if(counter == 9 && number % 2 == 0) {
		ninthScore = number;
	}	else if(counter == 10 && number % 2 == 0) {
		tenthScore = number;
	}	


}

	System.out.printf("%d, %d, %d, %d, %d, %d, %d, %d, %d, %d", firstScore, secondScore, thirdScore, fourthScore, fifthScore, sixthScore, seventhScore, eightScore, ninthScore, tenthScore);

}
}