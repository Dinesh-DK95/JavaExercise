package JavaExercise;

public class CharOccurance {

	public static void main(String[] args) {

		String input = "You have no choice other than following me!";
		String output = input.replaceAll("[^o]", "");
		int CharOccurrance = output.length();
		System.out.println("The Char Occurrenace of 'o' is " + CharOccurrance);
	}

}
