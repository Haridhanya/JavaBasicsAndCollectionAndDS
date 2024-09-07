package stringPrograms;

public class AlternateCaseChange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//alternate even characters to uppercase ,not using any inbuilt function
		String s="payilagam";
		//convert string into char array
		char[] c=s.toCharArray();
		//ippo we have to loop through the array to make changes
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0)
			{
				c[i]=(char)(c[i]-32);
				
			}
			
		}
		//now converting char to String for printing
		s=new String(c);
		System.out.println(s);
		
		

	}

}
