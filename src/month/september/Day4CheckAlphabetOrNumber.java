package month.september;

import java.util.Scanner;

public class Day4CheckAlphabetOrNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int retry = 10;
		while(retry!=0) {
			System.out.println("Enter Character: ");
			Scanner sc = new Scanner(System.in);
			Character input = sc.next().charAt(0);
			/*
			 * To check whether it is an alphabet or number or a special character we must check its ASCII value
			 */
			System.out.println(isAlphabetOrNumber(input));
			retry--;
		}
		
	}
	
	public static String isAlphabetOrNumber(Character input) {
		String msg = null;
		if((input >= 97 && input <= 122) || (input >= 65 && input <= 90)) 
			msg = "AN ALPHABET! I can read your mind";
		else if(input >= 48 && input <= 57) 
			msg = "A NUMBER! I can read your mind";
		else
			msg = "Not a valid input.Try again.";
		return msg;
	}

}
