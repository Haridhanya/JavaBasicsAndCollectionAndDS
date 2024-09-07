package CollectionsFarmework;

import java.util.ArrayList;
import java.util.HashSet;

public class HastSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet(20,90);
		//inbuild hs methods practice
		hs.add(60);
		hs.add("hari");
		hs.add("wonderland");
		hs.add(77);
		hs.add(100);
		System.out.println(hs);//will be printed in random order
		hs.remove(77);
		System.out.println(hs);
//		hs.clear();
//		System.out.println(hs);
		Boolean ans=hs.isEmpty();
		System.out.println(ans);
		ArrayList al=new ArrayList();
		al.add(55);
		al.add("awesome");
		al.add("hari");
		al.add(100);
		//union
		hs.addAll(al);
		System.out.println("union : "+hs);
		//intersection
		hs.retainAll(al);
		System.out.println("intersection : "+hs);
		//difference
		al.remove(hs);
		System.out.println("remove all : "+al);
		
		
		
		

	}

}
