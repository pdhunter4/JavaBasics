package month.september;

public class Day22_1 {

	public static void main(String[] args) {

		Integer[] array = new Integer[] {};
		System.out.println("Is resultant array consist of consecutive odd/even "
				+ "values in a group of 3?: " + Day22_1.evaluateArray(array));

	}
	
	public static boolean evaluateArray(Integer[] array) {
		if(array == null || array.length == 0)
			return false;
		
		/*
		 *  here we are grouping 3 Integer elements so we are 
		 *  iterating length - 2 times
		 *  Here when modulus of no is done by 2 either result is 0(Even)/ 1(Odd)
		 *  So we need to check any consecutive numbers are same in a group of 3
		 */
		 
		
		for(int i=0;i<array.length-2;i++) {
			if(array[i] % 2 == array[i+1] % 2 &&
					array[i+1] % 2 == array[i+2] % 2 ) {
				return true;
			}
		}
		return false;
	}

}
