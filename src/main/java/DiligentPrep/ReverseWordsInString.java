package DiligentPrep;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I love java coding";
		//reverse whole sentence
		String[] s1=s.split("\\s");
	 String reverse="";
	 int len=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);

	
	
	
	//reverse only the words in the sentence
	StringBuilder sb=new StringBuilder();
	for(int j=s1.length-1;j>=0;j--)
	{
	sb.append(s1[j]).append(" ");
	}
System.out.println(sb);



//reverse each word in the sentence without changing its oreder

StringBuilder Reversed=new StringBuilder();
for(String words:s1)
{

	StringBuilder sbw=new StringBuilder(words);
	Reversed.append(sbw.reverse()).append(" ");
}
System.out.println(Reversed);
}}
