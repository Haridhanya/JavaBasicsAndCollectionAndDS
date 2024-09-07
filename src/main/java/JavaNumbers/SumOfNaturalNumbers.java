package JavaNumbers;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=9;
		int sum=0;
		//using for loop
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		
System.out.println(sum);
sum=0;
//using while loop;l

	int a=1;
	while(a<=n)
	{
		sum=sum+a;
		a++;
	}
	System.out.println(sum);
	
	//using formula
	
	sum=0;
			
sum=n*(n+1)/2;
System.out.println(sum);
}
}