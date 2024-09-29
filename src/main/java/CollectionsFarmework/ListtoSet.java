package CollectionsFarmework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListtoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//convert list to set to remove duplicates in a list
		List l=new ArrayList();
		l.add(6);
		l.add(10);
		l.add(18);
		l.add(6);
		
		Set s=new TreeSet(l);
		System.out.println("list : "+l);
		System.out.println("set : "+s);
		
		
		

	}

}
