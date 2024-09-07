package JavaNumbers;

public class OddorEven {
	
	public static void even(int start,int end)
	{
		System.out.println("Even numbers : ");
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void odd(int start,int end)
	{
		System.out.println("odd numbers : ");
		for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start=1;
		int end=10;
		//to find odd numbers between 1 to 10
		odd(start,end);
		even(start,end);

		
	}

}
