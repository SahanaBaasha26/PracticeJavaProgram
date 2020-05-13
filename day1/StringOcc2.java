package day1;

public class StringOcc2 {

	public static void main(String[] args) {
		String  str = " You have no choice other than following me";
		int occur=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='o') {
				occur++;
			}
			
		}
		System.out.println("Occurancr of o is :"+occur );
	}

}
