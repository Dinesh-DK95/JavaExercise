package JavaExercise;

import java.util.LinkedHashMap;
import java.util.Map;

public class printMap2 {

	public static void main(String[] args) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(); 
		map.put('A', 1);
		map.put('B', 2);
		map.put('C', 3);
		map.put('D', 4);
		map.put('E', 5);
		map.forEach((eachkey , eachvalue) -> System.out.println(eachkey +"->" + eachvalue));
		
	}

}
