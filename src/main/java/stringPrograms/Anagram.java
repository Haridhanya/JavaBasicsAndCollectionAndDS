package stringPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="HaRidHn yaa";
		String s2="haRi dHAANY";
		if(s1.length()!=s2.length())
		{
			System.out.println("not a anagram");
			System.exit(0);
			
		}
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		//converting both into char arrays
		
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		//sorting the charaters
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println("Program  continued");
		if(Arrays.equals(a, b))
		{
			System.out.println("Anagram");
		}
		

	}

}
