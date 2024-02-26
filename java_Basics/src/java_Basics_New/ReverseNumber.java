package java_Basics_New;

import java.util.Scanner;

public class ReverseNumber {
	public void reverseNum()
	{
		int givenNum=0, reversedNum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		givenNum=scan.nextInt();
		
		while (givenNum!=0) {
			reversedNum=reversedNum*10;
			reversedNum=reversedNum+givenNum%10;
			givenNum=givenNum/10;
			
		}
		System.out.println(reversedNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber obj=new ReverseNumber();
		obj.reverseNum();

	}

}
