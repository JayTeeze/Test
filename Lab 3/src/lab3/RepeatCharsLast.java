package lab3;

public class RepeatCharsLast {

	public static void main(String[] args) {
		
		sendRepeatsToEnd();

	}
	
	public static void sendRepeatsToEnd () {
		String word = "apple";
		
		char[] wordAsArray = word.toCharArray();
		String repeatChars = "";
		String nonRepeatChars = "";
		
		for (int i = 0; i < wordAsArray.length; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (wordAsArray[i] == wordAsArray[j]) {
					repeatChars += String.valueOf(wordAsArray[i]) + String.valueOf(wordAsArray[j]);
					wordAsArray[i] = " ".charAt(0);
					wordAsArray[j] = " ".charAt(0);
					break;
				}
				
			}
			nonRepeatChars = String.valueOf(wordAsArray).replace(" ", "");
		}
		System.out.println(nonRepeatChars + repeatChars);
	}

}
