package stringPrograms;

import java.util.Scanner;

public class CountOfPunctuations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int size=s.length();
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(!(s.charAt(i)>='a' && s.charAt(i)<='z') && s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
