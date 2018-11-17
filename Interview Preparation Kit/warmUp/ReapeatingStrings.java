package warmUp;

public class ReapeatingStrings {

	static long repeatedString(String s, long n) {

		long result = 0;
		long aInS = 0;
		long sLen = s.length();

		for (Character c : s.toCharArray()) {
			if (c == 'a')
				aInS++;
		}

		result = aInS * (n / sLen);

		long steps = n % sLen;

		for (Character c : s.toCharArray()) {
			if (steps == 0)
				break;

			if (c == 'a')
				result++;

			steps--;
		}

		return result;
	}

	public static void main(String args[]) {

		long value = 100000;
		String string = "a";

		System.out.println(repeatedString(string, value));
	}
}
