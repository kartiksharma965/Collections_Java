package List;

import java.util.ArrayList;
import java.util.List;

public class Example_4 {
	
	public static void main(String[] args) {
		
		List<Object> a= new ArrayList<Object>();
		a.add(9);
		a.add(9.9);
		a.add(true);
		a.add('r');
		a.add("ram");
		System.out.println("Total size of arraylist (a) :"+a.size());
		System.out.println("All records of arraylist (a) :"+a);
		System.out.println("Data at 4th index of arraylist (a) :"+a.get(4));
		System.out.println("Verif if 'hello' data exist in arraylist (a) :"+a.contains("hello"));
		a.add(3,8);
		a.add(4,88);
		a.add(5,888);
		System.out.println("After updation all records of arraylist (a) :"+a);
		a.remove(2);
		System.out.println("After removing single record now display all records of arraylist (a) :"+a);
		System.out.println("Verify if arraylist (a) is empty :"+a.isEmpty());
		// Rule : clear() will delete all records/data of arraylist.
		a.clear();
		System.out.println("After deleting all record display arraylist (a) :"+a);
		System.out.println("Verify if arraylist (a) is empty :"+a);
		
		
	}

}
