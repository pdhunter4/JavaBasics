package month.september;

import java.util.Scanner;

public class Day6ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter String to be reversed: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		/*
		 * This will reverse the string irrespective of what is present in the string special character/numeric
		 */
		System.out.println(reverse(input));
		
	}
	
	public static String reverse(String input) {
		StringBuilder str = new StringBuilder(input);
		String reverseString = str.reverse().toString();
		return reverseString;
	}
	

}
