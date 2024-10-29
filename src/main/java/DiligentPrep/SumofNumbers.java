package DiligentPrep;

public class SumofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] a= {"12aaa","hj7n8","9jkk7ll0"};
		String word="";
		String num="";
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			word=a[i];
		for(int j=0;j<word.length();j++)
		{
			if(word.charAt(j)>='0' && word.charAt(j)<='9')
			{
				num=num+word.charAt(j);
			}
		}
		System.out.println(num);
		 sum=sum+Integer.parseInt(num);
		 num="";
		
		}
		System.out.println(sum);
	}

}
