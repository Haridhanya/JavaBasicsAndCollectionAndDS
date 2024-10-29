package DiligentPrep;

import java.util.Arrays;

public class SumofArraysIndex {

	public static void main(String[] args) {
	
//		I/p = Input - [1,2,3] input2 [3,1,2]
//				output [5,3, 4]
		int[] a= {1,2,3};
		int[] b= {3,1,2};
		int[] res=new int[a.length];
		int len=0;
		for(int i=a.length-1;i>=0;i--)
		{
			res[i]=a[len]+b[len];
			len++;
		}
		System.out.println(Arrays.toString(res));
		
		

	}

}
