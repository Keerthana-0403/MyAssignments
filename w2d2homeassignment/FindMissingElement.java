package w2d2homeassignment;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1, 4, 3, 2, 8, 6, 7};
		int max = arr[0];

		for (int num : arr) {
			if (num > max) {
				max = num;
			}

		}

		int expectedSum = (max * (max + 1)) / 2;

		int actualSum = 0;
		for (int num : arr) {
			actualSum += num;
		}

		int missingNumber = expectedSum - actualSum;
		System.out.println(missingNumber);
	}
}




