package Uppgift;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner inputTxt = new Scanner(System.in);

		String pass;
		// password try limit
		int counter = 3;
		// current password try
		int currentCount = 0;
		// enter a boolean to capture access allowed
		boolean accessAllowed = false;

		// let user try to enter password and test condition
		// number of tries should not be more than allowed
		while (currentCount < counter && accessAllowed != true) {
			// add one to our currentCount; attempt to enter password
			currentCount++;

			System.out.println("Enter your password:");
			pass = inputTxt.nextLine();

			if (pass.equals("icecream")) {
				System.out.println("Welcome");
				// set access allowed to true
				accessAllowed = true;
			} else {
				// let the user know that limit is exceeded
				if (currentCount == counter) {
					System.out.println("Access not allowed! You have exceeded your limit");
				} else {
					System.out.println("OOPS! Try again");
				}

			}
		}

	}
}
