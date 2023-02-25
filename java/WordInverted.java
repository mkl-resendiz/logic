
/**
 *
 * Take a phrase and prints on the inversed order
 * Bellow of it prints the same with the words in inverted order
 *
 */
public class WordInverted {

	public static void main(String[] args) {
		String data = "You can do it!";
		System.out.println(reverse(data));
	}


	public static String reverse(String phrase) {
		String reversed = "", second = "";
		for(int i = phrase.length() - 1; i >= 0 ; i--)
			reversed = reversed + phrase.charAt(i);
		String[] split = reversed.split(" ");
		for(int i = split.length - 1; i >=0 ; i--) {
			second = second + split[i] + " ";
		}
		return reversed + "\n" + second;

	}
}
