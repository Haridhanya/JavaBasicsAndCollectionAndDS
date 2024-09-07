package ArraysPrograms;

public class leftRotateUntilOriginal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loop until the array is same as given number
		int a[]=new int[] {1,2,3,4};
		int first;
		
		int n=1;
		
		int i=0;
		for(int j=0;j<n;j++)
		{
			first=a[0];
		for(i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
			System.out.println(a[i]);
		}
		a[i]=first;
		System.out.println(a[i]+"\n----------");
		if(a[0]!=1)
		{
			n++;
		}
		}

	}

}
