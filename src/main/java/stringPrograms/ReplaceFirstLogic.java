package stringPrograms;

public class ReplaceFirstLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.check the the words is contains the sentence
		//2.find the start adn end indes
		//3.replace the index with new word
		//4.do append before and after words to the sentences.
		String s="A rose flower will not hurt you";
		String find="rhse";
		String replace="sun";
		String news="";
		int count=0;
		int start=0;
		int end=0;
		boolean y=false;
//		//logic to find and replace the string
//		Boolean cont=s.contains(find);
//		if(cont==true) {
//			s.replace("rose","sun");
//			System.out.println(s.replace("rose","sun"));}
		
		//check whether the word is present
		for(int i=0;i<s.length();i++)
		{
			if(find.charAt(0)==s.charAt(i))
			{
				count=0;
				start=i;
				for(int j=0;j<find.length();j++)
				{
					if(find.charAt(j)==s.charAt(i)) {
						count++;
						i++;
					}
				}
				if(count==find.length())
				{
					end=i;
					System.out.println("word found");
					System.out.println(start+" "+end);
					replace(s,replace,start,end);
					y=true;
					break;
				}
			}
			
		}
		if(y==false)
		{
			System.out.println("word not found");
		}
		
		

	}

	private static void replace(String s, String replace, int start, int end) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<start;i++)
		{
			sb.append(s.charAt(i));
		}
		sb.append(replace);
		for(int j=end;j<s.length();j++)
		{
			sb.append(s.charAt(j));
		}
		System.out.println(sb);
	}

}
