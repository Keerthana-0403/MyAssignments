package w2d2homeassignment;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3, 2, 11, 4, 6, 7};
		int b[] = {1, 11, 8, 5, 9, 7};

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}
}

