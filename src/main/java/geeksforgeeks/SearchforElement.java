package geeksforgeeks;

/*syntax:
for (int element : arr) {
    if (element == toCheckValue) {
        return true;
    }
}*/

public class SearchforElement {

	public static boolean search(int[] a,int key)
	{
		for(int element:a)
		{
			if(element==key)
			{
				return true;
			}
		}
		
		
		
		return false;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int key=7;
		boolean result=search(arr,key);
		System.out.println(result);
		

	}

}
