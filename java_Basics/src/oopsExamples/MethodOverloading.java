package oopsExamples;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		MethodOverloading obj=new MethodOverloading();
		obj.add();
		obj.add(2, 2);
		

	}

	public  void add() {
		System.out.println("Hi Add");
	}
	public void add(int a, int b) {
		int c = a+b;		
		System.out.println(c);
	}

}
