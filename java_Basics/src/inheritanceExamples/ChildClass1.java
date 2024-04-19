package inheritanceExamples;

public class ChildClass1 extends ParentClass{
	//we can Implement multiple interfaces but not extend multiple class
	static int c1int=8;
	protected void child1Method()// can have its own implementation added.
	{
		System.out.println("This came from Child1");
		System.out.println("The ChildClass1 Integer is :"+c1int);
	}
	public static void main(String[] args) {
		ChildClass1 obj=new ChildClass1();
		obj.child1Method();
		obj.publicmodifier();
		obj.protectedmodifier();
	}
	 
}
