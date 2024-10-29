package DiligentPrep;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="I love java coding";
		int left=0;
		int right=a.length()-1;
		char[] ch=a.toCharArray();
		while(left<right)
		{
			if(ch[left]==' ') {
				left++;
				continue;
			}
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
		String s=new String(ch);
		System.out.println(s);
		

	}

}
