package oopsExamples;

import java_Basics.CalledClass;

public class MethodOverride extends CalledClass {
	public void display()
	{
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverride obj =new MethodOverride();
		obj.display();
		CalledClass obj2=new CalledClass();
		obj2.display();
		
		

	}

}
