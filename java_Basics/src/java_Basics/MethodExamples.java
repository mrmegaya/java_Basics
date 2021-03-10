package java_Basics;

public class MethodExamples {
	
	static void withOutParameter()
	{
		System.out.println("Do u called me MR Megaya");
	}	
	
	static void withParameters(int a, int b)
	{
		int c=a+b;
		System.out.println("The Sum is : "+c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withOutParameter();
		withParameters(2, 3);

	}

}
