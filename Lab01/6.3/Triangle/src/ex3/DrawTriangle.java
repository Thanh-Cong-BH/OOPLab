package ex3;

import java.util.*;

public class DrawTriangle {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n = ");
		int n = input.nextInt();
		
		if (n <= 0) System.out.println("Invalid height!");
		else {
			for (int i = 1; i <= n; i++) {
				for (int k = 1; k <= n - i; k++) {
					System.out.print(" ");
				}
	            for (int j = 0; j < (2*i - 1); j++) {
	                System.out.print("*");
	            }
	            for (int l = n - i + 2; l <= 2*n - 1; l++) {
					System.out.print(" ");
				}
	            System.out.println();
			}
		}
	}
}
	
