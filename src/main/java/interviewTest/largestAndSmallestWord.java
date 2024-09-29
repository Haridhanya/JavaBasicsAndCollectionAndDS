package interviewTest;

public class largestAndSmallestWord {

	public static void main(String[] args) {

String s="its your time! wonderfull";
String[] s1=s.split("\\s");
String smallest=s1[0];
String longest=s1[0];
for(int i=0;i<s1.length;i++)
{
	if(s1[i].length()>longest.length())
	{
		longest=s1[i];
		
	}
	if(s1[i].length()<smallest.length())
	{
		smallest=s1[i];
	}
	
}
System.out.println("longest word : "+longest+"\n smallest word : "+smallest);


	}

}
