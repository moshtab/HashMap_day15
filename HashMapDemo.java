package day15_Tree_HashMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// Declaring the String
		String str = "To be or not to be";
		// Declaring a HashMap of <String, Integer>
		HashMap<String, Integer> myMapNode = new HashMap<>();

		// Spliiting the words of string
		// and storing them in the array.
		String[] array = str.split(" ");

		for (String word : array) {

			// Asking whether the HashMap contains the
			// key or not. Will return null if not.
			Integer integer = myMapNode.get(word);

			if (integer == null)
				// Storing the word as key and its
				// occrence as value in the HashMap.
				myMapNode.put(word, 1);

			else {
				// Incrementing the value if the word
				// is already present in the HashMap.
				myMapNode.put(word, integer + 1);
			}
		}
		System.out.println(myMapNode);

	}

}
