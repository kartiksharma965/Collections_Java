package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> a= new HashMap<Integer, String>();
		a.put(10, "10");
		a.put(20,"20");
		a.put(30, "30");
		a.put(40,"40");
		a.put(50, "50");
		a.put(60, "60");
		System.out.println("Total size of HashMap(a) :"+a.size());
		System.out.println("All records of HashMap(a) :"+a);
		
		System.out.println("*** Scenario 1 :Fetching Key and Value using entrySet() method ***");
		Set<Entry<Integer, String>> entry=a.entrySet();
		Iterator<Entry<Integer, String>> itr=entry.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*** Scenario 1 ends ***");
		
		System.out.println("*** Scenario 2 : Fetching key using entrySet() method ***");
		Set<Entry<Integer, String>>entry_1=a.entrySet();
		Iterator<Entry <Integer, String>>itr_1=entry_1.iterator();
		while(itr_1.hasNext()) {
			System.out.println(itr_1.next().getKey());
		}
		
		System.out.println("*** Scenario 2 ends ***");
		
		System.out.println("*** Scenario 3 : Fetching Value using entrySet() method ***");
		
		Set<Entry<Integer, String >>entry_2=a.entrySet();
		Iterator <Entry<Integer, String>>itr_2=entry_2.iterator();
		while(itr_2.hasNext()) {
			System.out.println(itr_2.next().getValue());
		}
		
		System.out.println("*** Scenario 3 ends ****");
	}

}
