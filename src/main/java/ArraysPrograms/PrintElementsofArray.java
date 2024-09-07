package ArraysPrograms;

import java.util.Arrays;

public class PrintElementsofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[]{1,2,3,4,5};
		System.out.println("elements using tostring : "+ Arrays.toString(a));
		//using enhanced for loop
		for(int num:a)
		{
			System.out.println("elements using enhanced for loop : "+num);
		}
		//using traditional for loop
		for(int i=0;i<a.length;i++)
		{
			System.out.println("elements using traditional for loop : "+a[i]);
		}
		

	}

}
