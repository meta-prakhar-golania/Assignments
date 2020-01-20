import java.util.Scanner;

/*Program for performing different string operations
 * like comparing, reversing, change of upper to lower case and vice versa, etc
 * @author Prakhar Golania
 * */
public class StringOperation {

	/*
	 * Function to compare two string
	 * 
	 * @param text1 and text2 use to get two string
	 */
	public int compare(String text1, String text2) {
		int len1 = text1.length();
		int len2 = text2.length();
		if (len1 != len2)
			return 0;
		else
			for (int i = 0; i < len1; i++) {
				if (text1.charAt(i) != text2.charAt(i)) {
					return 0;
				}
			}
		return 1;
	}

	/*
	 * Function to reverse the the string
	 * 
	 * @param text is use to get the string
	 * 
	 * @return str is use to return the reverse string
	 */
	public String reverse(String text) {
		int len = text.length();
		String str = new String();
		for (int i = 0; i < len; i++) {
			str += text.charAt(len - 1 - i);
		}
		return str;
	}

	/*
	 * Function is use to convert upper case letterof string to lower case and
	 * vice versa
	 * 
	 * @param text is use to get the string
	 * 
	 * @return str is use to return converted string
	 */
	public String convert(String text) {
		int len = text.length();
		String str = new String();
		for (int i = 0; i < len; i++) {
			if (text.charAt(i) >= 65 && text.charAt(i) <= 90) {
				str += (char) (text.charAt(i) + 32);
			} else if (text.charAt(i) >= 97 && text.charAt(i) <= 123) {
				str += (char) (text.charAt(i) - 32);
			} else
				str += (char) (text.charAt(i));
		}
		return str;
	}

	/*
	 * Function to find largest word in a string
	 * 
	 * @param text is use to get the string
	 * 
	 * @return str is use to return largest word of string
	 */
	public String largestWord(String text) {
		int len = text.length();
		int count = 0, max = -1, j = 0;
		String str = new String();
		for (int i = 0; i < len; i++) {
			if (text.charAt(i) != ' ' && i != len - 1) {
				count++;
			} else {
				if (i == len - 1) {
					count++;
					i++;
				}
				if (max <= count) {
					max = count;
					j = i - max;
				}
				count = 0;
			}
		}
		for (int i = j; i < j + max; i++) {
			str += text.charAt(i);
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringOperation s = new StringOperation();
		String str1, str2, str, convertString, largeWord;
		int comp;
		System.out.println("Enter the value of first string");
		str1 = input.nextLine();
		System.out.println("Enter the value of second string");
		str2 = input.nextLine();
		comp = s.compare(str1, str2);
		str = s.reverse(str1);
		convertString = s.convert(str1);
		largeWord = s.largestWord(str1);
		System.out.println("\nThe result of compare is " + comp);
		System.out.println("\nThe reverse String is \n" + str);
		System.out.println("\nThe converted String is \n" + convertString);
		System.out
				.println("\nThe largest word in the string is \n" + largeWord);
		input.close();
	}

}
