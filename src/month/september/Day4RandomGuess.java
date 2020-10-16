package month.september;

import java.util.Scanner;

public class Day4RandomGuess {

	public static void main(String[] args) {
		int retryCount = 1;
		while(retryCount<=5) {
			System.out.println("Enter Number(1 - 9): ");
			Scanner sc = new Scanner(System.in);
			Integer num = sc.nextInt();
			if(num >= 1 && num <= 9) {
				String result = "Congrats you won $10000";
				if(num > generateRandomNumber()) {
					result = "Your guess is too high. Try Again";
				}else if(num < generateRandomNumber()) {
					result = "Your guess is too low";
				}
				System.out.println(result);
			}else {
				System.out.println("Number out of Range");
			}
			retryCount++;
		}
	}
	public static int generateRandomNumber() {
		/*
		 * Random Number generation logic
		 */
		int randomInt = (int)(10.0 * Math.random());
		return randomInt;
	}
	
	

}
