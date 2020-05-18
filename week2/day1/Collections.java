package week2.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collections {

	
		/*1. Write a java program to print the duplicate character using Collections Framework.
		Input: "When life gives you lemons, make lemonade"
		 */
		public void findIt(String str) {  
	       
			Map<Character, Integer> baseMap = new HashMap<Character, Integer>();  
	        char[] charArray = str.toCharArray();  
	        for (Character ch : charArray) {  
	            if (baseMap.containsKey(ch)) {  
	                baseMap.put(ch, baseMap.get(ch) + 1);  
	            } else {  
	                baseMap.put(ch, 1);  
	            }  
	        }  
	        Set<Character> keys = baseMap.keySet();  
	        for (Character ch : keys) {  
	            if (baseMap.get(ch) > 1) {  
	                System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
	            }  
	        }  
	    }  
	   
	    public static void main(String a[]) {  
	    	Collections dcf = new Collections();  
	        dcf.findIt("When life gives you lemons, make lemonade");  
	    }	
		
		
		
		
	}

