package month.september;

import java.util.Scanner;

public class Day19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//tca --> cat  tcagdo --> catdog
		//abc --> bca
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		String formattedString = "";
		Character temp;
		
		StringBuilder sb = new StringBuilder(input);
		input = "";
		while(sb.length()>=1) {
			if(sb.length()>=3) {
				formattedString = sb.substring(0, 3);
				sb = sb.delete(0, 3);
				temp = formattedString.charAt(0);
				formattedString = formattedString.substring(1, 3);
				formattedString = formattedString.concat(temp.toString());
				input = input.concat(formattedString);
			}else {
				formattedString = sb.toString();
				input = input.concat(formattedString);
				sb.delete(0, sb.length());
			}
		}
		System.out.println("Formatted O/P: " + input);
		
		sc.close();
	}
}
