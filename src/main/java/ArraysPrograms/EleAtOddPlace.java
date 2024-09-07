package ArraysPrograms;

public class EleAtOddPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a =new int[] {1,2,3,4,5,6};
		for(int i=1;i<a.length;i=i+2)
		{
		System.out.println("Elements at odd place : "+a[i]);	
		}
	}

}
