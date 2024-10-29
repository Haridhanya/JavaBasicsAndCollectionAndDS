package OpenTextInterviewPrep;

public class reverseStringPreservingSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I love java Coding";
		char[] ch=s.toCharArray();
		int left=0;
		int right=s.length()-1;
		
		//traversing string from both the ends
		while(left<right) {
			//skip s[ace fom left
			if(ch[left]==' ')
			{
				left++;
				continue;
			}
			//skip space from right
			if(ch[right]==' ')
			{
				right--;
				continue;
			}
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			
			left++;
			right--;
		}
		String s1=new String(ch);
		System.out.println(s1);
		
		
		
		

	}

}
