
public class Chapter08 {
	public static void main(String[] args) {
		//		1
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}

		//		2
		int[] array = { 1, 10, 15, 30 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		//		3
		for (int val : array) {
			if (val % 2 == 0) {
				continue;
			} else {
				System.out.println(val);
			}
		}
	}
}
