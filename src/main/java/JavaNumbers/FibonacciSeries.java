package JavaNumbers;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fibonacci series
		//0,1,1,2,3,5,8,13...
		int n1=0,n2=1,n3;
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the count for fibonacci series");
		int count=Sc.nextInt();
		System.out.println(n1 +"\n"+n2);
		for(int i=2;i<count;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
		
		

	}

}
