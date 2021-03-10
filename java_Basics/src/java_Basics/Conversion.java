package java_Basics;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int currency=25;
		float f=currency;		
		System.out.println(f);
		
		//Declaring String variable  
		String s="200";  
		//Converting String into int using Integer.parseInt()  
		int i=Integer.parseInt(s);  
		//Printing value of i  
		System.out.println(i+2); 
		
		
		
		//Declaring a string  
		String st="100";  
		//converting String into Integer using Integer.valueOf() method  
		Integer j=Integer.valueOf(st);  
		System.out.println(j); 

	}

}
