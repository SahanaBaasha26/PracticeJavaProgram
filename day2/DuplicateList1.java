package week2.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateList1 {
	
	
	/*1. How to remove duplicates from a list? 
			List = "A,B,C,D,A,D,E,F"
	 */
	
	
	public static void main(String[] args) {
		//input list with duplicates
		List<String> listWithDuplicates=new ArrayList<>(
				Arrays.asList("A","B","C","D","A","D","E","F"));
		
		//construct a  set  from elements of the list
		Set<String> set =new LinkedHashSet<>(listWithDuplicates);
		
		//construct a  new list  from set and print it
		List<String> listWithOutDuplicates=new ArrayList<>(set);
		
		
		System.out.println(listWithOutDuplicates);
		
		
		
		
	}
	
}
