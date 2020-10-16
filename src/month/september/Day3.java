package month.september;

import java.util.LinkedList;

public class Day3 {

	public static void main(String[] args) {
		String[] array = {"A","B","C","D","E","F","G"};
		/*
		 * Task 1 - o/p ---> "A";"B";"C";"D";"E";"F";"G";"NOW I KNOW MY ABCs"]
		 */
		LinkedList<String> strList = new LinkedList<String>();
		for(int i=0;i<array.length;i++) {
			strList.add(array[i]);
		}
		strList.addLast("NOW I KNOW MY ABCs");
		System.out.println(strList + "--------------------->  O/P 1 ");
		
		/*
		 * Task 2 - o/p ---> ["123456";"A";"B";"C";"D";"E";"F";"G";"NOW I KNOW MY ABCs"]
		 */
		strList.addFirst("123456");
		System.out.println(strList + "--------------------->  O/P 2 ");
		
		/*
		 * Task 3 - o/p --->  ["123456";"A";"B";"C";"NOW I KNOW MY ABCs"]
		 * Remove  ["D";"E";"F";"G"]
		 */
		strList.remove("D");
		strList.remove("E");
		strList.remove("F");
		strList.remove("G");
		System.out.println(strList + "--------------------->  O/P 3 ");

	}

}
