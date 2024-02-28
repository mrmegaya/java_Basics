package java_Basics_New;

public class WithoutLengthMethod {

	public static void main(String[] args) {
		String text="Hi This the length";
		char[] array= text.toCharArray();
		int length=0;
		for (char c : array) {
			length++;
		}
System.out.println(length);
	}

}
