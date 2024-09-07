package JavaNumbers;

import java.util.Scanner;

public class ListOfSunnyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sunny number is number whose next number is perfect square.
				//eg:80,where next num=81=square(9)
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter start number : ");
				int start=sc.nextInt();
				System.out.println("Enter end number : ");
				int end=sc.nextInt();
				for(int i=start;i<=end;i++)
				{
					int next=i+1;
					double squroot=Math.sqrt(next);
					if(squroot-(int)squroot==0)
					{
						System.out.println(i+" : is a sunny number");
												
					}
					else
					{
						System.out.println(i+" : is not a sunny number");
					}
				}
				
				
				
				
				
				

	}

}
