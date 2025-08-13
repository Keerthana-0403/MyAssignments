package w2d2homeassignment;


public class Changeme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		char[] chars = test.toCharArray();
		for (int i = chars.length - 1; i>=0; i--) {
			if (i % 2 != 0) {
				chars[i] = Character.toUpperCase(chars[i]);
				System.out.println(new String(chars));
			}
		}
	}
}

