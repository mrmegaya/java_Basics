package java_Basics_New;

public class ReplaceVowels {
	static String given="A unique coalescence of eloquent vowels and rhythmic syllables";
	public void compare()
	{
		char[] charArray=given.toCharArray();
		for (int i = 0; i < given.length(); i++) 
		{
			if (given.charAt(i)=='a'||given.charAt(i)=='e'||given.charAt(i)=='i'
					||given.charAt(i)=='o'||given.charAt(i)=='u'||
					given.charAt(i)=='A'||given.charAt(i)=='E'||given.charAt(i)=='I'
					||given.charAt(i)=='O'||given.charAt(i)=='U') 
			{
				charArray[i]='*';
				System.out.print(charArray[i]);
			}else {
				System.out.print(charArray[i]);
			}	}	}	
	public void regexp()
	{
		String replaced=given.replaceAll("[AEIOUaeiou]", "*");
		System.out.println("\n"+replaced);
	}
	public void replaceDollar()
	{
		String replacedtext=given.replaceAll("[AEIOUaeiou]", "\\$");
		System.out.println(replacedtext);
	}

	public static void main(String[] args) {
		ReplaceVowels obj=new ReplaceVowels();
		obj.compare();
		obj.regexp();
		obj.replaceDollar();
	}


}
