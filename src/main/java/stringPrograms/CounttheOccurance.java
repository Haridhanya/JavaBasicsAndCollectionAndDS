package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CounttheOccurance {

	
	public static void countOccur()
	{
		String s="haridhanya";
		int count=0;
		char[] cc=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			
			char c=cc[i];
			count=1;
			if(cc[i]=='\0') {
				continue;
			}
			else {
			for(int j=i+1;j<s.length();j++)
			{
				if(c==cc[j])
				{
					count++;
					cc[j]='\0';
				}
				
				
				
			}
			System.out.println(c+":"+count);
			
		}}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countOccur();
		String s="haridhanya";
		Map<Character,Integer> count=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(count.containsKey(ch))
			{
				count.put(ch, count.get(ch)+1);
			
			}
			else
			{
				count.put(ch, 1);
			}
		}
		
		System.out.println(count);

	}

}
