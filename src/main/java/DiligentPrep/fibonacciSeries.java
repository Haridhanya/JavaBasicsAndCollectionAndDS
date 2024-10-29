package DiligentPrep;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		int n=10;
		System.out.println(first+"\n"+second);
		
		for(int i=2;i<=n;i++)
		{
			int third=first+second;
			System.out.println(third);
			first=second;
			second=third;
			
		}

	}

}
