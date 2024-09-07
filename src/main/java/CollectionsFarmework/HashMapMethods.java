package CollectionsFarmework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(1, "hari");
		hm.put(2, "dhanya");
		hm.put(3, "lava");
		hm.put("id", 101);
		System.out.println(hm);
		HashMap<Integer,String> hm1 =new HashMap();
		hm1.put(102, "ice");
		hm.putAll(hm1);
		System.out.println(hm);
		System.out.println(hm.get(102));
		hm.remove(2);
		System.out.println(hm);
		System.out.println(hm.containsKey(3));
		System.out.println(hm.size());
		System.out.println(hm.keySet());
		Set ks=hm.keySet();
		for(Object k:ks)
		{
			System.out.print(k.hashCode());
		}
		System.out.println(hm.entrySet());
		
		
//entry interface oda methods

Set es=hm.entrySet();
Iterator it=es.iterator();
while(it.hasNext())
{
	Map.Entry e=(Entry) it.next();
	System.out.println(e);
}
 


	}

}
