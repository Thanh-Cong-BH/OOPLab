package hust.soict.globalict.lab01;

import java.util.*;

public class Addition {
	public static void main(String[] args) {
		int[][] A = {{7, 4, 6, 8}, {8, 3, 5, 2}, {2, 9, 4, 1}};
		int[][] B = {{5, 8, 4, 2}, {3, 0, 2, 1}, {6, 1, 7, 3}};
		int[][] C = new int[A.length][A[0].length];
		
		for (int i = 0; i < A.length; i++){
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for (int i = 0; i < B.length; i++){
			for (int j = 0; j < B[0].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for (int i = 0; i < A.length; i++){
			for (int j = 0; j < A[0].length; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		for (int i = 0; i < C.length; i++){
			for (int j = 0; j < C[0].length; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.print("\n");
		}	
	}
}
