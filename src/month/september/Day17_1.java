package month.september;

import java.util.Scanner;

public class Day17_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		String newString = "";
		Character temp = null;
		for(int i=0;i<input.length();i++) {
			for(int j=0;j<2;j++) {
				temp = input.charAt(i);
				newString = newString.concat(temp.toString());
			}
		}
		
		System.out.println(newString);
		sc.close();
	}

}
