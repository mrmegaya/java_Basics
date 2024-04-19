package inheritanceExamples;

public class ChildClass2 extends ParentClass {
	
	public void child2Implementation()
	{
		String NotinChildclass="HI Im not in the child class so i can have default Modifier";
		int count=2;
		System.out.println("This came from Child2");
		System.out.println(NotinChildclass);
		System.out.println(count);
	}
public static void main(String[] args) {
	ChildClass2 obj=new ChildClass2();
	obj.child2Implementation();
	
}
}
