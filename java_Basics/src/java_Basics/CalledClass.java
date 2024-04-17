package java_Basics;

public class CalledClass {
	public void display()
	{
		System.out.println("Base Class");
	}
	private void Outsidemain()
	{
		System.out.println("Calling Confirm");		
	}	
	public static void main(String[] args) {
		// Blocks inside the main method is executed first
		System.out.println("The Parent Class is called.");
		CalledClass obj2=new CalledClass();
		obj2.display();
		obj2.Outsidemain();		
	}
	
	

}
