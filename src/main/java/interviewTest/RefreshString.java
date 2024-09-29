package interviewTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RefreshString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		14. Program iyuuuuuyu2022jhh2022-10-22ghghh; Output 2022-10-22
//		15. Program vigneswaran ezhil_ priority _ function; Output ezhil
		
		String name="vigneswaran ez0hil_ priority_function";
String[] sp=name.split("\\s|_|a");
//for(String st:sp)
//System.out.println(st);


//find a string that starts with space and ends with _
String regex="\\s[^_]*_";
//to compile the regex
Pattern p=Pattern.compile(regex);
Matcher mat=p.matcher(name);
if(mat.find())
System.out.println(mat.group());




	}

}
