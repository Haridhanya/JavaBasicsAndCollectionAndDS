package DiligentPrep;

import java.util.*;

public class UniquevaluesInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {5, 3, 8, 5, 2, 3, 10};
		Integer[] b= {5,3,10};
		List<Integer> list1=new ArrayList<>(Arrays.asList(a));
		List<Integer> list2=new ArrayList<>(Arrays.asList(b));
		list1.removeAll(list2);
		System.out.println(list1);
		list2.add(2);
		list1.retainAll(list2);
		System.out.println(list1);
		
		
		

	}

}
