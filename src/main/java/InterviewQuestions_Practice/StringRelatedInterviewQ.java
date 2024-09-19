package InterviewQuestions_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StringRelatedInterviewQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sun  flowers..";
		stringReverse(s);
		countFrequency(s);
		AscendingOrder(s);
		firsthalfAscAndSecHalfDesc(s);
		ChangeFirstandLastChar(s);
		stringlengthAlpha();
		removeExtraSapce(s);
		replaceCharacter(s);
		addCahracter(s);

	}

	public  static void stringReverse(String s)
	{
		int size=s.length()-1;
		StringBuilder sb=new StringBuilder();
		for(int i=size;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
		System.out.println("Reverse String : "+sb);
	}
	
	public static void countFrequency(String s)
	{
		Map<Character,Integer> count=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(count.containsKey(ch))
			{
				count.put(ch, count.get(ch)+1);
			}
			else
			{
				count.put(ch, 1);			}
			
		}
		System.out.println(count);
	}
	
	
	public static void AscendingOrder(String s)
	{
		char[] sa=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(sa[i]>sa[j])
				{
					char c=sa[i];
					sa[i]=sa[j];
					sa[j]=c;
				}
			}
		}
		System.out.println("Ascending order : "+Arrays.toString(sa));
	}
	
	
	public  static void firsthalfAscAndSecHalfDesc(String s)
	{
		int len=s.length();
		int equalhalf=len/2;
		char sa[]=s.toCharArray();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(i<equalhalf)
				{
					if(sa[i]>sa[j])//ascending
					{
						char c=sa[i];
						sa[i]=sa[j];
						sa[j]=c;
					}
				}
				else
				{
					if(sa[i]<sa[j])//descending
					{
						char c=sa[i];
						sa[i]=sa[j];
						sa[j]=c;
					}
				}
			}
		}
		System.out.println("only first half to ascending and second half to desc : "+Arrays.toString(sa));
	}
	
	public static void ChangeFirstandLastChar(String s)
	{
		char[] c=s.toCharArray();
char temp=c[0];
c[0]=c[c.length-1];
c[c.length-1]=temp;
System.out.println("swapping first and last char : "+Arrays.toString(c));
		
	}
	public static void stringlengthAlpha()
	{
		String s="haridhanya";
		StringBuffer sb=new StringBuffer();
		int i=1;
			for(char c='a';i<=s.length();c++)
			{
			sb.append(c);	
			i++;
			}
		
		System.out.println("stringlengthAlpha : "+sb);
	}
	
	
	
	public static void removeExtraSapce(String s)
	{
		char[] c=s.toCharArray();
		Boolean first_space=false;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			if(c[i]!=' ')
			{
				sb.append(c[i]);
				first_space=true;
			}
			else if(first_space==true) {
				sb.append(c[i]);
				first_space=false;
				
			}
		}
		
		System.out.println(sb);
		
	}
	
	public static void replaceCharacter(String s)
	{
		char[] c=s.toCharArray();
		char replace='s';
		for(int i=0;i<s.length();i++)
		{
		if(c[i]==replace)	
		{
			c[i]='%';
		}
		}
		System.out.println("char replace : "+Arrays.toString(c));
	}
	
	
	
	public static void addCahracter(String s)
	{
	String S=s.replace("u", "U");
	System.out.println(S);
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
