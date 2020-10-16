package hackerrank.practice;

import java.util.LinkedHashSet;

public class Exercise1 {

	public static void main(String[] args) {
		/*
		 * Printing duplicate elements in an Integer array
		 */
		Integer[] array = new Integer[] {1, 2, 3, 4, 2, 7, 8, 8, 3};
		System.out.println("Duplicate Members in given array: ");
		printDuplicateElements(array);
	}
	
	public static void printDuplicateElements(Integer[] array) {
		LinkedHashSet<Integer> updatedArray = new LinkedHashSet<Integer>();
		for(int i=0;i<array.length;i++) {
			if(updatedArray.add(array[i]) == false) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
