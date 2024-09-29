package searchingAndSorting;

import java.util.Arrays;

public class SelectionSort {

//	Step 1: Start from the first element and assume it's the smallest.
//	Step 2: Compare this element with the rest of the elements in the unsorted part of the array to find the actual smallest element.
//	Step 3: Swap the smallest element found with the first element of the unsorted part.
//	Step 4: Move the boundary between sorted and unsorted parts one element to the right.
//	Step 5: Repeat the process until the array is sorted.

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {7,3,1,6,8,2,1,0};
int[] sorted=selectionSort(a);
		System.out.println(Arrays.toString(sorted));
		
	}

	
	
	public static int[] selectionSort(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
				{
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
			
		}
		
		return a;
		
	}
}
