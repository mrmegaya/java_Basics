package inheritanceExamples;

public class ParentClass  extends GrandParentClass  {
	////Can have its own methods 
	
	public void publicmodifier()
	{
		System.out.println("This is a public modifier from ParentClass");
	}
	private void privatecmodifier()
	{
		System.out.println("This is a private modifier from ParentClass");
	}
	protected void protectedmodifier()
	{
		System.out.println("This is a protected modifier from ParentClass");
	}
	public static void main(String[] args) {
		ParentClass obj= new ParentClass();
		obj.publicmodifier();// from Its own class
		obj.privatecmodifier();// from Its own class
		obj.protectedmodifier();// from Its own class
		System.out.println("Legendary Interface's Integer is : "+LegendaryInt);
		System.out.println(SecondaryString);
		System.out.println("Secondary Interface's Integer is : "+Secondaryint);
		obj.SaveTrees();// from Its grandparent's method
		System.out.println(GPString);// from Its grandparent's class
		System.out.println("GrandParentClass's Integer is : "+ GPIntVariable);// from Its grandparent's class
		ChildClass1 c1obj=new ChildClass1();//methods accessed with the help of new object creation
		c1obj.child1Method();//can access only methods from its child class
		
	}
}
