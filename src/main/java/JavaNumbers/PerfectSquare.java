package JavaNumbers;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find given number is perfect square
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
//		double sqr=Math.sqrt(n);
//		if(sqr-Math.floor(sqr)==0)
//		{
//			System.out.println("Perfect Square");
//		}
//		else
//		{
//			System.out.println("Not a perfect Square");
//		}
		//int num;//=n*n;
		int flag=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0 && num/i==i)
			{
				System.out.println("perfect square");
				flag=1;
			}
			
		}
		if(flag==0)
		{
			System.out.println("not a perfect sqaure");
		}
		
			
		

	}

}
