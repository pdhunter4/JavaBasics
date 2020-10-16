package month.october;

import java.util.Arrays;

public class Day29_1 {

	public static void main(String[] args) {
		int[] array = {18,15,4};
		if(Arrays.asList(array).contains(null)){
			System.out.println("Array cannot contain null values");
		}else {
			System.out.println("Is given array consist of 3 increasing adjacent numbers: " + checkArray(array));
		}
	}
	
	static boolean checkArray(int[] array) {
		for(int i=0;i<array.length - 2;i++) {
			if((array[i + 1] - array[i] == 1) && (array[i + 2] - array[i + 1] == 1))
				return true;
		}
		return false;
	}
}
