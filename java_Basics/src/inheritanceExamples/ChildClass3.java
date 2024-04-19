package inheritanceExamples;

public class ChildClass3 extends ChildClass1 implements TempInterface  {
//if same method already in the parent classes, the current class may not require to implementation from it.
	@Override
	public void TempInterfaceMethod() {
		System.out.println("This is TempInterfaceMethod");
		
	}
	public void childclass3Method()
	{
		System.out.println("This came from Child3");
	}
	public static void main(String[] args) {
		ChildClass1 obj1= new ChildClass1();
		obj1.child1Method();
		ChildClass2 c2obj= new ChildClass2();
		c2obj.child2Implementation();
		ChildClass3 obj3=new ChildClass3();
		obj3.childclass3Method();
		obj3.TempInterfaceMethod();
	}



}
