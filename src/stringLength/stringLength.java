/* this program will accept input from the user and determine which word is the longest
 * TODO: Add logic to ignore punctuation
 * 
 */

package stringLength;

import java.util.Scanner;
import java.util.*;

public class stringLength {
	public static String longestWord(String sen){
		String[] wordsArr= sen.replaceAll("[^a-zA-Z ]", "").split("\\s+");
		int test=0;
		for(int i=0; i<wordsArr.length; i++){
			if(wordsArr[i].length()>test){
				test=wordsArr[i].length();
				sen=wordsArr[i];
			}
		}
		return sen;
	}
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a sentence to find the longest word");
	System.out.print(longestWord(s.nextLine()));
	}

}
