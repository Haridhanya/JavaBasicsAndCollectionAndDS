package DiligentPrep;

public class swapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="hari";
		String s2="dhanya";
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s1+"-"+s2);
		
		

	}

}
