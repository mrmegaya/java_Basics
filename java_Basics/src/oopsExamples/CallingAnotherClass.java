package oopsExamples;

public class CallingAnotherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalledClass obj=new CalledClass();
		obj.display();
		// calling an Private method from another class. ERROR- The method from the type CalledClass is not visible
		//obj.Outsidemain();
	}
}
