package JavaNumbers;

public class petersonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum of factorial of the digits are equal to given number
		
		int num=5;
		int fact=1;
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			while(i>0)
			{
				fact=fact*i;
				i--;
			}
			sum=sum+fact;
			fact=1;
		}
		System.out.println(sum);

	}

}
