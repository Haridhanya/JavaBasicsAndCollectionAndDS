package stringPrograms;

public class EndsWithLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hard work never Fail";
		String s2="fails";
		int count=0;
		for(int i=s2.length()-1;i>=0;i--)
		{
			for(int j=s1.length()-1;j>=0;j--)
			{
				if(s2.charAt(i)==s1.charAt(j))
				{
					count++;
				}
					
			}
		
		}
		if(s2.length()==count)
		{
			System.out.println("s1 ends with "+s2);
		}
		else
		{
			System.out.println("not ends with s2");
		}

	}

}
