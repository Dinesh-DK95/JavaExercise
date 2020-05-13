package JavaExercise;

public class Palindrome_Reverse2 {

	public static void main(String[] args) {
		String input1 = "malayalam";
		String input2 = "testleaf";
		//String Output = "";
		StringBuffer buffer = new StringBuffer(input1);
		// it is necessary convert to string after reverse
		String Output = buffer.reverse().toString();
		if (input1.equals(Output)) {
			System.out.println("Yes, Palindrome");
		}else {
			System.out.println("No, Not a Palindrome");
		}
	}

}
//Try String Builder 