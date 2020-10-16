package month.september;

import java.util.Scanner;

public class Day7_OverspeedCharges {

	public static void main(String[] args) {
		String[] ticket = {"Invalid","No Ticket","Small Ticket","Big Ticket"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Speed: ");
		Integer speed = sc.nextInt();
		System.out.println("Is it your birtday(Y/N): ");
		String birtday = sc.next();
		
		int cond1,cond2,cond3 = 0;
		speed = (birtday.equalsIgnoreCase("Y")) ? speed - 5 : speed;
		cond1 = (speed <= 60) ? 1 : 0;
		cond2 = (speed >= 61 && speed <= 80) ? 2 : 0;
		cond3 = (speed >= 81) ? 3 : 0;
		
		int resultant = cond1 | cond2 | cond3;
		System.out.println(ticket[resultant]);
		sc.close();
	}
}
