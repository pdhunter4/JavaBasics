package hackerrank.practice;

public class Practice2 {

	public static void main(String[] args) {

		System.out.println(driver("cccodecodecodecc"));

	}
	
	public static int driver(String s) {
		int count = 0;
		for(int i = 1;i<s.length()-2;i++) {
			if(s.substring(i - 1 , i + 3).equals("code")){
				count++;
			}
		}
		
		return count;
		
	}

}
