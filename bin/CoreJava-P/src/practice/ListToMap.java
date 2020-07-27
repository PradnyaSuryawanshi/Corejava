package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import static java.util.stream.Collectors.toMap;

public class ListToMap {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("C++");
		list.add("Python");
		list.add("php");
		System.out.println("List of String : " + list);

		// converting ArrayList to HashMap before Java 8
		Map<String, Integer> map = new HashMap<>();
		for (String str : list) {
			map.put(str, str.length());
		}
		System.out.println("Generated map values : " + map);

		// Converting ArrayList to HashMap in Java8
		Map<String, Integer> map8 = list.stream().collect(toMap(s -> s, s -> s.length()));
		System.out.println("Using Lambada : " + map8);
		
		map8 = list.stream().collect(toMap(Function.identity(), String::length));
		System.out.println("Using Method refernce : " +map8);
	}
}
