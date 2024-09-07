package JavaNumbers;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reverse of a number is equal
		int num=131;
		int temp=num,sum=0;
		while(num>0)
		{
			int rev=num%10;
			sum=(sum*10)+rev;
			num=num/10;
			
		}
		if(sum==temp)
		{
			System.out.println("PALINDROME NUMBER");
		}
		else
		{
			System.out.println("NOT A PALINDROME NUMBER");
		}
		

	}

}
