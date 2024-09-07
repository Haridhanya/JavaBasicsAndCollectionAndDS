package ArraysPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMax_Leetcode {

	public static void main(String[] args) {
		
		


		List<Integer> arr= new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
	    // Write your code here
	   
	    int n=arr.size();
	    int i=0,sum=0;
	    ArrayList<Integer> sums=new ArrayList<Integer>();
	for(i=0;i<n;i++)
	{
		sum=0;
		for(int j=0;j<n;j++)
		{
			if(i!=j)
			{
				sum=sum+arr.get(j);
			}
		}
		sums.add(sum);
		System.out.println(sum);
	}
	
	    
	    
	    
	    
	    
	int min=Collections.min(sums);
	int max=Collections.max(sums);
	System.out.println(min+" "+max);
	}

}
