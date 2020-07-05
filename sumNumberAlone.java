package JavaExercise;

public class sumNumberAlone {

	public static void main(String[] args) {
		String input="asdf1qwer9as8d7";
		String in = input.replaceAll("[^0-9]", "");
		char[] charArray = in.toCharArray();
		//int parseInt = Integer.parseInt(String.valueOf(charArray[i]));
		int output =0;
		for (int i = 0; i < charArray.length; i++) {
			int parseInt = Integer.parseInt(String.valueOf(charArray[i]));

			output+=parseInt;
			
		}System.out.println("The Sum of Given Number is "+output);
		
	}

}
