package geeksforgeeks;

import java.util.ArrayList;

public class SearchForElementusingList {

	
	public static boolean search(int a[],int key)
	{
		ArrayList<Integer> list=new ArrayList<>();
		for(int ele:a)
		{
			
			list.add(ele);
			
		}
		
		
		if(list.contains(key)) {
			return true;
		}
		
		return false;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int key=8;
		boolean result=search(arr,key);
		System.out.println(result);

	}

}
