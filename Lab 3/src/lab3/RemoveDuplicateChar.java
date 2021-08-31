package lab3;

import java.util.Arrays;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		
		String word = "banana";
		
		System.out.println(duplicateRemover(word));

	}
	
	public static String duplicateRemover (String word) {
		String lowercaseWord = word.toLowerCase();
		char[] wordAsArray = lowercaseWord.toCharArray();
		int index = 0;
		
		for (int i = 0; i < wordAsArray.length; i++) {
			System.out.println("outer loop is at " + i + "\n");
			int j;
			for (j = 0; j < i; j++) {
				System.out.println("inner loop is at " + j);
				if (wordAsArray[i] == wordAsArray[j]) {
					break;
				}
			}
			if (j == i) {
				wordAsArray[index++] = wordAsArray[i];
			}
		}
		return String.valueOf(Arrays.copyOf(wordAsArray, index));
	}

}
