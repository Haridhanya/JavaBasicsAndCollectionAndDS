package stringPrograms;

public class SmallestandLargestWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hardship always takes ordinary people for an extraordinary destiny ";
		System.out.println(s);
		//String[] words=s.split("\\s");
		//split logic
		String word=" ";
		int len=0;
		String[] words=new String[100];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				word=word+s.charAt(i);
			}
			else
			{
				words[len]=word;
				word="";
				len++;
			}
		}
		
		
		System.out.println(words[8]);
		String smallest="";
		String Largest="";
		smallest=Largest=words[0];
		//smallest
		for(int i=1;i<len;i++)
		{
			if(smallest.length()>words[i].length())
			{
				smallest=words[i];
			}
			if(Largest.length()<words[i].length())
			{
				Largest=words[i];
			}
		}
		System.out.println("Smallest word is : "+smallest);
		System.out.println("Largest word is : "+Largest);
		
		

	}

}
