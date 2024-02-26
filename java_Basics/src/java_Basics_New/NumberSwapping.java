package java_Basics_New;

public class NumberSwapping {
	public static int a=10, b=20,temp,first=10, second=20,third=10, fourth=20;
	
	public void thirdvariable()
	{
		System.out.println("A="+a+" B="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("A="+a+" B="+b);		
	}
	
	public void usingADDandSub()
	{
		System.out.println("\n"+"A="+first+" B="+second);
		first=first-second;
		second=first+second;
		first=second-first;
		System.out.println("A="+first+" B="+second);
	}
	public void usingMULandDIV()
	{
		System.out.println("\n"+"A="+third+" B="+fourth);
		third=third*fourth;
		fourth=third/fourth;
		third=third/fourth;
		System.out.println("A="+third+" B="+fourth);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberSwapping obj=new NumberSwapping();
		obj.thirdvariable();
		obj.usingADDandSub();
		obj.usingMULandDIV();

	}

}
