package stringPrograms;

import java.util.Scanner;

public class CountConsonantsAndVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int size=s.length();
		int vowels=0;
		int consonants=0;
		for(int i=0;i<size;i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowels++;
							}
			else
			{
				consonants++;
			}
		}
		
		System.out.println("Vowels : "+vowels+"\nconsonants : "+consonants);
		
	}

}
