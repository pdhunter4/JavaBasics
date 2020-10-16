package month.september;

import java.util.Scanner;

public class Day12_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String of even length: ");
		String input = sc.next();
		
		if(input.length() % 2 == 0){
			input = input.substring(0, input.length()/2);
			System.out.println("Formatted String: " + input);
		}else {
			System.out.println("String length is odd.");
		}
		
		
		sc.close();
	}

}
