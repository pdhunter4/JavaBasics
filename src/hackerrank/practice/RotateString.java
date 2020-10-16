package hackerrank.practice;

import java.util.Scanner;

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to be rotated: ");
		String input = sc.nextLine();
		System.out.println("Enter no. of rotation: ");
		Integer rotation = sc.nextInt();
		StringBuilder sBuild = new StringBuilder();
		Character firstLetter;
		
		for(int i=0;i<rotation;i++) {
			sBuild.delete(0, sBuild.length());
			firstLetter = input.charAt(0);
			for(int j=0;j<input.length()-1;j++) {
				sBuild.append(input.charAt(j+1));
			}
			sBuild.append(firstLetter);
			input = sBuild.toString();
		}
		System.out.println(input);
		sc.close();
	}

}
