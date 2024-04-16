package interviewquestions;

public class ReverseWordsInString {

	public static void main(String[] args) {

		String input = "Good Luck Cafe";
		String[] words = input.split(" ");
		System.out.println(words.length);
		String[] reversedWords = new String[words.length];

		for (int i = 0; i < words.length; i++) {
			char[] wordChars = words[i].toCharArray();
			int left = 0;
			int right = wordChars.length - 1;

			while (left < right) {
				char temp = wordChars[left];
				wordChars[left] = wordChars[right];
				wordChars[right] = temp;
				left++;
				right--;
			}

			reversedWords[i] = new String(wordChars);
		}

		String reversedString = String.join(" ", reversedWords);

		System.out.println("Original string: " + input);
		System.out.println("Reversed string: " + reversedString);

	}

}
