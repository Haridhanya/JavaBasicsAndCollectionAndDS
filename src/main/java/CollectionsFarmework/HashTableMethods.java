package CollectionsFarmework;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht=new Hashtable();
		ht.put(100, "honeybee");
		ht.put(101, "bubblebee");
		ht.put(102, "ramSita");
		ht.put(103, "bhagatvat gita");
		System.out.println(ht);
		System.out.println(ht.get(100));
		System.out.println(ht.values());
		System.out.println(ht.keySet());
		//getkey,get value or set value 
        Set set=ht.entrySet();
        System.out.println(set);

Iterator it=set.iterator();
while(it.hasNext())
{
	Map.Entry e=(Entry) it.next();
	System.out.println(e.getKey()); 
}

		

	}

}
