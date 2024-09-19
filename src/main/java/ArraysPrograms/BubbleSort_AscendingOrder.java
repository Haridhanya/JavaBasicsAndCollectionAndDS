package ArraysPrograms;

public class BubbleSort_AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Bubble sort algo
		
		int[] a= {1,5,7,8,10,0};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		//print it
		for(int n:a)
		System.out.println(n);
		
		
		
	}

}
