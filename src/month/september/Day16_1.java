package month.september;

import java.util.Scanner;

public class Day16_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		System.out.println("Enter count of character to be removed from the String: ");
		int count = sc.nextInt();
		String dummy = "";
		
		if(count < input.length()) {
			dummy = input.substring(0, count);
			input = input.substring((input.length() - count), input.length());
			dummy = dummy.concat(input);
			System.out.println(dummy);
		}
		else 
			System.out.println("Count must be less than the length of the string.");
		
		sc.close();
	}

}
