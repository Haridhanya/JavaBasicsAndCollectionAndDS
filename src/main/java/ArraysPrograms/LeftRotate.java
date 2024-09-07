package ArraysPrograms;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a=new int[] {1,2,3,4};
		int first;
		int i;
		int n=2;
		for(int k=0;k<n;k++)
		{
			 first=a[0];
		for(i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
			
		}
		a[i]=first;
		}
		for(int j=0;j<=a.length-1;j++)
		{
			System.out.println(a[j]);
		}
		
	}

}
