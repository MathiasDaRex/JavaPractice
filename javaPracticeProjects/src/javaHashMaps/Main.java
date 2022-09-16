package javaHashMaps;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// HashMap implements the Map interface (need import)
		// HashMap is similar to ArrayList, but with key-value pairs
		// stores objects, need to use Wrapper class
		// ex: (name,email),(username, userID,),(country,capital)
		
		HashMap<String, String> countries = new HashMap<>();
		
		// add a key and value
		countries.put("USA", "Washington DC");
		countries.put("India", "New Delhi");
		countries.put("Russia", "Moscow");
		countries.put("China", "Bejing");
		
		// System.out.println(countries);
		// countries.remove("USA");
		System.out.println(countries);
		System.out.println(countries.get("Russia"));
		//countries.clear();
		//System.out.println(countries);
		System.out.println(countries.size());
		countries.replace("USA", "Detroit");
		System.out.println(countries);
		
		for(String item : countries.keySet()) {
			System.out.print(item+"\t"+"= ");
			System.out.println(countries.get(item));
		}

	}

}
