package JavaExercise;

public class reversseEvenString1 {

	public static void main(String[] args) {
		String Input = "When the world realise its own mistake, corona will dissolve automatically";
		String[] split = Input.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			if (i%2==0) {
				for (int j = 0; j < split.length; j++) {
					StringBuffer buffer = new StringBuffer(split[i]);
					String string = buffer.reverse().toString();
				}
			}
		}System.out.println(Input);
	}

}
