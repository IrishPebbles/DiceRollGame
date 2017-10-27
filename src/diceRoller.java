
/*
 * Lena Hand 10/16/2017
 * 
 * This is a Java program which will prompt the user to choose a number of sides for a die, 
 * then simulate rolling 2 of those dice.
 */

import java.util.Random;
import java.util.Scanner;

public class diceRoller {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int dieSides = 3;
		int roll = 1;
		char userChoice = 'y';

		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println();

		System.out.print("How many sides should each die have? (3 or more)");
		dieSides = scnr.nextInt();
		// FIXME: method here to test for die sides and other user input

		while (userChoice == 'y' || userChoice == 'Y') {
			System.out.println("Roll " + roll + ": ");
			System.out.println(dieToss(dieSides));
			System.out.println(dieToss(dieSides));

			System.out.println();

			roll++;

			do {
				System.out.print("Would you like to roll again? (y/n) ");
				userChoice = scnr.next().charAt(0);
			} while (userChoice != 'n' && userChoice != 'N' && userChoice != 'y' && userChoice != 'Y');

			System.out.println();
		}

		scnr.close();

	}

	public static int dieToss(int numSides) {
		Random r = new Random();
		int roll = r.nextInt(numSides) + 1;
		return roll;

	}

}
