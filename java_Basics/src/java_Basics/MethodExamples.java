package java_Basics;

import java.util.Scanner;

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
	static void scannerParameters(int d, int e)
	{
		int f = d+e;
		System.out.println("The Sum is : "+f);
	}
	static void nestedMethods()
	{
		Scanner scann = new Scanner(System.in);
		System.out.println("Enter the First Int:");
		int d=scann.nextInt();
		System.out.println("Enter the First Int:");
		int e=scann.nextInt();
		scannerParameters(d, e);
		scann.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withOutParameter();
		withParameters(2, 3);
		nestedMethods();

	}

}
