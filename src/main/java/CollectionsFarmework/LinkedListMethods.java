package CollectionsFarmework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
	ll.add(1);
	ll.add("hari");
	ll.add(10);
	ll.add(66);
	ll.add("dhanya");
	System.out.println(ll);
	ll.addFirst(21);
	System.out.println(ll);
ll.removeLast();
System.out.println(ll);
System.out.println(ll.getFirst());
//ll.removeAll(ll);
//System.out.println(ll);

		//remove alphabet words from the linkedlist
Iterator it=ll.iterator();
		while(it.hasNext())
		{
			Object val=it.next();
			if(val.equals(21))
			{
				it.remove();
			}
		}
		System.out.println(ll);

	}

}
