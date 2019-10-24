import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		int low = 0, high = 0;

		Scanner sc = new Scanner(System.in);
		boolean isInt = false;
		System.out
				.println("The computer will guess your number in less than 10 guesses.\nPlease enter a number: ");

		do {
			if (sc.hasNextInt() == true) {
				low = sc.nextInt();
				break;
			} else {
				System.out.println("Please enter only NUMBERS!!!\nPlease enter a number: ");
				sc.next();
			}
		} while (isInt == false);
		System.out.println("Please enter another number:");

		do {
			if (sc.hasNextInt() == true) {
				high = sc.nextInt();
				break;

			} else {
				System.out.println("Please enter only NUMBERS!!!\nPlease enter a number: ");
				sc.next();
			}
		} while (isInt == false);

		Guesser g = new Guesser(low, high);
		g.start();
	}
}
