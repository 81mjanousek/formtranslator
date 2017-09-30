package com.janousek.formtranslator.web.security;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SafeHtmlUtil {
	public static String sanitize(String raw) {
		if (raw == null || raw.length() == 0)
			return raw;

		return HTMLEntityEncode(canonicalize(raw));
	}

	private static Pattern scriptPattern = Pattern.compile("script",
			Pattern.CASE_INSENSITIVE);

	public static String HTMLEntityEncode(String input) {
		Matcher matcher = scriptPattern.matcher(input);
		String next = matcher.replaceAll("&#x73;cript");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < next.length(); ++i) {
			char ch = next.charAt(i);

			if (ch == '<')
				sb.append("&lt;");
			else if (ch == '>')
				sb.append("&gt;");
			else if (ch == '\'')
				sb.append("&#39;");
			else if (ch == '"')
				sb.append("&#34;");
			else
				sb.append(ch);
		}

		return sb.toString();
	}

	@SuppressWarnings("unchecked")
	public static String canonicalize(String input) {
		String canonical = Normalizer.normalize(input);
		return canonical;
	}
}