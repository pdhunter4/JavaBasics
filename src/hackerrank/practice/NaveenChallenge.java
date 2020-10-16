package hackerrank.practice;

import java.util.Arrays;

public class NaveenChallenge {

	public static void main(String[] args) {

		String s = "Naveen automation labs is the best youtube software testing channel";
		String[] newArray = s.split(" ");
		Arrays.asList(newArray).stream()
					.filter(ele -> ele.length()>=5)
					.map(ele -> new StringBuffer(ele))
					.forEach(ele -> System.out.print(ele.reverse() + " "));

	}

}
