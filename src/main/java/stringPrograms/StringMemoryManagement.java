package stringPrograms;

public class StringMemoryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= new String("hello,You are Awesome");
		String s2=s1;
		s1="Great";
		System.out.println("s1 : "+s1 +" s2 : "+s2);
		
		String s3=s2;
		s2="well";
		System.out.println("s1 : "+s1+" s2 : "+s2+" s3 : "+s3);
		
		

	}

}
