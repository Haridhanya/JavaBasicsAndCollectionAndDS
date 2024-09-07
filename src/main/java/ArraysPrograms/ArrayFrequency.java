package ArraysPrograms;

import java.util.Arrays;

public class ArrayFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,2,3,2,3,9,0,3};
		
		int count=1;
		//int visted=1;
		boolean f[]=new boolean[a.length];
		Arrays.fill(f, false);
		for(int i=0;i<a.length;i++)
			
		{
			
			if(f[i]==true)continue;
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					f[j]=true;
					
				}
			}
			System.out.println(a[i] +":"+count);
		}
		

	}

}
