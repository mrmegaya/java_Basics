package collections;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
	
	public void AccessArray()
	{
		List<String> arraylist=new java.util.ArrayList<String>();
		arraylist.add("TATA");
		arraylist.add("Hyundai");
		arraylist.add("Maruti");
		arraylist.add("Mahendra");
		arraylist.add("Toyota");
		arraylist.add("Honda");
		arraylist.add("BMW");
		arraylist.add("Benz");	
		System.out.println("Array List : "+arraylist);
		List<String> anotherArrayList=new java.util.ArrayList<String>();
		anotherArrayList.addAll(arraylist);
		System.out.println("AnotherArray List : "+anotherArrayList);
		anotherArrayList.equals(arraylist);
		System.out.println(arraylist.get(4));
		System.out.println(arraylist.indexOf("Mahendra"));
		System.out.println("Contains ? : "+arraylist.contains("BMW"));
		System.out.println("Empty Status : "+arraylist.isEmpty());
		System.out.println("The fouth indexed item is : "+arraylist.get(4));
		arraylist.remove(4);		
		System.out.println(arraylist);
		arraylist.removeAll(arraylist);
		System.out.println("removeAll :: "+arraylist);
		arraylist.addAll(anotherArrayList);
		System.out.println(arraylist);
		System.out.println("ArrayList size is : "+arraylist.size());
		arraylist.set(0, "TATA the great");
		System.out.println(arraylist);
		/*
		 * arraylist.clear();
		 * System.out.println("The ArrayList is cleared : "+arraylist);
		 */
		Iterator<String> iterator=arraylist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
	}	

	public static void main(String[] args) {
		ArrayList Object=new ArrayList();
		Object.AccessArray();

	}

}
