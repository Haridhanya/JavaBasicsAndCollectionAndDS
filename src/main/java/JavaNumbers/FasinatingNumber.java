package JavaNumbers;

public class FasinatingNumber {

	
		// TODO Auto-generated method stub
		
		/*Multiplying a number by two and three separately, the number obtained by writing the results 
		obtained with the given number will be called a fascinating number. 
		If the result obtained after concatenation contains all digits from 1 to 9, exactly once */
		public static void fasinating(int num)
		{
					
		int n1=num;
		int n2=0,n3=0;
		int count=0;
		n2=n1*2;
		n3=n1*3;
		String Concat=""+n1+n2+n3;
		
		int leng=Concat.length();
		Boolean found=true;
		for(char c='1';c<='9';c++)
		{
			count=0;
			for(int i=0;i<leng;i++)
			{
				char ch=Concat.charAt(i);
				if(ch==c)
				{
					count++;
				}
			}
			if(count==0||count>1)
			{
				//System.out.println("Not a facinating Number");
				found=false;
				break;
			}
			
		}
		if(found)
		{
			System.out.println(Concat);
			System.out.println(num + " : It is  a facinating Number");
		}
		
		

	}
	}

