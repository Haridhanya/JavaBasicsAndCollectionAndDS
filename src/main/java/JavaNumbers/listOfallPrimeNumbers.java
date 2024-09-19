package JavaNumbers;

public class listOfallPrimeNumbers {

	public static boolean isprime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
		
		
		


		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=4;
		
			for(int i=2;i<=num;i++)
			{
				if(isprime(i))
				{
					System.out.println(i);
				}
			}
			
			
			
		
		

	}

}
