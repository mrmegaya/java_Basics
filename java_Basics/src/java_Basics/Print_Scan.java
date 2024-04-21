package java_Basics;

import java.util.Scanner;

public class Print_Scan {
	static int a,b,switching;
	static String loop;

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the list to perform action 1.SUM	2.Diffrence 3. Multiply 4.Division  5.To Thank 6.To Exit");
		switching=scan.nextInt();
		if (switching>5) {
			System.out.println("Exiting calculator");
		}
		if (switching==5) {
			System.out.println("Thank you for using simple calculator");
		}
		else
		{
			if (switching>=1 && switching<=4)
			{
				System.out.println("Hi Kindly give a integer : ");
				a= scan.nextInt();
				System.out.println("Hi Kindly give a second integer : ");
				b = scan.nextInt();
				switch (switching) 
				{
				case 1:
					System.out.println("The Sum is : "+(a=a+b));
					break;
				case 2:
					System.out.println("The diffrence is : "+(a=a-b));
					break;
				case 3:
					System.out.println("The Multiplied is :"+(a=a*b));
					break;
				case 4:
					System.out.println("The Division is :"+(a=a/b));
					break;
				} 	
			}	
		}
		scan.close();
	}
}

