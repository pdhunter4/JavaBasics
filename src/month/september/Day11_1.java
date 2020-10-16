package month.september;

import java.util.Scanner;

public class Day11_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String word = sc.nextLine();
		System.out.println("Enter index of the character you want to remove from above string: ");
		int index = sc.nextInt();
		System.out.println("Formatted String: " + removeCharacter(word, index));
		sc.close();
	}
	
	public static StringBuilder removeCharacter(String word,int index) {
		StringBuilder formatedString = new StringBuilder(word);
		if(index>=0 && index<=word.length()) {
			formatedString = formatedString.deleteCharAt(index);
			return formatedString;
		}else {
			System.out.println("Index not in range.");
			return formatedString;
		}
	}

}
