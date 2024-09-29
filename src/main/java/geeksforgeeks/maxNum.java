package geeksforgeeks;

import java.util.ArrayList;
import java.util.Collections;

/*sort methods:
 *Arrays.sort()
 * brut force-checking each ele with temp var
 * bubble sort and get the last ele
 * Collections.max()
 */

public class maxNum {

	
	public static int max(int[] a)
	{
		ArrayList list=new ArrayList<>();
		
		for(int ele:a)
		{
			list.add(ele);
		}
		
		return (int) Collections.max(list);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {2,4,5,67,89,90};
		int max=max(a);
		System.out.println(max);
		
	}

}
