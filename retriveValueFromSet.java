package JavaExercise;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class retriveValueFromSet {

	public static void main(String[] args) {
		String input = "1,2,3,4,5,6,7,8,9";
		String in = input.replaceAll(",", "");
		System.out.println(in);
		Set <Character> set = new LinkedHashSet<Character>();

		//List <Character> list = ['A','B','C','D','A','D','E','F']; not available in java 5 and 7
		for (int i = 0; i < in.length(); i++) {
			set.add(in.charAt(i));
		}
		List <Character> list = new ArrayList<Character>(set);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)== '7') {
				System.out.println(list.get(i));
			}
		}
	}

}
