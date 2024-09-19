package stringPrograms;

public class CountOccuranceofCharacters2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="haridhanya";
		int count =0;
		char[] c=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			char ch=c[i];
			count=1;
			if(c[i]=='\0')
			{
				continue;
			}
			for(int j=i+1;j<s.length();j++)
			{
				if(ch==c[j])
				{
					count++;
					c[j]='\0';
				}
			}
			System.out.println(ch+":"+count);
		}

	}

}
