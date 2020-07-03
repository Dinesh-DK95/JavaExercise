package JavaExercise;

import java.util.LinkedHashSet;
import java.util.Set;

public class printDupCharacterUsingCollection {

	public static void main(String[] args) {
		
		
		String input = "When life gives you lemons, make lemonade";
		//System.out.println(input.length());
		
		Set<Character> set = new LinkedHashSet<Character> ();
		
		for (int i = 0; i < input.length(); i++) {
			
			if (!set.add(input.charAt(i))) {
				System.out.print(input.charAt(i)+ ",");
				
			}
		}
	}

}
