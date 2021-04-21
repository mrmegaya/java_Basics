package java_Basics;

public class CalledClass {
	public void display()
	{
		System.out.println("Base Class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Parent Class is called.");
		CalledClass obj2=new CalledClass();
		obj2.Outsidemain();
		
	}
	private void Outsidemain()
	{
		System.out.println("Calling Confirm");		
	}
	

}
