package day1;

public class Palindrome2 {

	public static void main(String[] args) {
		String variable ="MalayalaM";
		StringBuffer rev=new StringBuffer(variable).reverse();
		String strRev=rev.toString();
		if(strRev.equals(variable)) {
			System.out.println("yes, it is Palindrome");
		}
		else {
			System.out.println("No,it is not Palindrome");
		}
			
	}
}
