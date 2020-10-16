package month.october;

public class Day30_1 {

	public static void main(String[] args) {
		int[] array = {0,1,0};
		int highestOddValue = 0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i] == 0) {
				for(int j=i;j<array.length;j++) {
					if(array[j] % 2 != 0) {
						if(array[j] > highestOddValue) {
							highestOddValue = array[j];
						}
					}
				}
				array[i] = highestOddValue;
			}
			highestOddValue = 0;
		}
		System.out.println("Resultant Array: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
	}
}
