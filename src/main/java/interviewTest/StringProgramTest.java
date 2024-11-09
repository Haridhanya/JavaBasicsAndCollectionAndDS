package interviewTest;

public class StringProgramTest {

	public static void main(String[] args) {
		String  teststring= "I    love      java   coding";
		StringBuilder sb=new StringBuilder();
		Boolean first_space=false;
		for(int i=0;i<teststring.length();i++)
		{
			if(teststring.charAt(i)!=' ')
			{
				sb.append(teststring.charAt(i));
				first_space=true;
			}
			else if(first_space==true)
			{
				sb.append(" ");
				first_space=false;
			}
		}
		System.out.println(sb);

	}

}
