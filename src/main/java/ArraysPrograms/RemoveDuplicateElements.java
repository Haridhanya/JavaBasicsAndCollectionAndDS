package ArraysPrograms;

import java.util.Arrays;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using  array index
		
		int a[]=new int[] {10,10,20,30,50};
		int j=0;
	   //sort array
		//Arrays.sort(a);
		
		for(int i=0;i<a.length-1;i++)
		{
			
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
			}
		
			
		}
	//a[j++]=a[a.length-1];
	System.out.println(Arrays.toString(a));
		

	}

}
