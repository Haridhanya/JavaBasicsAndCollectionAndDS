package stringPrograms;

public class StartsWithLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Rose is Red";
		String s2="rose";
		int count=0;
		for(int i=0;i<s2.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(i)) {
				count++;
				continue;
			}
			else
			{
				System.out.println("Not starts with "+s2);
			}
		}
		if(count==s2.length())
		{
			System.out.println("Starts with "+s2);
		}

	}

}
