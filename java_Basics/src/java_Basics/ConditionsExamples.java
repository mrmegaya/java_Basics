package java_Basics;

import java.util.Scanner;

public class ConditionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//If condition
		int A = 20;
		int B = 18;
		if (A > B) {
		  System.out.println("A is greater than B");
		}
		//IF Else condition
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the x Int :");		
		int x =ip.nextInt();
		System.out.println("Enter the y Int :");
		int y =ip.nextInt();
		System.out.println("Entered X value is :"+x+"\nEntered Y value is :"+y+"");
		if (x > y) {
		  System.out.println("x is greater than y");
		}
		else
		{
			System.out.println("Y is greater than X");
		}
		
		
		//SWITCH
		System.out.println("Enter an Day: ");
		int day=ip.nextInt();
		switch (day) {
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
		}
		ip.close();
	}

}
