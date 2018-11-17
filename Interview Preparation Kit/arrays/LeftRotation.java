package arrays;

public class LeftRotation {
	static int[] rotLeft(int[] a, int d) {

		int len = a.length;
		int sol[] = new int[a.length];

		d = d % len;

		for (int i = 0; i < len - d; i++) 
			sol[i] = a[i + d];
		

		for (int i = 0; i < d; i++) 
			sol[i + len - d] = a[i];
		

		return sol;
	}

	public static void main(String args[]) {

		int n = 10;
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int arr[] = rotLeft(a, n);

	}
}
