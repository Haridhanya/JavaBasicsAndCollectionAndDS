package interviewTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueElementsInList {

	public static void main(String[] args) {
	
		Integer[] a= {5, 3, 8, 5, 2, 3, 10};
		Integer[] b= {5, 3, 10};
		Set<Integer> set1=new HashSet<>(Arrays.asList(a));
		Set<Integer> set2=new HashSet<>(Arrays.asList(b));
		set1.removeAll(set2);
		System.out.println(set1);
	
		
		
		
		
		

	}

}
