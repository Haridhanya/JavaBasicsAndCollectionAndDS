package stringPrograms;

public class FindWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words="Baaii PlannBaliing for a trip to Bali";
		String find="Bali";
		Boolean r=words.contains(find);
		System.out.println(r);
		
		int count=0;
		for(int i=0;i<words.length();i++)
		{
			if(find.charAt(0)==words.charAt(i)) {
				count=0;
				for(int j=0;j<find.length();j++)
				{
					if(words.charAt(i)==find.charAt(j))
					{
					count++;
					i++;
					}
				}
				if(count==find.length()){
	System.out.println("Yes we can see the word");}
				
			}
		}
		if(count==0)
		{
			System.out.println("the word is not present in this sentence");
		}
	}

}
