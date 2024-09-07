package ArraysPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class findDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the size of array");
		n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the "+i+"th element : ");		
			a[i]=sc.nextInt();			
			
		}
		
		//duplicate
		for(int i=0;i<n;i++)
		{
			
			
			for(int j=i+1;j<n;j++)
				
			{
				
				
				if(a[i]==a[j])
				{
					System.out.println("duplicate: "+a[i]);
				
				}
			}
		}
		
		

	}

}
