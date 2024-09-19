package fileAndexceptionHandling;

public class exceptionHandling {

	public static void main(String[] args) throws Exception {
		try {
		int a=5/0;}catch(ArithmeticException e) {e.printStackTrace();}
		catch(Exception e) {e.printStackTrace();}
		System.out.println("hello");
		
		
		throw new Exception("i am doing great work");
		
		

	}

}
