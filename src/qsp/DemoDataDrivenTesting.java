package qsp;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoDataDrivenTesting {
	
	public static void main(String[] args) throws InterruptedException {
		ArrayList<String> al = new ArrayList<String>();
		al.add("https://demo.actitime.com/");
		al.add("admin");
		al.add("manager");
		System.out.println(al.get(2));
		
		HashMap<String,String> hs = new HashMap<String,String>();
		hs.put("url","https://demo.actitime.com/");
		hs.put("un", "admin");
		hs.put("email","admin@actitime.com");
		hs.put("pw", "manager");
		System.out.println(hs.get("pw"));
	}
}
