package main.Basic_algorithms;

public class Binary_Search {
	public static int findElement(int[] array, int element) {
		int low = 0, ind=0;
		int high = array.length;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (array[mid] == element) {
				ind=mid;
				return mid;
			} else if (array[mid] < element) {
				low = mid + 1;
			} else
				high = mid - 1;
	
		}
		
		return -1;
	}
}
