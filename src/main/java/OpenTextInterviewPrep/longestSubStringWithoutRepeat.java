package OpenTextInterviewPrep;

import java.util.HashSet;
import java.util.Set;

public class longestSubStringWithoutRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcabbccdabcd";
	
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			Set<Character> set=new HashSet<>();
			
			for(int j=i;j<s.length();j++)
			{
				if(set.contains(s.charAt(j)))
						{
					break;
						}
				set.add(s.charAt(j));
				max=Math.max(max, j-i+1);
				
			}
			
			
			
		}
		System.out.println(max);
		
		
		
		
		

	}

}
