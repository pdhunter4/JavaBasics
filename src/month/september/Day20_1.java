package month.september;

import java.util.Arrays;
import java.util.List;

public class Day20_1 {

	public static void main(String[] args) {

		Integer[] array = {1,2,6,6,13,6,3};
		List<Integer> value = Arrays.asList(array);	//convert the Integer array in List
		
		// format the list if it contains unlucky number 13 in it exclude the element 
		if(value.contains(13))
			value = value.subList(0, value.indexOf(13));	
		// Now add the values in the stream
		Integer sum = value.stream()
						.reduce(0, (a, b) -> a + b);
		System.out.println("Sum of elements in the list: " + sum);
	}
}
