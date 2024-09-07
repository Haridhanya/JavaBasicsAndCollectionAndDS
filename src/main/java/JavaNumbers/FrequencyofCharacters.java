package JavaNumbers;

import java.util.Scanner;

public class FrequencyofCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string =123hari567dhanya1606
		//find the frequency of each charaters in the given string
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		char ch=0;
		String s=sc.nextLine();
		int count=0;
		for(char c='a';c<='z';c++)
		{
			count=0;
			for(int i=0;i<s.length();i++)
			{
				ch=s.charAt(i);
				if(ch==c)
				{
					count++;
				}
				
			}
			if(count>0)
			{
			System.out.println("frequency of "+c+" is : "+count);}
			
		}

	}

}
