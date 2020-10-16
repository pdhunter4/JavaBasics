package month.october;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day24_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Index(Only numbers): ");
		int start = sc.nextInt();
		System.out.println("Enter End Index(Only numbers): ");
		int end = sc.nextInt();
		sc.close();
		System.out.println("New Array: " + createNewArray(start,end));
	}
	
	private static List<String> createNewArray(int start,int end) {
		List<String> newArray = new ArrayList<String>();
		for(int i=start;i<end;i++) {
			if(i%3==0 && i%5==0) {
				newArray.add("HOP");
			}else if(i%3==0) {
				newArray.add("JUMP");
			}else if(i%5==0) {
				newArray.add("RUN");
			}else {
				newArray.add(String.valueOf(i));
			}
		}
		return newArray;
	}

}
