package interviewTest;

import java.util.HashSet;

public class SmallestPositiveNotInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[]= {1,2,4,5,};
		HashSet set=new HashSet();
		for(int ar:a)
		{
			if(ar>0)
			{
				set.add(ar);
			}
		}
		for(int i=1;i<=a.length+1;i++)
		{
			if(!(set.contains(i)))
					{
		System.out.println(i);
					}
		}
		
		
		
		
	}

}
