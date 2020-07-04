package JavaExercise;

import java.util.ArrayList;
import java.util.List;

public class printList2 {

	public static void main(String[] args) {
		String input = "Bugatti Chiron";
		
		List <Character> list = new ArrayList<Character>();
		
		for (int i = 0; i < input.length(); i++) {
			list.add(input.charAt(i));
		}
		for (Character character : list) {
			System.out.println(character);
		}
	}

}
