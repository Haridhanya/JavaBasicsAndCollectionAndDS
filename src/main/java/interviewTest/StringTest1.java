package interviewTest;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am an Indian";
		int left=0;
		char[] st=s.toCharArray();
		int right=s.length()-1;
		while(left<right)
		{
			if(s.charAt(left)==' ')
			{
				left++;
			}
			else if(s.charAt(right)==' ')
			{
				right--;
			}
			else
			{
				char ch=st[left];
				st[left]=st[right];
				st[right]=ch;
				left++;
				right--;
				
			}
		}
		System.out.println(st);
	

		
	}

}
