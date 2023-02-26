
/**
 *
 * Take a phrase and prints the most repeated word
 *
 */
public class RepeatedWord {

	public static void main(String[] args) {
		String data = "big black bug big a big black dog on his big black nose";
		System.out.println(search(data));
	}

	public static String search(String phrase) {
		String[] words = phrase.split(" ");
		Integer[] occurrences = new Integer[words.length];
		Integer max = 0, target = 0;
		for(int i = 0; i < words.length; i++) {
			occurrences[i] = count(words, words[i]);
			if(occurrences[i] > max) {
				max = occurrences[i];
				target = i;
			}
		}
		return words[target];
	}

	public static Integer count(String[] list, String word) {
		Integer count = 0;
		for(String data : list)
			if(word.equals(data))
				count++;
		return count;
	}
}
