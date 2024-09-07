package JavaNumbers;

import java.util.Scanner;

public class PrimeNumbers3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Enter prime numbers between start and end numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start number");
		int start=sc.nextInt();
		System.out.println("Enter end Number");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i<=1)
			{
				System.out.println(i+" : is not a prime number");
			}
			
			else if(i>2 && i%2==0)
			{
				System.out.println(i+" : is not a prime number");
			}
			else
			{
				System.out.println(i+" : is a prime number");
			}
		}
		
		

	}

}
