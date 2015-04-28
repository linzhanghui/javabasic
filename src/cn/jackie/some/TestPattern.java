package cn.jackie.some;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("(.(3,10)[0-9]");
		String s = "aaaa5bbbb";
		Matcher m = p.matcher(s);
		if(m.find())
			p(m.start()+"-"+m.end());
		else
			p("not match");
	}
}
