package month.september;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day5Calender {

	public static void main(String[] args) {
		
		int position = 0;
		System.out.println("Enter Day: ");
		Scanner sc = new Scanner(System.in);
		String weekDay = sc.next();
		System.out.println("Enter Number of Days: ");
		int noOfDays = sc.nextInt();
		
		List<String> daysList = Arrays.asList("Monday", "Tuesday", "Wednesday","Thursday", "Friday","Saturday", "Sunday");
		
		
		//Initialize all days with count 4 as the minimum no of occurence of days in a month is 4
		int[] count = new int[7];
		for(int i=0;i<count.length;i++) {
			count[i] = 4;
		}
		
		//Get the position of the entered day
		for(int i=0;i<daysList.size();i++) {
			if(weekDay.equals(daysList.get(i))) {
				position = i;
				break;
			}
		}
		
		int incrementer = 0;
		incrementer = noOfDays % 7;
		System.out.println(incrementer);
		
		//Mark day to 5 Selected day and the next day 
		for(int i = position;i<position + incrementer;i++) {
			if(i>6) {
				count[i % 7] = 5;	//If it is greater than 6th days as the index is upto 6
			}else {
				count[i] = 5;	//If it is with 6 days 
			}
		}
		
		for (int i = 0; i < daysList.size(); i++)  
        { 
            System.out.println(daysList.get(i) + " " + count[i]); 
        } 

	}

}
