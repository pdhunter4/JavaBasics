package hackerrank.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RajChallenge1 {

	public static void main(String[] args) {
		
		String[] a = {"Ava","Emma","Olivia"};
		String[] b = {"Olivia","Sophia","Emma"};
		
		List<String> list1 = new ArrayList<String>(Arrays.asList(a));
		list1.addAll(Arrays.asList(b));
		list1.stream().distinct().forEach(name -> System.out.print(name + " "));
	}

}
