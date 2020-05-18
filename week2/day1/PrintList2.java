package week2.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintList2 {
	/*2. Write a java program to print the list (Need 3 different answers)
    Input: [B,u,g,a,t,t,i, ,C,h,i,r,o,n]
	 */

	public static void main(String[] args) {
		String str = "B,u,g,a,t,t,i, ,C,h,i,r,o,n";
		List<Character> lst = new ArrayList<Character>();
		for(int i = 0; i < str.length();i++) {
			lst.add(str.charAt(i));
		}
		Iterator<Character> iterator = lst.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}

	}

}
