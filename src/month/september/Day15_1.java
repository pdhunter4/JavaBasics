package month.september;

import java.util.Scanner;

public class Day15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		String dummy = "";
		
		if(!input.isEmpty()) {
			if(input.length()>=2)
				input = input.substring(0,2);
			else if(input.length() < 2)
				input = input.substring(0, 1);
			for(int i=0;i<3;i++) {
				dummy = dummy.concat(input);
			}
			
		}else
			System.out.println("Input cannot be empty.");
		System.out.println(dummy);
		sc.close();

	}

}
