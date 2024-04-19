package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<Integer> linkedlist=new LinkedList<Integer>();
		linkedlist.add(10);
		linkedlist.add(20);
		linkedlist.add(30);
		linkedlist.add(30);
		linkedlist.add(null);
		System.out.println("1st "+linkedlist);
		List<Integer> anotherlinkedlist=new LinkedList<Integer>();
		anotherlinkedlist.addAll(linkedlist);
		linkedlist.equals(anotherlinkedlist);
		linkedlist.add(0, 25);
		linkedlist.add(3, 44);
		System.out.println("Newly added"+linkedlist);
		System.out.println(anotherlinkedlist);
		//linkedlist.clear();
		//System.out.println(linkedlist.get(0));
		System.out.println(linkedlist.contains(20));
		System.out.println(linkedlist.indexOf(44));
		System.out.println(linkedlist.lastIndexOf(44));
		System.out.println(linkedlist.size());
		List<Integer> emptylinkedlist=new LinkedList<Integer>();
		System.out.println(emptylinkedlist.isEmpty());
		linkedlist.remove(0);
		System.out.println(linkedlist);
		linkedlist.set(0, 5);
		System.out.println(linkedlist);
				

	}

}
