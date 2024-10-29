package DiligentPrep;

import java.util.LinkedHashSet;
import java.util.Set;

public class firstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="haridhanya";
		char[] ch=s.toCharArray();
		int count=1;
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(ch[i]);
				break;
			}
		}
		
		

	}

}
