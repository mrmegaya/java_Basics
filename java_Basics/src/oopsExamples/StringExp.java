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
		System.out.println("The string length is : "+fg.length());//Returns the length of this string. 
		System.out.println("3th index of the given string is : "+txt.charAt(3));//Returns the char value at the specified index. An index ranges from 0 to length() - 1. The first char value of the sequences at index 0, the next at index 1,and so on, as for array indexing. 
		System.out.println("The stripped string is :"+fg.strip());//Returns a string whose value is this string, with all leading and trailing white space removed. 
		System.out.println(txt.toUpperCase());//Converts all of the characters in this String to uppercase
		System.out.println(txt.toLowerCase());//Converts all of the characters in this String to lowercase
		System.out.println(txt.compareToIgnoreCase(ss));//Compares two strings lexicographically, ignoring case differences. 
		System.out.println(txt.contains("z"));//Returns true if and only if this string contains the specified sequence of char values.
		System.out.println(txt.contentEquals(ss));//Compares this string to the specified CharSequence. The result is true if and only if this String represents the same sequence of char values as the specified sequence. 
		System.out.println(txt.isBlank());//Returns true if the string is empty or contains only white space code points,otherwise false.
		System.out.println(txt.substring(2));//Returns a string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string. 
		System.out.println(txt.substring(1, 5));//Returns a string that is a substring of this string. 
		System.out.println(txt.concat(ss));//Concatenates the specified string to the end of this string. 
		System.out.println(txt.equals(ss));//Compares this string to the specified object. The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object. 
		System.out.println(txt.replace("Jesu", "Jesupillai"));//Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
		String joinstring=String.join(" ", txt, ss);
		System.out.println(joinstring);//Returns a new String composed of copies of the CharSequence elements joined together with a copy ofthe specified delimiter. 
		//For example, 
	     //String message = String.join("-", "Java", "is", "cool");
	     // message returned is: "Java-is-cool"

	}

}
