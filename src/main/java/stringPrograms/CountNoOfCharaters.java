package stringPrograms;

import java.util.Scanner;

public class CountNoOfCharaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int size=s.length();
		int count=0;
		int alpha=0;
		int num=0;
		int symbol=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
					{
				num++;
					}
			else if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
			{
				alpha++;
			}
			else 
			{
				symbol++;
			}
		}
		System.out.println("number : "+num+"\nAlphabet : "+alpha+"\nsymbol : "+symbol);
	
	}
	
}
