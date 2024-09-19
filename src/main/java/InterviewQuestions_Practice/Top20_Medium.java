package InterviewQuestions_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Top20_Medium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//isprime();
		//ispalindrome();
		//isnumpali();
		//maxmin();
		//SecondMinMax();
		//swap();
		//anagram();
		//removeduplicate();
		//charCount();
		sumResult();
		
	}
		
		//1.Reverse a String
		public void ReverseString()
		{
		String s="sunflower";
		StringBuilder sb=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
		System.out.println("String Reverse : "+sb);
		}
		public void ReverseArray() {
		//2.Reverse Arrays
		int[] a= {2,3,4,5};
		int[] b=new int[a.length];int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		for(int n:b)
		System.out.print(n);
		}
		
		//3.Reverse array using Two pointers
		public void ReverseArrayTwopointers() {
		int[] arr= {1,2,3,4,5,6};
		int start=0;int end=arr.length-1;
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println("Reverse array using two pointers : "+Arrays.toString(arr));
		}
		
		//4.Split Words in  a sentence
		public void split() {
		String st="hard work never fails";
		st=st+" ";
		//String[] sp=new String[20];
		ArrayList<String> sp=new ArrayList<String>();
		String word="";
		int len=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)!=' ')
			{
				word=word+st.charAt(i);
			}
			else
			{
				//sp[len]=word;
				sp.add(word);
				len++;
				word="";
			}
		}
		System.out.println(sp);
		
		//reverse the list sentence
		Collections.reverse(sp);
		System.out.println(sp);
		}
		
		
		//5.Reverse words in string(easy way
		public void ReverseWords() {
		String str="A sunflower never hurts you";
		String[] split=str.split(" ");
		StringBuilder sbd=new StringBuilder();
		for(int i=split.length-1;i>=0;i--)
		{
			sbd=sbd.append(split[i]).append(" ");
		}
		
		System.out.println("revers words in a string easy way : "+sbd);
		
		

		
		
		
	}
	//6.prime number

	public static void isprime()
	{
	int num=17;int count=0;
	if(num<=1)
	{
		System.out.println("Not a prime");
	}
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			 count++;
		}


	
	}
	
	if(count!=0)
	{
		System.out.println("not a prime");
	}
	else
	{
		System.out.println("prime");
	}
	
	
	}

//is palindrome

public static void ispalindrome()
{
	String s="hellomadam";
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	
	//using two pointers
	int start=0;int end=s.length()-1;
	boolean flag=false;
	while(start<end)
	{
		if(s.charAt(start)!=s.charAt(end))
		{
			
			flag=true;
		}
		start++;end--;
		
	}
	if(flag==false)
	{
		System.out.println("yes palindrome");
	}else {System.out.println("not a palindrome");}
}

//8.number palindrome
public static void isnumpali()
{
	int num=12345;
	int rem=0;int rev=0;
	int dummy=num;
	//lets reverse the number
	while(num>0)
	{
		rem=num%10;
		rev=(rev*10)+rem;
		num=num/10;
	}
	if(rev==dummy)
	{System.out.println("palindrome number");
	}
	else
	{
		System.out.println("not a palindrome number");
	}

	
	
}

//max and min number of an array

public static void maxmin()
{
	int a[]= {1,4,5,7,0,9,10};
	int max=a[0];int min=a[0];
	for(int i=0;i<a.length-1;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("min : "+min+" "+"max : "+max);
}


//second min and second max

public static void SecondMinMax()
{
	
	//sort the array using bubble sort and then will check the min nad max
	
	int num[]= {1,2,3,45,67,89,90,100,101,0};
for(int i=0;i<num.length-1;i++) {
	for(int j=0;j<num.length-1;j++) {
		if(num[j]>num[j+1])
		{
			int temp=num[j];
			num[j]=num[j+1];
			num[j+1]=temp;
		}
	}
	
}
System.out.println("sorted arraya : "+Arrays.toString(num));
System.out.println("second largest : "+num[num.length-2]);
System.out.println("Second Smallest : "+num[1]);		
}

//valuseswap
public static void swap()
{
	
	int a=10,b=20;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a+" "+b);
}
//anagram
public static void anagram()
{
	String s1="hellomadam";
	String s2="madamhello";
	char[] s11=s1.toCharArray();
	char[] s22=s2.toCharArray();
	Arrays.sort(s11);
	Arrays.sort(s22);
	System.out.println(Arrays.toString(s11)+"\n"+Arrays.toString(s22));
	if(Arrays.equals(s11, s22))
	{
		System.out.println("Anagram");
	}
	else
	{
		System.out.println("not a anagram");
	}
}

//String without duplicates
public static void removeduplicate()
{
	String s="hello";
	s=s.toLowerCase();
	System.out.println(s);
	HashSet st=new HashSet<String>();
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<s.length();i++)
	{
		if(!(st.contains(s.charAt(i))))
		{
		st.add(s.charAt(i));
		sb.append(s.charAt(i));}
	}
	
	System.out.println(sb);
	
}
//count occurance of character and return as map

public static void charCount()
{
	String s="hellomadam";
	Map<Character,Integer> count=new LinkedHashMap<Character,Integer>();
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(count.containsKey(ch))//check if the char already there
		{
			count.put(ch, count.get(ch)+1);//if yes,get the char key and +1
		}
		else
		{
			count.put(ch, 1);
		}
		
	}
	System.out.println(count);
	
}
//given an array,find two numbers whose addition is int
public static void sumResult()
{
	int[] a= {1,3,4,6,7,8};
	int sum=8;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]+a[j]==sum)
			{
				System.out.println(a[i]+"+"+a[j]+"="+sum);
			}
		}
	}
}


Scanner sc=new Scanner(System.in);





}	
	


