package JavaExercise;

public class Palindrome_Reverse1 {

	public static void main(String[] args) {
		String input1 = "malayalam";
		String input2 = "testleaf";
		String Output = "";
		int length = input2.length();
		for (int i = length-1; i >= 0; i--) {
			Output+=input2.charAt(i);
		}
		System.out.println(input2.equals(Output)?"Yes,Palindrome":"No,  Not a Palindrome");
	}

}
