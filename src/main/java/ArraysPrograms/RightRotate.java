package ArraysPrograms;

public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a=new int[] {1,2,3,4};
		int last;
		int i;
		int n=1;
		for(int k=0;k<n;k++)
		{
			 last=a[a.length-1];
		for(i=a.length-1; i > 0; i--)
		{
			a[i]=a[i-1];
			
		}
		a[0]=last;
		}
		for(int j=0;j<=a.length-1;j++)
		{
			System.out.println(a[j]);
		}

	}

}
