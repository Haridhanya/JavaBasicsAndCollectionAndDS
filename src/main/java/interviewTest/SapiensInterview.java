package interviewTest;

public class SapiensInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//
//Input = I Love Java Coding
//Output = g nido Cava JevoLI
		
		String Input = "I Love Java Coding";
		char[] InputArray=Input.toCharArray();
		char[] ResultArray=new char[InputArray.length];
		StringBuffer sb=new StringBuffer();
		//count space in result array
		for(int i=0;i<Input.length();i++)
		{
			if(InputArray[i]==' ')
			{
				ResultArray[i]=InputArray[i];
			}
	
			
		}	
		
		//adding non-space characters to result array
		int j=0;
		for(int i=Input.length()-1;i>=0;i--) {
			
			if(ResultArray[i]!=' ')
			{
				ResultArray[j]=InputArray[i];
			}
			
			
			
		}
	
		System.out.println(sb);
		
	}

}
