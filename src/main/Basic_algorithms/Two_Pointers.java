package main.Basic_algorithms;

public class Two_Pointers {
	public static void findTwoElements(int[] array, int target) {

		System.out.println("\n-------(Two_Pointers)-------");
		/* ----Algorithm ----
		 * left = start, right = end
		 * { while left < right
		 * 		find sum of element at left and right indices.
		 * 		if (sum == target) --> return the sum
		 * 		if (sum < target ) --> increament the left
		 * 		if (sum > target ) --> decreament the right
		 * }
		 * */
		int left = 0;
		int right = array.length - 1;
		int[] pointers = { 0, 0 };

		while (left < right) {
			int sum = array[left] + array[right];

			if (sum == target) {
				// return new int[] { array[left], array[right] };
				pointers[0] = array[left];
				pointers[1] = array[right];
				System.out.println(" Two numbers with sum '" + target + "' are: " + pointers[0] + " and " + pointers[1]);
				break;
			} else if (sum < target) {
				left++;
			} else
				right--;
		}
		if(left==right  )
			System.out.println("No pairs found whose sum is '" + target + "'");
	}
}
