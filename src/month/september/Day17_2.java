package month.september;

import java.util.Scanner;

public class Day17_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		
		
		int occurence = (input.length() - input.replace("code", "").length()) / "code".length();
		
		
		System.out.println("Occurence of 'code' in word: " + occurence);
		sc.close();
	}

}
