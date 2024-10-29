package stringPrograms;

public class FirstAndLastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find first and last occurance of a word
		String s="uamazonaayy";
		int first=-1;
		int last=-1;
		char target='a';
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==target)
			{
				if(first==-1)
				{
				first=i;
				}
				last=i;
				
			}
		}
		if(first!=-1)
		{
			System.out.println("first : "+first+"\n last : "+last);
		}
		else
		{
			System.out.println("Target not found");
		}

	}

}
