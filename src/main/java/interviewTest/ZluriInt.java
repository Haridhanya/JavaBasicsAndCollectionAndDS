package interviewTest;

import java.util.HashSet;
import java.util.Set;

public class ZluriInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Write a java program to find the first non-repeating alphabet in a given string. Use IDE if needed.
//
//		Once we have the working code, write the test cases for the same. "
//		Eg: i/p - "pipes", o/p - "i"
		
		String s="";
		boolean Repeat=false;

			
		
		for(int i=0;i<s.length();i++)
	
		{
			Repeat=false;
		
			for(int j=i+1;j<s.length();j++)
			{
				
				if(s.charAt(i)==s.charAt(j))
				{
					Repeat=true;
				}
			}
			if(Repeat==false)
			{
				System.out.println(s.charAt(i));
				break;
			}
			
		}
		}
		

}



//1. "A"
//2. "AaBa"
//3. " "
//4. NULL
//5. "12345"
//6. "~!@#~"
