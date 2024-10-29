package DiligentPrep;

public class printcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="a2b3c4";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length()-1;i++)
		{
			if(Character.isLetter(s.charAt(i)) && Character.isDigit(s.charAt(i+1)))
			{
				int count=Character.getNumericValue(s.charAt(i+1));
				while(count>0)
				{
					sb.append(s.charAt(i));
					count--;
				}
				i++;
			}
			
		}
		System.out.println(sb);
		
			
	}

}
