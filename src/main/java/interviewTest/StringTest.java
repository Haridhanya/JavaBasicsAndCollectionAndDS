package interviewTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabbtttppppa";
	
		//op:a3b2t3p4
		HashMap<Character,Integer> hm=new HashMap();
		
		char[] sa=s.toCharArray();
		int count=1;
		for(int i=0;i<sa.length;i++)
		{
			count=1;
			if(sa[i]=='\0') {
				continue;
			}
			for(int j=i+1;j<sa.length;j++)
			{
				if(sa[i]==sa[j])
				{
					count++;
					sa[j]='\0';
				}
				
			}
			
			System.out.print(sa[i]+""+count);
		   hm.put(sa[i], count);
	
			
		}
		System.out.println(hm);
		
		int[] a= {1,2,3};
		List arr=new ArrayList<>(Arrays.asList(a));
		Collections.sort(arr);

	}

}
