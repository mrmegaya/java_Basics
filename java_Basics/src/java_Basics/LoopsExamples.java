package java_Basics;

import java.util.Scanner;

public class LoopsExamples {
	static int a,b;
	public void scanner()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi Kindly give a integer : ");
		a= scan.nextInt();
		System.out.println("Hi Kindly give a second integer : ");
		b = scan.nextInt();
		scan.close();
	}
	public void add()
	{
		System.out.println("The Result is : "+(a+b));
	}

	public static void main(String[] args) {
		LoopsExamples obj=new LoopsExamples();
		Scanner scanner = new Scanner(System.in);
		String input;

		// Infinite loop
		while (true) {
			System.out.print("Press Enter to continue or type '6' to break: ");
			input = scanner.nextLine();

			if (input.equals("")) {
				// User pressed Enter, continue looping
				System.out.println("Continuing...");
			} else if (input.equalsIgnoreCase("6")) {
				// User typed 'exit', break the loop
				System.out.println("Exiting loop.");
				break;
			} else {
				obj.scanner();
				obj.add();

			}
		}
		scanner.close();// Close the scanner
	}
}
