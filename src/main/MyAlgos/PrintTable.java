package main.MyAlgos;

public class PrintTable {
	public static void table(int n) {
		System.out.println("\n\nTABLE of "+n+" is :");
		for(int i=1; i<=10; i++) {
			System.out.println(n+" x "+i+" = "+n*i);
		}
	}
}
