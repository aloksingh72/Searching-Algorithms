import java.util.Scanner;

class LinearSearch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = { 1, 5, 9, 8, 7, 6, 3, 4 };

		System.out.println("Enter the target element");

		int target = sc.nextInt();

		// method calling
		int indx = linearSearch(a, target);

		if (indx >= 0) {
			System.out.println("Element found at index " + indx);

		} else {
			System.out.println("element is  not found");
		}

		sc.close();

	}

	// method decalration

	public static int linearSearch(int[] a, int target) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {

				return i;
			}
		}
		return -1;

	}

}