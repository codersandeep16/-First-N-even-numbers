package program_practice;

import java.util.Scanner;

public class EvenNumberList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of even number to printed :");
		int n = sc.nextInt();
		FindEven(n);
	}

	public static void FindEven(int n) {
		int arr[] = new int[n];
		int count = 0;
		for (int i = 0; i < (2 * n); i++) {
			if ((i % 2) == 0) {
				arr[count] = i;
				count++; // for the array index

			}
		}

		for (int i : arr) {
			System.out.println(i + " ");
		}
	}

}
