package interviewTest;

import java.util.HashMap;
import java.util.Map;

public class OneTrustInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "value1");
		map.put(2, "v2");
		map.put(3, "issue3");
		map.put(4, "vv4");
		map.put(5, "vcheck5");
		map.put(6, "vss6");
		String s="";
		for(Map.Entry<Integer, String> m:map.entrySet())
		{
			int key=m.getKey();
			String value=m.getValue();
			for(int i=value.length()-1;i>=0;i--)
			{
				if(value.charAt(i)>='a' && value.charAt(i)<='z')
				{
					s=s+value.charAt(i);
				}
				//s=s+value.charAt(value.length()-1);
			}
			
			System.out.println(key+":"+s+value.charAt(value.length()-1));
			s="";
		}

	}

}
