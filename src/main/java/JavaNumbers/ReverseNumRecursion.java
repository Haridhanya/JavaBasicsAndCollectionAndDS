package JavaNumbers;

public class ReverseNumRecursion {
	
	public static void reverse(int num)
	{
		if(num<10)
		{
			System.out.print(num);
		}
		else
		{
			System.out.print(num%10);
			reverse(num/10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12;
		reverse(num);
		

	}

}
