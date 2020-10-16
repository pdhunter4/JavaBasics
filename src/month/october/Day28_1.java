package month.october;

import java.util.Arrays;

public class Day28_1 {

	public static void main(String[] args) {
		int[] array = {1,7,1,7};
		if(Arrays.asList(array).contains(null)){
			System.out.println("Array cannot contain null values");
		}else {
			System.out.println("Is given array consist of consecutive 7's: " + checkArray(array));
		}
	}
	
	static boolean checkArray(int[] array) {
		for(int i=0;i<array.length - 1;i++) {
			if(array[i]==7 && array[i+1]==7)
				return true;
		}
		return false;
	}

}
