package month.september;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day21_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the Array: ");
		Integer input = sc.nextInt();
		System.out.println("Resultant array: " + createArray(input));
		sc.close();
	}
	
	public static List<Integer> createArray(Integer length) {
		List<Integer> list = new ArrayList<Integer>();
		if(length > 1) {
			for(int i=0;i<length;i++) {
				list.add(i);
			}
		}else {
			list.add(0);
		}
		return list;
	}

}
