package stringPrograms;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hari";
		s=s.toLowerCase();
	Boolean R=false;
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
			if((s.charAt(i))==(s.charAt(j)))
					{
				R=true;
				break;
					}
		}
		if(R==true)
		{
			System.out.println("First Repeated Character : "+s.charAt(i));
			break;
		}
	}
	if(R==false) {
		System.out.println("There is no repeat");
	}
	}

}
