package dynamicProgramming;

public class maxArraySum {
	
	static int maxFour(int a, int b, int c, int d) {
		return Math.max(Math.max(a, b), Math.max(c, d));
	}

	static int maxSubsetSum(int[] arr) {
		
		int[] sum = new int[arr.length];
		
		sum[0] = Math.max(0, arr[0]);
		sum[1] = Math.max(sum[0], arr[1]);
		
		for(int i = 2; i < arr.length; i ++) 
			sum[i] = maxFour(sum[i - 2] + arr[i], sum[i - 1], sum[i - 2], arr[i]);
	
		return sum[sum.length - 1];
    }
	
	public static void main(String[] args) {
	
		int test0[] = {3, 7, 4, 6, 5};
		int test1[] = {2, 1, 5, 8, 4};
		int test2[] = {3, 5, -7, 8, 10};
		int test3[] = {-2, 1, 3, -4, 5};
		
		int a = 107352889;
		System.out.println(a);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(maxSubsetSum(test0));
		System.out.println(maxSubsetSum(test1));
		System.out.println(maxSubsetSum(test2));
		System.out.println(maxSubsetSum(test3));
	}

}
