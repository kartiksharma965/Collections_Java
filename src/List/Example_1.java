package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.plaf.synth.SynthOptionPaneUI;

//Rule = Duplicate records are allowed in ArrayList.

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> obj =  new ArrayList<Object>();
		obj.add(9);
		obj.add(9.9);
		obj.add(true);
		obj.add('r');
		obj.add("rest assured");
		// Rule = Duplicate records are allowed in ArrayList.
		obj.add(9);
		obj.add(9.9);
		obj.add(true);
		obj.add('r');
		obj.add("rest assured");
		System.out.println("Total size of Arraylist :"+obj.size());
		System.out.println("All records of Arraylist :"+obj);
		
		System.out.println("*** For loop starts ***");
		for(int i=0; i<obj.size(); i++) {
			// fetching record.
			System.out.println(obj.get(i));
		}
		System.out.println("*** For loop ends ***");
		
		System.out.println("*** For Each loop starts ***");
		for(Object ob: obj) {
			// fetching record.
			System.out.println(ob);
		}
		System.out.println("*** For Each loop ends ***");
		
		System.out.println("*** Iterator start ***");
		Iterator itr=obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*** Iterator ends ***");
	}
}
