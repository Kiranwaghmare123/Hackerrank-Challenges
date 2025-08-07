
import java.util.Scanner;

public class IntroToTutorialChallenges {
	public static int binarySearch(int a[], int key) {
		int lo = 0;
		int hi = a.length;
		while (lo <= hi) {
			int mid = (lo + (hi - lo) / 2);
			if (a[mid] == key)
				return mid;
			if (a[mid] < key)
				lo = mid + 1;
			if (a[mid] > key)
				hi = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int key = in.nextInt();
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		System.out.println(binarySearch(ar, key));
		in.close();
	}
}
