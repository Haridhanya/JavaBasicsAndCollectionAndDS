package JavaNumbers;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int digit=0,sum=0;
		int num=sc.nextInt();
		int temp=num;
		
		while(temp>0)
		{
			temp=temp/10;
			digit++;
		}
		temp=num;
		while(num>0)
		{
			int last=num%10;//gives last digit
			sum=(int) (sum+Math.pow(last, digit));
			num=num/10;//removes the last digit
		}
		if(sum==temp)  
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not a armstrong number");
		}
	}

}
