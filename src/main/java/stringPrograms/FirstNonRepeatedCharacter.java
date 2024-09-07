package stringPrograms;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="haridhanya";
		
		boolean repeat=false;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			repeat=false;
			for(int j=i+1;j<s.length();j++)
			{
				char ch1=s.charAt(j);
				if(ch==ch1)
					
				{
					//System.out.println("Repeated : "+ch);
					repeat=true;
					break;
				}
			}
			if(repeat==false) {
				System.out.println("First Non-repeatedCharacter : "+ch);
				break;
			}
					
		}

	
	}
}