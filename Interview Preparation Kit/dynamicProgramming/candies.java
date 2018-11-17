package dynamicProgramming;

public class candies {

	public static long candies(int n, int[] arr) {

		long sum = 0;
		
		long sol[] = new long[n];
		sol[0] = 1;

		for (int i = 1; i < n; i++)
			if (arr[i - 1] < arr[i])
				sol[i] = sol[i - 1] + 1;
			else
				sol[i] = 1;

		boolean add = false;
		for (int i = n - 1; i > 0; i--)
			if (arr[i] < arr[i - 1])
				if (add == true || sol[i] == sol[i - 1]) {
					if (sol[i - 1] < (sol[i] + 1)) {
						sol[i - 1] = sol[i] + 1;
						add = true;
					}
				} else
					add = false;

		for (long a : sol)
			sum = sum + a;

		return sum;
	}

	public static void main(String[] args) {

		int a[] = { 2, 4, 2, 6, 1, 7, 8, 9, 2, 1 };
		System.out.println(candies(a.length, a));
	}

}
