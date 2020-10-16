package hackerrank.practice;

import java.util.Scanner;

public class LeftRotateArray {

	public static void main(String[] args) {

		Integer[] array = new Integer[] {6,2,5,3};
		System.out.println("How many times to rotate the array in left direction: ");
		Scanner sc = new Scanner(System.in);
		Integer rotationTimes = sc.nextInt();
		System.out.println("Original Array: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		//Now Left rotate the array 
		rotateArray(array,rotationTimes);
		System.out.println();
		System.out.println("Rotated " + rotationTimes + " times: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		sc.close();
	}
	
	public static void rotateArray(Integer[] array,Integer rotationTimes) {
		int index = 0,first = 0;
		
		for(int rotationCount=0;rotationCount<rotationTimes;rotationCount++) {
			first = array[0];
			for(index=0;index<array.length-1;index++) {
				array[index] = array[index+1];
			}
			array[index] = first;
		}
		
	}

}
