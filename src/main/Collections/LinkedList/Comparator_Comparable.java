package main.Collections.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Comparable {

	/* We have a Integer List to sort using comparator */
	public static void main(String[] args) {

		// <-- How to sort based on some custom Logic, we use Comparator Interface--->

		Comparator<Integer> compt = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if (o1 % 10 > o2 % 10)
					return 1;
				else
					return -1;
			}
		};
		
		List<Integer> nums = new ArrayList<>();
		nums.add(55);
		nums.add(33);
		nums.add(24);
		nums.add(61);
		nums.add(72);
		
	

		Collections.sort(nums, compt);

		System.out.print("\nAfter sort: \n" + nums);

		

	}
}