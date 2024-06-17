package Practicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, List<String>> map_1 = new HashMap<String, List<String>>();
		// below list of email
		
		List<String> listofEmail= new ArrayList<String>();
		listofEmail.add("test1@gmail.com");
		listofEmail.add("test2@gmail.com");
		listofEmail.add("test3@gmail.com");
		listofEmail.add("test4@gmail.com");
		listofEmail.add("test5@gmail.com");
		listofEmail.add("test6@gmail.com");
		
		map_1.put("username1", listofEmail);
		map_1.put("username2", listofEmail);
		map_1.put("username_3", listofEmail);
		System.out.println(map_1);
		
		

	}

}
