

import java.util.Scanner;

public class CountingSort1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[100];

		for (int i = 0; i < N; i++) {
			a[sc.nextInt()]++;
		}
		for (int j = 0; j < N; j++) {
			System.out.print(a[j] + " ");
		}
		sc.close();
	}
}
