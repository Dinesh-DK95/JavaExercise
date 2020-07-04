package JavaExercise;

import java.util.ArrayList;
import java.util.List;

public class printList {

	public static void main(String[] args) {
		String input = "Bugatti Chiron";
		
		List <Character> list = new ArrayList<Character>();
		
		for (int i = 0; i < input.length(); i++) {
			list.add(input.charAt(i));
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
