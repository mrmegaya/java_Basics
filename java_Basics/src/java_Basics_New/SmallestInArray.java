package java_Basics_New;

public class SmallestInArray {

	public static void main(String[] args) {
		int array[]= {3,6,8,3,5};
		int smalllestnum=Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			
			if (array[i]<smalllestnum) {
				smalllestnum=array[i];
			}
		}
System.out.println(smalllestnum);
}
}
