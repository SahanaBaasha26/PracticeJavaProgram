package day1;

public class Palindrome {

	public static void main(String[] args) {
		String str="malayalam";
		String rev="";
		for (int i = 0; i < str.length(); i++) {
		rev +=str.charAt(i);
			
		}

		System.out.println(str.equals(rev)?"Yes, Palindrome":"No, Not a Palindrome");
	}

}
