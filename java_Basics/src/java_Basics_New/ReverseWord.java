package java_Basics_New;

public class ReverseWord {

	public static void main(String[] args) {

		String given="This Is tough World";
		String revered="";
		String[] StringArray= given.split(" ");
		for (int i=StringArray.length-1; i >=0; i--) {
			revered=revered+StringArray[i]+" ";
		}

		System.out.println(revered);

	}

}
