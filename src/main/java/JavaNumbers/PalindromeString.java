package JavaNumbers;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String Original=sc.nextLine();
		String reverse="";
		int len=Original.length();
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+Original.charAt(i);
			
		}
		if(reverse.equals(Original)) {
			System.out.println("Palindrome string");
		}
		else
		{
			System.out.println("not a palindrome string");
		}
		

	}

}
