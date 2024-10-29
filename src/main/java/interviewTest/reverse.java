package interviewTest;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Good @@! Morning @@!";
		String[] a=s.split("\\s");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<a.length;i++)
		{
			String s1=a[i];
			if((s1.charAt(0)>='a'&& s1.charAt(0)<='z')||(s1.charAt(0)>='A'&& s1.charAt(0)<='Z'))
			{
				sb.append(new StringBuilder(s1).reverse());
			}
			else
			{
				sb.append(s1);
			}
			sb.append(" ");
		}
		System.out.println(sb);
		

	}

}
