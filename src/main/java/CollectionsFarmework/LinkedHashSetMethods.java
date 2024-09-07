package CollectionsFarmework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs=new LinkedHashSet();//duplicate not allowed,order is preserved{hash table+linked list}
		HashSet hs=new HashSet();//duplicate not allowed,oreder is not preserved{hash set}
		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add("hari");
		lhs.add("hari");
	
	System.out.println(hs);
	System.out.println(lhs);
	
	
	}
		

	}
