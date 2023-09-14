package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What is your start amount?");
		int startAmount = in.nextInt();
		System.out.print("What is your win chance?");
		double winChance = in.nextDouble();
		System.out.print("What is your winLimit?");
		int winLimit = in.nextInt();
		System.out.print("How many days will you play?");
		int totalSimulations = in.nextInt();
		int win = 0;
		for (int i = 1; i <= totalSimulations; i++) {
			int remain = startAmount;
			while (remain > 0 && remain < winLimit) {
				if (Math.random() < winChance) {
					remain++;
				} else
					remain--;
			}
			if (remain != 0)
				win++;
		}
		double estimate = 1 - win * 1.0 / totalSimulations;
		System.out.println("Estimate ruin chance: " + estimate);
		double expectedRuin;
		if (winChance == 0.5) {
			expectedRuin = 1 - (startAmount * 1.0) / winLimit;
		} else {
			double alpha = (1 - winChance) * 1.0 / winChance;
			expectedRuin = (Math.pow(alpha, startAmount) - Math.pow(alpha, winLimit)) / (1 - Math.pow(alpha, winLimit));
		}
		System.out.println("Calculated win chance: " + expectedRuin);
	}
}
