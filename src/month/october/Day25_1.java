package month.october;

public class Day25_1 {
	
	public static void main(String[] args) {
		
		Integer[] array = {10,3,null,5,6};
		int largestNo = array[0];
		int smallestNo = array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i] != null) {
				if(array[i] > largestNo) {
					largestNo = array[i];
				}else if(array[i] < smallestNo) {
					smallestNo = array[i];
				}
			}else {
				continue;
			}
		}
		
		System.out.println("Difference between " + largestNo + " & " + smallestNo + " : " + 
													(largestNo - smallestNo));
	}

}
