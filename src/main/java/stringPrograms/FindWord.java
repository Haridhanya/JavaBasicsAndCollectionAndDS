package stringPrograms;

public class FindWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words="Baaii PlannBaliing for a trip to Bali";
		String find="Bali";
		Boolean r=words.contains(find);
		System.out.println(r);
		//logic of contains
	 words=words.toLowerCase();
	 find=find.toLowerCase();
	int count=0;
		for(int i=0;i<words.length();i++)
		{
			if(words.charAt(i)==find.charAt(0))
			{
				count=0;
				for(int j=0;j<find.length();j++)
				{
					if(find.charAt(j)==words.charAt(i))
					{
						count++;
						i++;
					}
				}
				if(count==find.length())
				{
					System.out.println("we have fond the word");
				}
			}
			if(count==0)
			{
				System.out.println("the word is not there");
			}
		}
	}

}
