package java_Basics;

public class StaticKeyword {
	static int  staticvariable=10;
	static String staticstring="staticstring";
	public static void method1()
	{
		System.out.println("This is a static method1"+ " "+staticstring+" "+ staticvariable);
	}
	static
	{
		System.out.println("This is a static block"+ " "+staticstring+" "+ staticvariable);
		//static block of codes executed when we class is loaded in the memory.
	}
	public void nonstaticmethod2()
	{
		staticvariable=staticvariable+10;
		System.out.println("This is a Nonstatic method1"+ " "+staticstring+" "+ staticvariable);
		method1();//we can call static method in a non static method, but we can't call a non static method in a static method.
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();//we can directly call the static method
		StaticKeyword object=new StaticKeyword();
		object.nonstaticmethod2();

	}

}
