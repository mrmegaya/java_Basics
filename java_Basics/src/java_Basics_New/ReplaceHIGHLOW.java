package java_Basics_New;

public class ReplaceHIGHLOW {
	static String given="A UniQue CoalesCence";
	public void Replace_TO_Low()
	{
		char[] chararray=given.toCharArray();
		for (int i = 0; i < given.length(); i++) {
			if (chararray[i]>=65 && chararray[i]<=97) 
			{
				chararray[i]=(char) (chararray[i]+32);
				System.out.print(chararray[i]);
			} else {
				System.out.print(chararray[i]);

			}
		}
		System.out.println("\n");
	}
	public void Replace_TO_High()
	{
		char[] chararray=given.toCharArray();
		for (int i = 0; i < given.length(); i++) {
			if (chararray[i]>=97 && chararray[i]<=122) 
			{
				chararray[i]=(char) (chararray[i]-32);
				System.out.print(chararray[i]);
			} else {
				System.out.print(chararray[i]);

			}
		}
	}

	public static void main(String[] args) {
		ReplaceHIGHLOW obj=new ReplaceHIGHLOW();
		obj.Replace_TO_Low();
		obj.Replace_TO_High();

	}

}
