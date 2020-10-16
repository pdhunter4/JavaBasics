package month.september;

import java.util.Arrays;
import java.util.Scanner;

public class Day18_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		
		System.out.println("Occurence of cat/dog in the string is equal?: " + validateOccurenceEqual(input));
		sc.close();
	}
	
	public static boolean validateOccurenceEqual(String input) {
		// presence of cat word in the string
		int catOccurence = (input.length() - input.replace("cat", "").length()) / "dog".length();
		//presence of dog word in the string
		int dogOccurence = (input.length() - input.replace("dog", "").length()) / "cat".length();
		return (catOccurence == dogOccurence ? true : false);
	}

}
