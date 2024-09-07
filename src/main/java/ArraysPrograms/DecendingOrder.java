package ArraysPrograms;

import java.util.Arrays;

public class DecendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,6,3,10,20};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
System.out.println("Array sorted in Decending : "+Arrays.toString(a));
	}

}
