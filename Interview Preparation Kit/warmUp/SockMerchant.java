package warmUp;

import java.util.Hashtable;
import java.util.Set;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
		Hashtable<Integer, Integer> socks = new Hashtable<Integer, Integer>();

		for (int i = 0; i < n; i++)

			if (socks.containsKey(ar[i])) {
				int value = socks.get(ar[i]);
				socks.put(ar[i], value + 1);
			} else
				socks.put(ar[i], 1);

		Set<Integer> keys = socks.keySet();

		int ans = 0;
		for (Integer key : keys) {
			ans = ans + socks.get(key) / 2;
		}

		return ans;
	}

	public static void main(String args[]) {

		int n = 9;
		int arr[] = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };

		sockMerchant(n, arr);
	}
}
