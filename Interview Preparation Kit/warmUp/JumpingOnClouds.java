package warmUp;

public class JumpingOnClouds {

	static int jumpingOnClouds(int[] c) {

		int steps = 0;

		int lastCloud = c.length - 1;
		int currentCloud = 0;

		while (currentCloud != lastCloud) {

			if (currentCloud + 2 <= lastCloud && c[currentCloud + 2] == 0) {
				currentCloud = currentCloud + 2;
			} else
				currentCloud = currentCloud + 1;
			steps++;
		}

		return steps;
	}

	public static void main(String args[]) {

		int n = 6;
		int arr[] = { 0, 0, 0, 1, 0, 0 };

		System.out.println(jumpingOnClouds(arr));
	}
}
