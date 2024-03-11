package java_Basics_New;

import java.util.Iterator;

public class NoOfVowels {

	public static void main(String[] args) {
		int VowelCount=0;
		String given="Ab3cde5fi";
		String formatted=given.replace(" ", "").toLowerCase();
		System.out.println(formatted);
		int lentghof=formatted.length();
		System.out.println(lentghof);
		for (int i = 0; i < lentghof; i++) {
			if (formatted.charAt(i)=='a'||formatted.charAt(i)=='e'||formatted.charAt(i)=='i'
					||formatted.charAt(i)=='o'||formatted.charAt(i)=='u') {
				VowelCount=VowelCount+1;
			}
		}
		System.out.println(VowelCount);
	}

}
