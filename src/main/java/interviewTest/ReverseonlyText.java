package interviewTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseonlyText {


	
	
	public static void main(String[] args) {
		String st = "test123given12la";

		// Compile a pattern that matches words with only letters (ignores numbers and special characters)
		Pattern p = Pattern.compile("[a-zA-Z]+|\\d");
		Matcher mat = p.matcher(st);
		StringBuffer sb=new StringBuffer();

		while (mat.find()) {
			String words=mat.group();
			if(words.matches("[a-zA-Z]+"))
			{
				sb.append(new StringBuffer(words).reverse());;
			}
			else
			{
				sb.append(words);
			}

		}
		

		System.out.println(sb.toString());
		
		
	
		
		
		
		
		
		
		
	}

}
