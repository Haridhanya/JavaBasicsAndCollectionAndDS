package ArraysPrograms;

public class SumofAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a =new int[] {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{

			sum=sum+a[i];
		}
		System.out.println("Sum of all elements : "+sum);
	}

}
