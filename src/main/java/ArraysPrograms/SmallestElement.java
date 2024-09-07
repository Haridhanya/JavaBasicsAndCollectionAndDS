package ArraysPrograms;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a =new int[] {12,23,45,666,77,1,10};
		int smallest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(smallest>a[i])
			{
				smallest=a[i];
			}
		}
		System.out.println("Smallest Element is: "+smallest);
		

	}

}
