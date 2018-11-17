package warmUp;

public class CountingValeys {

	static int countingValleys(int n, String s) {

		int level = 0;
		int valeys = 0;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'D') {
				if (level == 0)
					valeys++;
				level--;
			} else
				level++;
		}

		return valeys;
	}

	public static void main(String args[]) {

		int n = 8;
		String s = "UDDDUDUU";

		System.out.println(countingValleys(n, s));
	}
}
