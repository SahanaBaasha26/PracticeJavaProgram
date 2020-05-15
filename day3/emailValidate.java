package day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailValidate {

	public static void main(String[] args) {
		String str1 = "._@gmail.com";
		String str2="naveen e@tunatap.co.uk";
		String pattern = "[a-zA-Z0-9._]+@[a-z0-9]+.[a-z.]{2,}";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher1 = compile.matcher(str1);
		System.out.println(matcher1.matches());
		Matcher matcher2 = compile.matcher(str2);
		System.out.println(matcher2.matches());

	}

}
