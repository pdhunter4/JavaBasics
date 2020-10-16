package month.september;

import java.util.Scanner;

public class Day2PrimeNumber {
	
public static void main(String[] args) {
		
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		System.out.println(num + " is a Prime number: " + isPrimeNumber(num));	
		
	}
	
	/*
	 * Logic : It should be divisible by itself 
	 * Note : 1 is not a prime number so always start the search from 2 as 2 is a lowest prime 
	 *        number negative integers are not considered as prime numbers
	 */
	public static boolean isPrimeNumber(Integer num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num % 2 == 0) {
				return false;
			}
		}
		return true;
	}
}
