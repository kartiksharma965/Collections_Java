package List;

import java.util.ArrayList;
import java.util.List;
// Rule = retainAll() method we can retain only matching records/data.*/
public class Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> a = new ArrayList<Object>();
		a.add(true);
		a.add('l');
		a.add("welcome");
		a.add(9);
		a.add(9.9);
		System.out.println("Total size of arraylist (a) :"+a.size());
		System.out.println("All records of arraylist (a) :"+a);
		
		List<Object> b = new ArrayList<Object>();
		b.add(true);
		b.add('l');
		b.add("welcome");
		b.add(9);
		b.add(99);
		b.add(99.99);
		System.out.println("Total size of arraylist (b) :"+b.size());
		System.out.println("All records of arraylist (b) :"+b);
		
		System.out.println("*** Scenario : removeall() method ***");
		// Rule = retainAll() method we can retain only matching records/data.
		a.retainAll(b);
		System.out.println("Arraylist a after retaining matching data :"+a);
		
		
		
		
		
		

	}

}
