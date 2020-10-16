package month.september;

import java.util.Scanner;

public class Day16_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		System.out.println("Does the given string contains bad word in it?: " + isStringBad(input));
		
		sc.close();
	}
	
	public static boolean isStringBad(String input) {
		if(input.substring(0, 3).contains("bad") || input.substring(1, 4).contains("bad"))
			return true;
		return false;
	}

}
