package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Rule = We can have only one Null key and multiple Null values.
public class Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> a = new HashMap<Integer, String>();
		a.put(6, null);
		a.put(5, null);
		a.put(4, "test4");
		a.put(3, "test3");
		a.put(2, "test2");
		a.put(1, "test1");
		System.out.println("Total size of HashMap(a) :"+a.size());
		System.out.println("All records of HashMap(b) :"+a);
		
		System.out.println("*** Fetching key and value using entrySet() method ***");
		System.out.println("*** Scenario 1 : for each loop ***");
		for(Map.Entry<Integer, String> entry : a.entrySet()) {
			System.out.println(entry.getKey()+"******"+entry.getValue());
		}
		System.out.println("*** Scenario 1 : ennds ***");
		
		System.out.println("*** Scenario 2 : Fetching key using keyset() method ***");
		Set<Integer> keyset =a.keySet();
		Iterator<Integer>itr= keyset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*** Scenario 2 : ends ***");
		
	    System.out.println("*** Scenario 3 :Fetching value using keyset() method ***");
	    Set<Integer>keyset_1=a.keySet();
	    Iterator<Integer> itr_2=keyset_1.iterator();
	    while(itr_2.hasNext()) {
	    	System.out.println(a.get(itr_2.next()));
	    }
	    
	    System.out.println("*** Scenario 3 : ends ***");
	}
}
