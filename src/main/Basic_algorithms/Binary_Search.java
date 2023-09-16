package main.Basic_algorithms;

public class Binary_Search {

	// method findElements
	public static void findElement(int[] array, int element) {
		int low = 0, ind = 0;
		int high = array.length;

		System.out.println("\n-------(Binary Search)-------");

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (array[mid] == element) {
				ind = mid;
				System.out.println("Element '" + element + "' present at index: " + ind);
				break;
			} else if (array[mid] < element) {
				low = mid + 1;
			} else
				high = mid - 1;

		}
		if (ind == 0)
			System.out.println("Element '" + element + "' not prensent in array!");
	}
}