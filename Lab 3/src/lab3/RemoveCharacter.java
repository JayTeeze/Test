package lab3;

import java.util.Arrays;

public class RemoveCharacter {

	public static void main(String[] args) {
		
		String word = "BanAnas";
		char charToRemove = 'a';
		
		System.out.println(removeChar(word, charToRemove));

	}
	
	public static String removeChar (String word, char letter) {
		// use replace all and use {Aa}
		
		String lowercaseWord = word.toLowerCase();
		String letToStr = String.valueOf(letter).toLowerCase();
		char[] wordAsArray = lowercaseWord.toCharArray();
		char newLetter = letToStr.charAt(0);
		int index = 0;
		
		// Counts how many of non-target character are in string for new array length
		for (int i = 0; i < wordAsArray.length; i++) {
			if (wordAsArray[i] != newLetter) {
				index++;
			}
		}
		
		char[] arrCopy = Arrays.copyOf(wordAsArray,index);
		
		// Adds non-target characters to array
		for (int i = 0, j = 0; i < wordAsArray.length; i++) {
			if (wordAsArray[i] != newLetter) {
				arrCopy[j] = wordAsArray[i];
				j++;
			}
		}
		String newWord = new String(arrCopy);
		return newWord;
	}

}
