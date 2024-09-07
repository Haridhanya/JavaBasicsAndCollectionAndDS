package stringPrograms;

public class RemoveUnwantedSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hardwork    never     fails";
		Boolean first_space=false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				System.out.print(s.charAt(i));
				first_space=true;
			}
			else if(first_space==true)
			{
				System.out.print(s.charAt(i));
				first_space=false;
			}
		}
		

	}

}
