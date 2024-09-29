package CollectionsFarmework;

import java.util.HashMap;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Map<Integer,String> m=new HashMap<>();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");

		for(Map.Entry<Integer,String> e:m.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}

	}

}
