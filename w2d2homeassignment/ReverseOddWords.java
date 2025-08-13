package w2d2homeassignment;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester";
		String[] words = test.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (i % 2 != 0) {

				char[] chars = words[i].toCharArray();

				for (int left = 0, right = chars.length - 1; left < right; left++, right--) {
					char temp = chars[left];
					chars[left] = chars[right];
					chars[right] = temp;
				}

				words[i] = new String(chars);
			}
		}
		for (int i1 = 0; i1 < words.length; i1++) {
			System.out.print(words[i1] + " ");
		}
	}
}
