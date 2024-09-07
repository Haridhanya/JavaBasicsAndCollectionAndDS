package ArraysPrograms;

public class EleAtEvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {1,2,3,4,5,6};
		for(int i=2;i<a.length;i=i+2)
		{
			System.out.println("Element at even place is : "+a[i]);
		}

	}

}
