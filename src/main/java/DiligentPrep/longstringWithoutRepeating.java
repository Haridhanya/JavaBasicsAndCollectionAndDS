package DiligentPrep;

import java.util.LinkedHashSet;
import java.util.Set;

public class longstringWithoutRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ilovejavalovecode";
		char[] ch=s.toCharArray();
		Set<Character> set=new LinkedHashSet<>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ch.length;i++)
		{
			
			if(set.contains(ch[i]))
			{
				break;
			}
			set.add(ch[i]);
			sb.append(ch[i]);
			
		}
		
		System.out.println(sb);

	}

}
