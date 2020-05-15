package day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidate {

	public static void main(String[] args) {
		String str = "Balaji_1";
		String pattern = "[a-zA-Z0-9._$@]{8,}";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		System.out.println(matcher.matches());

	}

}
