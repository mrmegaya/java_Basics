package java_Basics_New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Missing_Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given="Abcd ef";
		String formatted=given.replace(" ", "").toLowerCase();
		String[] allalphabets= "abcdefghijklmnopqrstuvwxyz".split("");
		System.out.println(formatted);
		System.out.println(allalphabets);
		String[] userarray=formatted.split("");
		HashSet<String> set1=new HashSet<String>();
		for (String string : userarray) {
			set1.add(string);
		}
		HashSet<String> set2= new HashSet<String>(Arrays.asList(allalphabets));
		set2.removeAll(set1);
		System.out.println(set2);

	}

}
