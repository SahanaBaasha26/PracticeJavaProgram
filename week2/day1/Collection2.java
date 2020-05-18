package week2.day1;

public class Collection2 {

	/*1. Write a java program to print the duplicate character using Collections Framework.
	Input: "When life gives you lemons, make lemonade"
	 */

	public static void main(String[] args) {

		String str = "When life gives you lemons, make lemonade";
		int cnt = 0;
		char[] inp = str.toCharArray();
		System.out.println("Duplicate Characters are:");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (inp[i] == inp[j]) {
					System.out.println(inp[j]);
					cnt++;
					break;
				}
			}
		}
	}


}


