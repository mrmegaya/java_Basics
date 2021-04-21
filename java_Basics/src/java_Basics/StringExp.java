package java_Basics;

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
		

	}

}
