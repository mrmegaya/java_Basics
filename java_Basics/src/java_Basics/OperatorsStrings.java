package java_Basics;

public class OperatorsStrings {

	public static void main(String[] args) {
		// Operators
		 int a=3,b=2,c=4;
		System.out.println( a == b);	
		System.out.println(a !=b);
		System.out.println(a >b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println((a+b)<=c);
		
		//Strings
		String txt="MegayaJesu";
		String fg="  HI world   ";
		String ss="Megaya";
		System.out.println(a <=b);
		System.out.println("The string length is : "+fg.length());
		System.out.println("3th index of the given string is : "+txt.charAt(3));
		System.out.println("The stripped string is :"+fg.strip());
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		System.out.println(txt.compareToIgnoreCase(ss));
		System.out.println(txt.contains("z"));
		System.out.println(txt.contentEquals(ss));
		System.out.println(txt.isBlank());
		System.out.println(txt.substring(2));
		System.out.println(txt.substring(1, 5));

	}

}
