package ArraysPrograms;

import java.util.Arrays;

public class ThirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[] {1,11,2,20,10};
		//first we have to sort to find 3rd largest number
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
		}
		System.out.println("Sorted Array is : "+Arrays.toString(a));
		//to find 3rd largest
		int total=(a.length)-2;
		System.out.println("Third largest : "+a[total]);
		System.out.println("Largest number : "+a[(a.length)-1]);
	}

}
