package stringPrograms;

public class CharacterExtractionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I want to be a SDET";
		System.out.println(s.substring(10));
		System.out.println(s.substring(6,10));
		System.out.println(s.subSequence(6, 10));
	}

}
