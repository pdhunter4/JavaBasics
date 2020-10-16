package month.september;

import java.util.Scanner;

public class Day12_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String: ");
		String input1 = sc.next();
		System.out.println("Enter 2nd String: ");
		String input2 = sc.next();
		StringBuilder formattedString = null;
		String concatenated = input1.concat(input2);
		if(concatenated.length()>1) {
			formattedString = new StringBuilder(concatenated);
			formattedString = formattedString.deleteCharAt(0);
			System.out.println("Formatted String: " + formattedString);
		}else {
			System.out.println("String length is less than minimum.");
		}
		sc.close();
	}

}
