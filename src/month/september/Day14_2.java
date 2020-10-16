package month.september;

import java.util.Scanner;

public class Day14_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String: ");
		String input1 = sc.nextLine();
		System.out.println("Enter 2nd String: ");
		String input2 = sc.nextLine();
		
		if(input1.isEmpty())
			input1 = "@";
		else if(input2.isEmpty())
			input2 = "@";
		
	
		char first = input1.charAt(0);
		char last = input2.charAt(input2.length()-1);
		String finalString = Character.toString(first).concat(Character.toString(last));
		System.out.println("New String: " + finalString);
		
		sc.close();
	}

}
