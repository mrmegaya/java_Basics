package java_Basics;

import java.util.Scanner;

public class Print_Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Line to Print");
		int a=4,b=2;
		int sum=a+b;
		int diff=a-b;
		System.out.println("A+B="+(a+b));
		System.out.println("A+B="+sum);
		System.out.println("A-B="+diff);
		Scanner getting= new Scanner(System.in);
		System.out.println("Hi Kindly give a integer : ");
		int c = getting.nextInt();
		System.out.println("A+B="+(a+c));
		System.out.println("Hi Kindly give a second integer : ");
		int d = getting.nextInt();
		System.out.println("Hi given integer are : "+c+" and " +d);
			
		

	}

}
