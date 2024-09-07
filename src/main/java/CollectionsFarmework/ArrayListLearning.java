package CollectionsFarmework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListLearning {



	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//convert arrays to array list
		//method 1
	   int[] a= {10,20,3,4,5,6,9};
	   ArrayList al=new ArrayList(Arrays.asList(a));
	  
	   System.out.println(al);
	   //method 2-using addall
	   ArrayList al1=new ArrayList();
	   Collections.addAll(al1,a);
	   System.out.println(al1);
	   //method 3-using add
	   ArrayList al2=new ArrayList();
	   System.out.println(al2);
	   for(int s:a)
	   {
		   al2.add(s);
	   }
	   System.out.println(al2);
	   
	   al2.add("tomy");
	   al2.remove(0);
	   al2.set(0, "nono");
	   al1.removeAll(al2);
	   al2.retainAll(al2);
	   System.out.println(al1);
	   System.out.println(al2);
	   //printing array list using iterator
	   


	   ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(12);
	    numbers.add(8);
	    numbers.add(2);
	    numbers.add(23);
	    Iterator<Integer> it = numbers.iterator();
	    while(it.hasNext()) {
	      Integer i = it.next();
	      if(i < 10) {
	        it.remove();
	      }
	    }
	    System.out.println(numbers);
	   
	   
	   
	   
	}

}
