package java_Basics_New;

public class Num_in_Count {

	public static void main(String[] args) {
		int NumCount=0;
		String given="Ab3cde5fi";
		int lengthof=given.length();
		for (int i = 0; i < lengthof; i++) {
			char character=given.charAt(i);
			if (Character.isDigit(character)) {
				NumCount=NumCount+Character.getNumericValue(character);
			}
		}
		System.out.println(NumCount);
	}
}
