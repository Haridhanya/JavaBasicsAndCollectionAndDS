package OpenTextInterviewPrep;

import java.util.ArrayList;
import java.util.List;

public class FindSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcabcbb";
		int max=0;
		List<String> list=new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
				
			{
				list.add(s.substring(i,j));
				//System.out.println(s.substring(i,j));
			}
		}
		List<String> reversed=new ArrayList<>();
		int maxcount=0;
		String maxpalin="";
		for(String s1:list)
		{
			StringBuilder sb=new StringBuilder(s1);
			
			reversed.add(sb.reverse().toString());
			
		}
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equals(reversed.get(i)))
			{
				if(max<list.get(i).length()) {
				max=list.get(i).length();
				maxpalin=list.get(i);
				}
				
				
			}
		}
		
		System.out.println(maxpalin+":"+max);
		

	}

}
