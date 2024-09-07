package stringPrograms;

public class AlternateCaseChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="PaYIlagAM";
		//make even number of characters to upper and odd number of characters to lower
		for(int i=0;i<s1.length();i++)
		{
			if(i%2==0)
			{
			System.out.print(s1.substring(i,i+1).toUpperCase());
			}
			else
			{
				System.out.print(s1.substring(i,i+1).toLowerCase());
			}
		}

	}

}
