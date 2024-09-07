package ArraysPrograms;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,5,2,1};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			  System.out.println("after sort " +i+" time : "+Arrays.toString(a));
		}
   System.out.println("Final Ascending oreder : "+Arrays.toString(a));
	}

}
