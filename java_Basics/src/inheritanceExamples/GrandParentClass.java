package inheritanceExamples;

public class GrandParentClass implements SecondaryInterface  {
	static int GPIntVariable=2;//data's and properties should be static,  
	//if it implements it is considered as a Abstract class, abstract class should have static or final keyword.
	static String GPString="Hi from GrandParentClass String";//Strings should be static because it is Immutable
	void SaveTrees()//Can have its own methods 
	{
		System.out.println("Save the Trees from GrandParentClass");
	}	
	//Implements came from LegendaryInterface as SecondaryInterface Extends LegendaryInterface.
	@Override
	public void LegendaryInterfaceMethod() {
		System.out.println("This is Legendary Interface's Method");	
	}
	//Implements came from SecondaryInterface as it implements SecondaryInterface.
	@Override
	public void SecondaryInterfaceownMethod() {
		System.out.println("This is Secondary Interface's Method");			
	}
	public static void main(String[] args) {
		GrandParentClass obj=new GrandParentClass();
		obj.SaveTrees();
		obj.LegendaryInterfaceMethod();
		obj.SecondaryInterfaceownMethod();
		System.out.println("Legendary Interface's Integer is : "+LegendaryInt);
		System.out.println(SecondaryString);
		System.out.println("Secondary Interface's Integer is : "+Secondaryint);
		System.out.println(GPString);
		System.out.println("GrandParentClass's Integer is : "+ GPIntVariable);
	}
	
	
}
