package JavaExercise;

import java.util.ArrayList;
import java.util.List;

public class printDuplicateChar2 {

	public static void main(String[] args) {
		String input = "When life gives you lemons, make lemonade";
		List <Character> list = new ArrayList<Character>();
		
		for (int i = 0; i < input.length(); i++) {
			if (!list.contains(input.charAt(i))) {
				list.add(input.charAt(i));
			}else {
				System.out.print(input.charAt(i)+ ",");

			}
		}
	}

}
