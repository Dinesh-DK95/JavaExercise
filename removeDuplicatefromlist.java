package JavaExercise;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicatefromlist {

	public static void main(String[] args) {
		String input = "A,B,C,D,A,D,E,F";
		String in = input.replaceAll(",", "");
		System.out.println(in);
		
		List <Character> list = new ArrayList<Character>();
		//List <Character> list = ['A','B','C','D','A','D','E','F']; not available in java 5 and 7
		for (int i = 0; i < in.length(); i++) {
			list.add(in.charAt(i));
		}
		Set <Character> set = new LinkedHashSet<Character>(list);
		System.out.println(set);
	}

}
