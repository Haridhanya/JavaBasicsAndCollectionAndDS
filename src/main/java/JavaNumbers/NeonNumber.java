package JavaNumbers;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sqr=num*num;
		int sum=0;
		while(sqr>0)
		{
			int last=sqr%10;//stores last digit
			sum=sum+last;//sum up last digits
			sqr=sqr/10;//removes last digit
		}
		System.out.println(sum);
		if(sum==num)
		{
			System.out.println("it is a neon number");
		}
		else
		{
			System.out.println("it is not a neon number");
		}
		

	}

}
