package searchingAndSorting;

import java.util.Arrays;
import java.util.HashSet;

public class BubbleSort {

	public static int[] bubbleSort(int[] a)
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
			if(a[j]<a[j+1])//descending
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		//arranges the array in ascending or descending order
		int[] a= {2,7,1,6,4,2,7,9,4};
		int[] sorted=bubbleSort(a);
		System.out.println(Arrays.toString(sorted));
		System.out.println(removeDuplicate(sorted));
		

	}

	private static HashSet removeDuplicate(int[] sorted) {
		
		HashSet hs=new HashSet<>();
		for(int i=0;i<sorted.length;i++)
		{
			if(hs.contains(sorted[i]))
			{
				continue;
			}
			else
			{
				hs.add(sorted[i]);
			}
		}
		
		
		
		return hs;
		
	}

}
