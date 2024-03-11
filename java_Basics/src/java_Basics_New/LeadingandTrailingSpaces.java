package java_Basics_New;

public class LeadingandTrailingSpaces {
	static String given="   Remove Space   ";


	public void stripping()
	{
		//using Strip function
		System.out.println("Using strip() :"+given.strip());
		System.out.println("Using stripLeading() :"+given.stripLeading());
		System.out.println("Using stripTrailing() :"+given.stripTrailing());
		//using Trim function
		System.out.println("Using trim() :"+given.trim());
		//using Regular Expression
		// strip Leading and Trailing Regular Expression
		System.out.println("strip Leading and Trailing Regular Expression :"+given.replaceAll("^[ \t]+| [ \t]+$","" ));
		// strip Leading Regular Expression
		System.out.println("Using strip Leading Regular Expression :"+given.replaceAll("^[ \t]+|","" ));
		//strip Trailing Regular Expression
		System.out.println("Using strip Trailing Regular Expression :"+given.replaceAll("[ \t]+$","" ));
	}
	public static void main(String[] args) {
		LeadingandTrailingSpaces obj=new LeadingandTrailingSpaces();
		obj.stripping();

	}
	
	

}
