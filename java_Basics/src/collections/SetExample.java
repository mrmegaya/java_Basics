package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("TATA");
		hashset.add("Hyundai");
		hashset.add("Maruti");
		hashset.add("Mahendra");
		hashset.add("Honda");
		hashset.add("BMW");
		hashset.add("Benz");
		System.out.println(hashset);
		HashSet<String> anotherHasSet=new HashSet<String>();
		anotherHasSet.addAll(hashset);
		System.out.println(anotherHasSet);
		System.out.println(hashset.equals(anotherHasSet));
		System.out.println(hashset.containsAll(anotherHasSet));
		System.out.println(hashset.clone());
		System.out.println(hashset.isEmpty());
		hashset.remove("BMW");
		System.out.println(hashset);
		hashset.removeAll(anotherHasSet);
		System.out.println(anotherHasSet);
		System.out.println(hashset.size());
		hashset.iterator();
		Iterator<String> iterator=hashset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		

	}

}
