package ArraysPrograms;

public class PlusOne_Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] digits=new int[] {1,2,3};
		int[] res=plusOne(digits);
		for(int i:res)
		System.out.println(i);
		
	}
		
		
		public static int[] plusOne(int[] digits) {
		int n=digits.length;
		for(int i=n-1;i>=0;i--)
		{
		    if(digits[i]<9)
		    {
		digits[i]++;
		return digits;
		    }
		    digits[i]=0;
		}
		digits=new int[n+1];
		digits[0]=1;
		return digits;
		        
		        
		    }
	

	}


