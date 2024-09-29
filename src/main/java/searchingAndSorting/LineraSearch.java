package searchingAndSorting;

public class LineraSearch {
	//linera Search-Traverse through the array,if found return else return -1
	
	public static boolean linearSearch(int a[],int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				return true;
			}
		}
		return false;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};
		boolean res=linearSearch(a,0);
		System.out.println(res);
	}

}
