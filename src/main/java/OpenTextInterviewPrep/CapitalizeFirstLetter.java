package OpenTextInterviewPrep;

public class CapitalizeFirstLetter {

	
	public static void main(String[]args)
	{
		String s="hari dhanya likes sun flower";
		String[] words=s.split(" ");
		StringBuffer sb=new StringBuffer();
		for(String word:words)
		{
			sb.append(Character.toUpperCase(word.charAt(0)))
			.append(word.substring(1))
			.append(" ");
		}
		System.out.println(sb);
	}
	
	
}
