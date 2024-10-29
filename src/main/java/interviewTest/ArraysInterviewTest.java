package interviewTest;

import java.util.Arrays;

public class ArraysInterviewTest {

	
	 //distribute zeros equally to end and start
	public static int[] ZeroDistribution(int[] a)
	{
		int countZero=0;
		for(int ar:a)
		{
			if(ar==0)
			countZero++;
		}
		int start=countZero/2;
		int end=a.length-(countZero-start);
		int result[]=new int[a.length];
		int i=start;
		for(int num:a)
		{
			if(num!=0)
			{
				result[i++]=num;
			}
		}
		Arrays.fill(result, 0,start,0);
		Arrays.fill(result,end,a.length,0);
		return result;
		
	}
	
	//postive int followed by negative
	public static int[] Arrage(int[] arr)
	{
		int[]result=new int[arr.length];
		int pos=0;
		int neg=1;
		for(int num:arr)
		{
			if(num>0 && pos<arr.length)
			{
				result[pos]=num;
				pos+=2;
			}
			else if(num<0 && neg<arr.length)
			{
				result[neg]=num;
				neg+=2;
			}
		}
		return result;
		
	}
	
	 public static void main(String[]args)
	 {
		 int[] arr = {1, 2, 3, -3, -2, -5, 0,0}; 
		 int result[]=ZeroDistribution(arr);
		 System.out.println(Arrays.toString(result));
		 int arrange[]=Arrage(result);
		 System.out.println(Arrays.toString(arrange));
		 
		 
		 
		 
		 
	 }
	 
	 
	 
	
	
}

