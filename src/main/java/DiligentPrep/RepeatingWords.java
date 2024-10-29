package DiligentPrep;

public class RepeatingWords {

	public static void main(String[] args) {
		String s="she does a lonsg she goes does not";
		String[] s1=s.split("\\s+");
		int count=1;
		for(int i=0;i<s1.length;i++)
		{
			count=1;
//			if(s1[i]==null)
//			{
//				continue;
//			}
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
				count++;
				//s1[j]=null;
				}
				
			}
			if(count>1)
			{
				System.out.println(s1[i]+":"+count);
			}
		}

	}

}
