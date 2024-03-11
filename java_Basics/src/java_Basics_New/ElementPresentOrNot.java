package java_Basics_New;

import java.util.stream.IntStream;

public class ElementPresentOrNot {
	static int array[]= {3,6,8,3,5,8,9,5,2,4,9};
	static int given=9;
	public void firstmethod()
	{		
		Boolean found=false;
		for (int number : array) {
			if (number==given) {
				found=true;
			}
			break;
		}
		if (found.TRUE) 
			System.out.println("Element Present");
		else 
			System.out.println("Element not Present");
	}
	public void usingintStream()
	{
		Boolean found= IntStream.of(array).anyMatch(ele->ele==given);
		if (found.TRUE) 
			System.out.println("Element Present in The Stream");
		else 
			System.out.println("Element not Present in The Stream");
	}

	public static void main(String[] args) {
		ElementPresentOrNot obj=new ElementPresentOrNot();
		obj.firstmethod();
		obj.usingintStream();
	}

}
