package hackerrank.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SeperateWordsWhichHaveCaps {

	public static void main(String[] args) {

		String input = "IAmASoftwareTestEngineer";
		StringBuilder sBuild = new StringBuilder();
		for(int i=0;i<input.length();i++) {
			//Checks that character at string is a Capital letter or small letter
			if(Pattern.matches("[A-Z]", String.valueOf(input.charAt(i)))) {
				if(i!=0) {						//If it is other than 1st character and capital letter 
					sBuild.append(" ");
					sBuild.append(input.charAt(i));
				}else							//If it is char from the word and capital char
					sBuild.append(input.charAt(i));
			}else								//If it is not a capital letter
				sBuild.append(input.charAt(i));
		}
		System.out.println(sBuild.toString());
	}

}
