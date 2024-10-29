package interviewTest;

import java.util.ArrayList;
import java.util.List;

public class CgiTest {

	public static void main(String[] args) {
		
//		String a[]={"7sad9","hgds99","hfd78"}
//		 
//		Find the sum of the integers?
//		o/p: 79+99+78=256
//		
		
		String a[]={"7sad9","hgds99","hfd78"};
		//List<Integer> num=new ArrayList<>();
		String num="";
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			String word=a[i];
			for(int j=0;j<word.length();j++)
			{
				if(word.charAt(j)>='0' && word.charAt(j)<='9')
				{
					num=num+word.charAt(j);
				}	
					
			}
			System.out.println(num);
			int f=Integer.parseInt(num);
			sum=sum+f;
			num="";
			
		}
		System.out.println(sum);
		
		
		
	}

}
