package stringPrograms;

import java.util.ArrayList;

public class BiggestandSmallestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="wow you won kayak";
		//convert strings into seperate words
		//check the palindrome of the word
		//then check the length of the palindrome word for finding the small and big
		
		
		//Step 1:Split the strings
		String[] words=new String[20];
		String word="";
		int len=0;
		s=s+" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				word=word+s.charAt(i);
			}
			else
			{
				words[len]=word;
				len++;
				word="";
			}
		}
		//step 2: find the palindrome words in the string
		
		ArrayList<String> p=new ArrayList<String>();
		int count=0;
		
		for(int i=0;i<len;i++)
		{
			String palindrome="";
			
			String original="";
			for(int j=words[i].length()-1;j>=0;j--)
			{
				original=words[i];
				palindrome=palindrome+ original.charAt(j);
			}
			if(words[i].equals(palindrome))
			{
				
				p.add(palindrome);
				count++;
				
				
			}
		}
for (String sw:p)
{
	System.out.println(sw);
}

		String largest;
		//step 3:find the smallest and largest palindrome
		String smallest=largest=p.get(0);
		for(int k=1;k<count;k++)
		{
			if(p.get(k).length()<smallest.length())
			{
			smallest=p.get(k);	
			}
			if(p.get(k).length()>largest.length())
			{
				largest=p.get(k);	
			}
		}
		
		System.out.println("Largest Plaindrome : "+largest);
		System.out.println("Smallest palindrome : "+smallest);
		
		

	}

}
