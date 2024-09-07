package ArraysPrograms;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {10,26,39,444,95,6};
		int largest=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(largest<a[i])
			{
				largest=a[i];
			
			}
		}
		System.out.println("largest element is : "+largest);

	}

}
