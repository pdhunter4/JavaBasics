package month.october;

import java.util.Arrays;

public class Day_27 {

	public static void main(String[] args) {
		Integer a[] = {1,1,1,1,4,4,3};
		if(Arrays.asList(a).contains(null)){
			System.out.println("Given array should not contain any null element");
		}else {
			System.out.println(Arrays.stream(a).allMatch(num -> num==1 || num== 4));
		}
	}

}
