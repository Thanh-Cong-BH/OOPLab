package hust.soict.globalict.lab01;

import java.util.*;

public class BasicOperations {
	public static void main(String[] args) {
		int[] numArr = {356, 538, 383, 847, 743, 748, 537};
		for (int i = 0; i < numArr.length; i++)
		{
			System.out.print(numArr[i] + " ");
		}
			System.out.print("\n");
		
		Arrays.sort(numArr);
		for (int i = 0; i < numArr.length; i++)
		{
			System.out.print(numArr[i] + " ");
		}
		System.out.print("\n");
		
		double sum = 0, avg;
		for (int i = 0; i < numArr.length; i++)
		{
			sum += numArr[i];
		}
		avg = sum / numArr.length;
		System.out.println("Sum: " + sum);
		System.out.println("Avg: " + avg);
		
		System.exit(0);
	}
}
