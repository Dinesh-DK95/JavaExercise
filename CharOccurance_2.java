package JavaExercise;

public class CharOccurance_2 {

	public static void main(String[] args) {
		String input = "You have no choice other than following me!";
		//int length = input.length();
		int count=0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i)=='o') {
				count++;
			}
			
		}System.out.println("The Char Occurrenace of 'o' is " +count);
	}

}
