package month.september;

import java.util.Scanner;

public class Day6ElectricityConsumptionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter unit consumption: ");
		Scanner sc = new Scanner(System.in);
		int unitConsumption = sc.nextInt();
		
			try {
				if(unitConsumption > 0)
					System.out.println("Your Bill amount is: "+calculateConsumption(unitConsumption));
				else
					System.out.println("Your consumtion is 0 for this month.So no bill is generated.");
			}catch (Exception e) {
				System.out.println("Entered number should be numeric.");
			}
	}
	
	public static int calculateConsumption(int units) {
		int billAmount = 0;
		if(units >=1 && units <=100) 
			billAmount = units * 10;
		else if(units >=101 && units <= 200)
			billAmount = units * 15;
		else if(units >= 201 && units <= 300)
			billAmount = units * 20;
		else
			billAmount = units * 25;
		return billAmount;
	}

}
