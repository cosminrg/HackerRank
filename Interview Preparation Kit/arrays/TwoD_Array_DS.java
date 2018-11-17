package arrays;

public class TwoD_Array_DS {

	static int hourglassSum(int[][] arr) {

		int maxSum = -2000;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				int sum = 0;
				
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						if (!((k == 1 && l == 0) || (k == 1 && l == 2)))
							sum = sum + arr[k + i][l + j];
					}
				}
				if (sum >= maxSum)
					maxSum = sum;
			}
		}
		return maxSum;
	}
	
	public static void main(String args[]) {
		int[][] array = new int[][]{
			  { 1, 2, 3, 4, 5, 6},
			  { 1, 2, 3, 4, 5, 6},
			  { 1, 2, 3, 4, 5, 6},
			  { 1, 2, 3, 4, 5, 6},
			  { 1, 2, 3, 4, 5, 6},
			  { 1, 2, 3, 4, 5, 6}
			};
			
		System.out.println(hourglassSum(array));
	}
}
