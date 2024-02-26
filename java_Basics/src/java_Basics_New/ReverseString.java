package java_Basics_New;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {
	static String given="We Have to Reverse this String";
	
	public void reverse()//using CharaArray[] logic
	{
		char[] chararray=given.toCharArray();
		String expected="";
		for (int i =chararray.length-1 ; i >=0; i--) {
			expected=expected+chararray[i];
		}
		System.out.println(expected);
	}
	
	public void usingCollections()
	{
		String toprint="";
		char[] chararray=given.toCharArray();
		List<Character> rev=new ArrayList<Character>();
		for (Character character : chararray) {
			rev.add(character);
		}
		Collections.reverse(rev);
		ListIterator<Character> iterator=rev.listIterator();
		
		while (iterator.hasNext()) {
			toprint=toprint+iterator.next();
			
		}
		System.out.println(toprint);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using string buffer/builder
		//using string buffer
		StringBuffer buffer=new StringBuffer();
		buffer.append(given);
		System.out.println(buffer.reverse());
		//using string builder
		StringBuilder builder=new StringBuilder();
		builder.append(given);
		System.out.println(builder.reverse());
		
		ReverseString obj=new ReverseString();
		obj.reverse();
		obj.usingCollections();

	}

}
