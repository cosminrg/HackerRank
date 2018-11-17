package dictionariesAndHashmaps;

import java.util.Hashtable;

public class RansomNotes {

	static Hashtable<String, Integer> addWords(String[] words, Hashtable<String, Integer> hash) {

		Hashtable<String, Integer> table = new Hashtable<String, Integer>();

		for (String word : words)
			if (table.containsKey(word))
				table.put(word, table.get(word) + 1);
			else
				table.put(word, 1);

		return table;
	}

	static void checkMagazine(String[] magazine, String[] note) {

		Hashtable<String, Integer> magazineWords = new Hashtable<String, Integer>();
		Hashtable<String, Integer> noteWords = new Hashtable<String, Integer>();

		magazineWords = addWords(magazine, magazineWords);
		noteWords = addWords(note, noteWords);

		boolean valid = true;
		for (String w : noteWords.keySet())
			if (!(magazineWords.containsKey(w)) || noteWords.get(w) > magazineWords.get(w)) {
				System.out.println("NO");
				valid = false;
				break;
			}

		if (valid)
			System.out.println("YES");
	}

	public static void main(String[] args) {

		String[] magazine = { "da", "da", "pula", "da", "muie" };
		String[] note = { "da", "da", "pula", "da", "muie", "gaoz" };

		checkMagazine(magazine, note);
	}
}
