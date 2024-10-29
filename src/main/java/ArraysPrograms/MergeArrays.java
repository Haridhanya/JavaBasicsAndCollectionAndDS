package ArraysPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {1,2,3};
		int[] a2= {4,5,6};
		//Using for loop
		int[] mergedArray=new int[a1.length+a2.length];
		for(int i=0;i<a1.length;i++)
		{
			mergedArray[i]=a1[i];
		}
		for(int j=0;j<a2.length;j++)
		{
			mergedArray[a1.length+j]=a2[j];
		}

		System.out.println(Arrays.toString(mergedArray));
		
		//Method 2 :Using List
		Integer[] a=new Integer[] {1,2,3};
		Integer[] b=new Integer[] {4,5,6};
		
		
		ArrayList<Integer> mergedList=new ArrayList<Integer>(Arrays.asList(a));
		mergedList.addAll(Arrays.asList(b));
		System.out.println(mergedList);
		
		//to convert list to array
		Integer[] mergedArray1=mergedList.toArray(new Integer[0]);
		System.out.println(Arrays.toString(mergedArray1));
		
		
		
	}

	
	
	
	
}
