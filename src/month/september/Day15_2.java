package month.september;

import java.util.Scanner;

public class Day15_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String: ");
		String input1 = sc.nextLine();
		System.out.println("Enter 2nd String: ");
		String input2 = sc.nextLine();
		String finalString = "";
		finalString = input1.concat(input2);
		finalString = finalString.concat(input2);
		finalString = finalString.concat(input1);
		System.out.println(finalString);
	}

}
