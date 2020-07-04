package JavaExercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class printList3 {

	public static void main(String[] args) {
		
		String input = "Bugatti Chiron";
		
		List <Character> list = new ArrayList<Character>();
		
		for (int i = 0; i < input.length(); i++) {
			list.add(input.charAt(i));
		}
		Iterator <Character> iterator = list.iterator();
		while (iterator.hasNext()) {
			//Character character = (Character) iterator.next();
			System.out.println(iterator.next());
		}
	}

}
