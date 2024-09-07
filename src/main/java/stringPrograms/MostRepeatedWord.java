package stringPrograms;

public class MostRepeatedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findin most repeated word in sentence.
		String s="hari i am doing good hari good bye hari";
		//System.out.println(s.toLowerCase());
		String[] words=s.split("\\s");
		
		int count=0;
		String maxrp="";
		int save=0;
		int i=0;
		for(i=0;i<words.length;i++)
		{
			count=0;
			for(int j=i+1;j<words.length;j++)
			{
				
				if(words[i].equals(words[j]))
				
				{
                 count++;

				}
			}
			if(save<count)
			{
				maxrp=words[i];
				save=count;
				
			}
		}
		System.out.println(maxrp);
		
		

	}

}
