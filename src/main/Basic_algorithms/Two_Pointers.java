package main.Basic_algorithms;

public class Two_Pointers {
	public static void findTwoElements(int[] array, int target) {

		System.out.println("\n-------(Two_Pointers)-------");
		
		int left = 0;
		int right = array.length - 1;
		int[] pointers = {0,0};

		while (left < right) {
			int sum = array[left] + array[right];

			if (sum == target) {
				// return new int[] { array[left], array[right] };
				pointers[0] = array[left];
				pointers[1] = array[right];
				break;
			} else if (sum < target) {
				left++;
			} else
				right--;
		}
		pointers = new int[0];

		if (pointers.length == 2) {
			System.out.println(" Two numbers are: " + pointers[0] + ", " + pointers[1]);
		} else {
			System.out.println("No pairs found whose sum is '" + target+"'");
		}
	}
}
