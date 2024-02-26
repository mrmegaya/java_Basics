package java_Basics_New;

import java.util.Scanner;

public class PrintingTriangle {

	public void printtriangle()
	{
		int row,column;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of lines to be printed : ");
		int NumOfLine=scan.nextInt();
		for (row=0; row < NumOfLine; row++) {
			for (column = 0; column <= row; column++) {
				System.out.print("* ");
			}
			 System.out.println("\n");
		}
		
	}

	public static void main(String[] args) {
		PrintingTriangle obj=new PrintingTriangle();
		obj.printtriangle();

	}

}
