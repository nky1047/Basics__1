package main.Basic_algorithms;

public class Recursion_algo {
	public static int sum(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num + sum(num - 1);
		}
	}
	
	public static void calcSum(int num) {
		
		System.out.println("\n-------(Recursion_algo)-------");
		int n= sum(num);
		System.out.println("Sum from 1 to "+num+": "+n);
	}
}
