package oopsExamples;

public class StringExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String apple= ("  this is a  string  ");
		String sample=apple.concat("Added to the Old");
		System.out.println(sample);
		String bite=apple.replace("string", "STRING");
		System.out.println(bite);
		String max=apple.stripTrailing();
		System.out.println(max);
		String upp=apple.toUpperCase();
		System.out.println(upp);
		boolean contai=apple.contains("string");
		System.out.println(contai);
		int compareTo = apple.compareTo(upp);
		System.out.println(compareTo);
		boolean equalsIgnoreCase = apple.equalsIgnoreCase(bite);
		System.out.println(equalsIgnoreCase);
		String escape=("Hello! \"This is a string inside\" another String ");
		System.out.println(escape);

		//Strings
		String txt="MegayaJesu";
		String fg="  HI world   ";
		String ss="Megaya";
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
