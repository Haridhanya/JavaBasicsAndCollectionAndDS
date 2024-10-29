package ArraysPrograms;

public class PairaddstoTarger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target=10;
		int[] a= {1,9,2,8,5,4,0,10};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==10)
				{
					System.out.println(a[i]+"+"+a[j]+"="+10);
				}
			}
		}
		

	}

}
