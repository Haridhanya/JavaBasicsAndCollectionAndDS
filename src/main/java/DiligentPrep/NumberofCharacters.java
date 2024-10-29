package DiligentPrep;

public class NumberofCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Question 13: Write a Java Program to generate Output "aabbbcccc" with the input "a2b3c4"
//		

		String s="aabbbacccc";
		StringBuilder sb=new StringBuilder();
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			
				if(s.charAt(i)==s.charAt(i+1))
				{
					count++;
					//i++;
					
				}
				else
				{
					sb.append(s.charAt(i)).append(count);
					count=1;
				}
				
				
			
			
		}
		
		
		
		sb.append(s.charAt(s.length()-1)).append(count);
		System.out.print(sb);
		
	}

}
