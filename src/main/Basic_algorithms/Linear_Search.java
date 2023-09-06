/**
 * 
 */
package main.Basic_algorithms;


/**
 * We Start at 0th Index and then we find our element or until EOL arrives!
 */
public class Linear_Search {

	public static void findElement(int[] array, int element) {
		for (int i = 0; i < array.length; i++) {

//			Print the array
//			System.out.print(array[i] + ", ");

			if (array[i] == element) {
				// When element found
				System.out.println("\n-->Element found at: ->" + i + "<-");
				break;
			}

			if (i == array.length - 1) /* Element to search isn't present */
				System.out.println("\n-->'" + element + "' isn't present in array.");
		}
	}
}
