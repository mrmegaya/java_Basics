package oopsExamples;

public class ConstructorExamples {
	
	public ConstructorExamples()
	{
		System.out.println("Hi Constructor");
	}
	public static int ConstructorExamples(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExamples myobj = new ConstructorExamples();
		System.out.println(myobj);
		int myNum1 = ConstructorExamples(8, 5);
		  System.out.println("int: " + myNum1);

	}

}
