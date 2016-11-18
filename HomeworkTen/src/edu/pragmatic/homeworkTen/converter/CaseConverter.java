package edu.pragmatic.homeworkTen.converter;

import java.util.regex.*;

public class CaseConverter {

	public static void main(String[] args) {
		
		String str = " The code between <upcase> a special tag </upcase> is always uppercase...<upcase> always </upcase>";

		String patt = "<upcase>(.*?)</upcase>";
		Pattern pattern = Pattern.compile(patt);
		Matcher matcher = pattern.matcher(str);
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder();
		while(matcher.find()){
		String specialText = str.substring(matcher.start(1), matcher.end(1)).toUpperCase();
		sb.append(str.substring(0, matcher.start()));
		sb.append(specialText);
		sb.append(matcher.end());
		}
		System.out.println(sb.toString());
		
	}
}
