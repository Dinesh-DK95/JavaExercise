package JavaExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class printMap3 {

	public static void main(String[] args) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(); 
		map.put('A', 1);
		map.put('B', 2);
		map.put('C', 3);
		map.put('D', 4);
		map.put('E', 5);
		for (Entry<Character,Integer> eachentry : map.entrySet()) {
			System.out.println(eachentry.getKey() +"->" + eachentry.getValue());
		}
	}

}
