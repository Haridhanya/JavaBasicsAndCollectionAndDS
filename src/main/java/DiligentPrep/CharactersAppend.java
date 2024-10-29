package DiligentPrep;

public class CharactersAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aabbbacccc";
		StringBuilder sb=new StringBuilder();
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				sb.append(s.charAt(i)).append(count);
				count=1;
			}
		}
		sb.append(s.charAt(s.length()-1)).append(count);
		System.out.println(sb);

	}

}
