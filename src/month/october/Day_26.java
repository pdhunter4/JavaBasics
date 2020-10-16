package month.october;

import java.util.Arrays;

public class Day_26 {

	public static void main(String[] args) {
		Integer a[] = {9,3,5,4,6,7};
		if(Arrays.asList(a).contains(null)){
			System.out.println("Given array should not contain any null element");
		}else {
			System.out.println("O/P: " + Arrays.stream(a)
			.filter(num -> num!=6 && num!=7)
			.reduce(0, (ele1,ele2) -> ele1 + ele2));
		}
	}
}
