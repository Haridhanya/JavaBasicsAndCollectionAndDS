package stringPrograms;

import java.util.Arrays;

public class DivideNEqualParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="iiiiiiiiii";
	int size=s.length();
	String words="";
	int count=0;
	String[] st=new String[2];
	int i=0;
	if(size%5!=0)
	{
System.out.println("cant didvide into n eqaual parts");
	}
	else
	{
		s=s+" ";
		for(i=0;i<size;i++)
		{
			if(count<=5)
			{
				words=words+s.charAt(i);
				count++;
			}
			else
			{
				int len=0;
				st[len]=words;
				words="";
				count=0;
				len++;
			}
		}
		System.out.println(Arrays.toString(st));
	}
	

	}}
