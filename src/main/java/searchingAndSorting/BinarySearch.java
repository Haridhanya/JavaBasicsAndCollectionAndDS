package searchingAndSorting;

import java.util.Arrays;

public class BinarySearch {

	
	//binary serach-works only with sorted array
	public static int BinarySearch(int[] a,int key)
	{
		int first=0;
		int last=a.length-1;
		
		while(first<=last)
		{
			 int mid=(first+last)/2;
			 if(a[mid]==key)
			 {
				 return key;//key found
			 }
			 else if(a[mid]<key)
			 {
				 first=mid+1;//search in right half
			 }
			 else
			 {
				 last=mid-1;//search in left half
			 }
			 
			 
			 
		}
		
		
		
		
		return -1;//key not found
	}
	
	public static void main(String[] args) {
		
int[] a= {0,1,3,4,6,7};//use only sorted array for binary search
int res=BinarySearch(a,2);
System.out.println(res);
	System.out.println(Arrays.binarySearch(a, 3));	
		
	}

}
