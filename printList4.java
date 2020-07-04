package JavaExercise;

import java.util.ArrayList;
import java.util.List;

public class printList4 {

	public static void main(String[] args) {
		String input = "Bugatti Chiron";
		
		List <Character> list = new ArrayList<Character>();
		
		for (int i = 0; i < input.length(); i++) {
			list.add(input.charAt(i));

	}
		int count =0;
		while (count<list.size()) {
			System.out.println(list.get(count));
			count++;
		}
	}
}
