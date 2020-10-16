package month.september;

import java.util.Scanner;

public class Day14_1 {

	public static void main(String[] args) {
		
		System.out.println("Enter Word of Odd length and atleast 3 alphabets: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		if((word.length() % 2 != 0) && word.length() >= 3) {
			int index = word.length() / 2 ;
			index = index-1;
			word = word.substring(index, index + 3);
			System.out.println("Output: " + word);
		}else
			System.out.println("String should be of odd length and minimum of 3 alphabets.");
		sc.close();
	}

}
