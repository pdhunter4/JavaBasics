package month.september;

import java.util.Scanner;

public class Day2Factorial {
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		System.out.println(fact(num));
	}
	/*
	 * Factorial : Using recursion to achieve factorial
	 * example : 3 = 3 * 2 * 1
	 *           5 = 5 * 4 * 3 * 2 * 1
	 *           
	 */
	public static int fact(Integer num) {
		if(num <= 0)
			return 1;
		else 
			return (num * fact(num - 1));
	}

}
