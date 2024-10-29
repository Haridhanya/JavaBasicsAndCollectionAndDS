package interviewTest;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayProgram {

	public static void main(String[] args) {
		
//		I/p = Input - [1,2,3] input2 [3,1,2]
//				output [5,3, 4]
//		
//		int[] a= {1,2,3};
//		int[] b= {3,1,2};
//		int n=a.length;
//		int[] res=new int[n];
//		int j=0;
//		for(int i=n-1;i>=0;i--)
//		{
//		res[i]=a[j]+b[j];	
//		j++;
//		}
//		System.out.println(Arrays.toString(res));
//		
		
		
		
		
//		list 1 = (5, 3, 8, 5, 2, 3, 10)
//				list 2 = (5, 3, 10)
		
			 
		

	

	
//	
//	list 1 = (5, 3, 8, 5, 2, 3, 10)
//			list 2 = (5, 3, 10)
		//o/p (2,3)
	int[] arr= {5, 3, 8, 5, 2, 3, 10};
	int[] arr1= {5,3,10};
	HashSet<Integer> set=new HashSet<>();
	
	for(int k=0;k<arr.length;k++)
	{
	
		set.add(arr[k]);
		if(!(set.contains(arr[k])))
		{
			
		}
		
		
	}
	System.out.println(set);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
}
