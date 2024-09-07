package JavaNumbers;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sunny number is number whose next number is perfect square.
		//eg:80,where next num=81=square(9)
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int next=num+1;
		double squroot=Math.sqrt(next);
		System.out.println(squroot);
		if(squroot-(int)squroot==0)
		{
			System.out.println(num+" : is a sunny number");
		}
		else
		{
			System.out.println(num+" : is not a sunny number");
		}
		
		
		

	}

}
