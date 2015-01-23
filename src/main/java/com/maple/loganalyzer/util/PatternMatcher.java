package com.maple.loganalyzer.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Deok
 * 
 * @Description prefix와 suffix 사이의 패턴에 일치하는 항목을 추출
 *
 */
public class PatternMatcher {
	private Pattern pattern;
	private Matcher matcher;

	private String prefix;
	private String suffix;

	public PatternMatcher() {
	}

	public void regTest() {
		StringBuffer sb = new StringBuffer();
		pattern = Pattern.compile("[*]");
		matcher = pattern
				.matcher("[200][http://apis.daum.net/search/knowledge?apikey=23jf&q=daum][IE][2009-06-10 08:00:00]");

		while (matcher.find()) {
			
			System.out.println(matcher.toString());
		}

	}

}
