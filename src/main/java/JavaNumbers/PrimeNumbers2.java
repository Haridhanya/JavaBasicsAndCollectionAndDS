package JavaNumbers;

public class PrimeNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PRIME NUMBER BOOLEan
		int n=2;
		if(isprime(n)) {
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
		
	}
		public static boolean isprime(int n)
		{
			if(n<=1)
			{
				return false;
			}
			for(int i=2;i<=n;i++)
			{
				if(n%2==0)
				{
					return false;
				}
			}
			return true;
		}

	}


