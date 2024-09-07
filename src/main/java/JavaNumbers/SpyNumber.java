package JavaNumbers;

public class SpyNumber {

	
	public static void spy(int num)
	{
        int temp=num;
		int sum=0;
		int last=0;
		int prod=1;
		while(num>0)
		{
			 last=num%10;
			 sum=sum+last;
			 prod=prod*last;
			 num=num/10;
			
		}
		if(sum==prod)
		{
	   System.out.println(temp + " is a Spy Number as "+ "product = "+prod+" & sum = "+sum);
		}
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=1000;i++)
		{
			spy(i);
		}
		
	}

}
