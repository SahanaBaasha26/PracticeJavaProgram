package day1;

import java.util.HashMap;
import java.util.Map;

public class StringOcc {
	private static Map<Character,Integer>constructFrequencyMap(char[] chars){
		Map<Character,Integer> occur=new HashMap<>();
		for(char ch:chars) {
			if(!occur.containsKey(ch)) {
				occur.put(ch, 0);
			}
			occur.put(ch,occur.get(ch)+1);
		}
		
		return occur;
	}
	public static  int countOccurrences(Map<Character,Integer> occur, char ch) {
		return occur.get(ch);
	}

	public static void main(String[] args) {
		
	   String  str = " You have no choice other than following me";
	  char ch='o';
Map<Character,Integer> occur=constructFrequencyMap(str.toCharArray());
System.out.println("Occurance"+" of o is:" +countOccurrences(occur,ch)+ "times.");
	}

}
