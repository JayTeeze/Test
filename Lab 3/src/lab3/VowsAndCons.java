package lab3;

public class VowsAndCons {

	public static void main(String[] args) {
		
		vowsAndConsCounter();

	}
	
	public static void vowsAndConsCounter () {
		String word = "encyclopedia";
		
		// Make everything like data types
		char [] wordAsArray = word.toLowerCase().toCharArray();
		char [] vowel = "aeiou".toCharArray();
		char [] consonant = "bcdfghjklmnpqrstvwxyz".toCharArray();
		int vowelCount = 0, consCount = 0;
		
		// Loops through and counts number of vowels
		for (int i = 0; i < wordAsArray.length; i++) {
			for (int j = 0; j < vowel.length; j++) {
				if (wordAsArray[i] == vowel[j]) {
					vowelCount++;
				}
			}
		}
		// Loops through and counts number of consonants
		for (int i = 0; i < wordAsArray.length; i++) {
			for (int j = 0; j < consonant.length; j++) {
				if (wordAsArray[i] == consonant[j]) {
					consCount++;
				}
			}
		}
		System.out.println("The word " + word + " has " + vowelCount + " vowels and " + consCount + " consonants.");
	}

}
