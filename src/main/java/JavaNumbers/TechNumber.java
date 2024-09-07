package JavaNumbers;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tech Numbers:Divide the number into two even numbera and sumup the 2 numbers adn square theta num
		//square num and the given num should be equals
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
	int num;
		int digit=0;
		int firsthalf=0,secondhalf=0;
		int sum=0,sqr=0;
		//int temp=num;
		//find number of digits
		for (int i=1;i<=10;i++)
		{
			num=i;		
		while(num>0)
		{
			digit++;
			num=num/10;
		}
		num=i;
		if(digit%2!=0)
		{
			System.out.println(num + " is Not a tech Number");
		}
		else
		{
			firsthalf= num % (int) Math.pow(10, digit / 2);  
			 secondhalf=num / (int) Math.pow(10, digit / 2); 
			 sum=firsthalf+secondhalf;
			 sqr=sum*sum;
			 
			 if(sqr==num)
			 {
				 System.out.println(num +" is Tech Number");
			 }
			 else
			 {
				 System.out.println(num+" is not a Tech number");
			 }}
		}
	

	}

}
