package JavaNumbers;

import java.util.Scanner;

public class ATMProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	In Java, we can create an ATM program for representing ATM transection. In the ATM program, 
		the user has to select an option from the options displayed on the screen. 
		The options are related to withdraw the money, deposit the money, check the balance, and exit.

		To withdraw the money, we simply get the withdrawal amount from the user and 
		remove that amount from the total balance and print the successful message.

		To deposit the money, we simply get the deposit amount from the user, 
		add it to the total balance and print the successful message. */
		
		System.out.println("Enter 1 for deposit");
		System.out.println("Enter 2 for Withdrawal");
		System.out.println("Enter 3 for Check Balance");
		System.out.println("Enter 4 to Exit");
		int balance=100;
		Scanner sc =new Scanner(System.in);
		
		int Choice=sc.nextInt();
		switch(Choice)
		{
			case 1:
				System.out.println("Enter the amount for deposit");
				int deposit=sc.nextInt();
				if(deposit>0)
				{balance=balance+deposit;}
				else {
					System.out.println("Enter Valid number greater than 0");
				}break;
			case 2:
				System.out.println("Enter the amount for withdrawal");
				int withdraw=sc.nextInt();
				if(withdraw>0 && balance>0)
				{balance=balance-withdraw;}				
				else {
					System.out.println("Enter Valid number greater than 0");
				}break;
			case 3:
				System.out.println("Your Current balance is :"+balance);break;
				case 4:
				System.exit(0);
							
		}
		System.out.println("Your Current balance is : "+balance);

	}

}
