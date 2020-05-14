package day2;

public class MediumLevelString2 {
	
		//1. Write a java code to find the sum of the given numbers
		//Input: "asdf1qwer9as8d7"
		//output: 1+9+8+7 = 25
		
		public static void main(String[] args) {
			
			String str = "asdf1qwer9as8d7";
			char[] chrArray = str.toCharArray(); 
			int output = 0;
			
			for (char c : chrArray) {
				if(Character.toString(c).matches("[0-9]"))
					output = output+ Integer.parseInt(Character.toString(c));			
			}
			
			System.out.println("The sum of digits are: "+output);
			
			}


		
	}


