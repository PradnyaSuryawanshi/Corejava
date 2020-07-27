package practice;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		Map<String,Integer> map= new HashMap<>();
		
		map.put("Pradnya", 1);
		map.put("Pratish", 2);
		map.put("Priti", 3);
		
		System.out.println(map);
		
		Map<String,Integer> map1= new HashMap<>();
		
		map1.put("Rohit", 4);
		map1.put("Rupesh", 5);
		map1.put("Mayur", 6);
		
		map1.putAll(map);
		System.out.println(map1);
		 
	}

}
