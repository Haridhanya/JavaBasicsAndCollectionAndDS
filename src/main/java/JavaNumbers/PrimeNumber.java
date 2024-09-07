package JavaNumbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//prime number : Number graeter than 1 and divisible by 1 and itself only
		
		System.out.println("Enter a number");
		int flag=0;
        Scanner Sc=new Scanner(System.in);
        int num=Sc.nextInt();
        if(num==0||num==1)
        {
        	System.out.println("Not a prime Number");        	
        }
        else
        {
        	for(int i=2;i<num;i++) {
        		if(num%i==0) {
        			System.out.println("not Prime number");
        			flag=1;
        			break;
        			
        			}
        		
        		
        	}
        	if(flag==0)
    		{
    			System.out.println("prime");
    		}
    		
        }
        
        

	}

}
