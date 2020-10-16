package hackerrank.practice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		
		System.out.println(input.split("code").length);
		sc.close();

	}

}
