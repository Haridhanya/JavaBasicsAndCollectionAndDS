package interviewTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//14. Program iyuuuuuyu2022jhh2022-10-22ghghh; Output 2022-10-22
		String date="iyuuuuuyu2022jhh2022-10-22ghghh";
		String regex="(\\d{4})-(\\d{2})-(\\d{1,2})";
		Pattern p=Pattern.compile(regex);
		Matcher mat=p.matcher(date);
		if(mat.find())
			System.out.println(mat.group(0));
		
		

	}

}
