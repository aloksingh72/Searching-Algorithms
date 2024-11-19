import java.util.Scanner;

class BinarySearch {

	public static void main(String[] args) {

		int[] a = { 4, 5, 2, 3, 6, 5, 9, 8, 7 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target element");

		int target = sc.nextInt();

		// method calling
		int indx = binarySearch(a, target);

		if (indx >= 0) {
			System.out.println("the element is found at index " + indx);
		} else {
			System.out.println("the element is not present");
		}
sc.close();
	}

	// method decalaration
	public static int binarySearch(int[] a, int target) {

		int si = 0;
		int ei = a.length - 1;
		while (si < ei) {

			int mid = si + (ei - si) / 2;
			if (a[mid] == target) {

				return mid;
			}

			else if (a[mid] > target) {

				ei = mid - 1;

			}

			else {
				si = mid + 1;
			}
		}
		return -1;

	}

}