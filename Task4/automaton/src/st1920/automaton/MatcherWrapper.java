package st1920.automaton;

import java.util.Random;

public class MatcherWrapper {
    public static boolean matches(MatchString m, REString re) {
        return RegExpMatcher.matches(m.getString(), re.getRegex());
    }

    // Methods for generating RegExp strings
    public static REString makeDigit() {
    	return new REString("8");
    }

    public static REString makeConcatenation(REString pattern1, REString pattern2) {
    	return new REString(pattern1.getRegex() + pattern2.getRegex());
    }

    public static REString makeRangeOfOccurences(REString pattern) {
    	return new REString(pattern.getRegex() + "{3, 11}");
    }

    public static REString makeAnd(REString pattern1, REString pattern2) {
    	return new REString(pattern1.getRegex() + "&" + pattern2.getRegex());
    }

    public static REString makeRepeatZeroOrOne(REString regExp) {
        return new REString(regExp.getRegex() + "?");
    }

    public static REString makeOr(REString pattern1, REString pattern2) {
        return new REString(pattern1.getRegex() + "|" + pattern2.getRegex());
    }

    public static REString makeLetterRange() {
        return new REString("[a-zA-z]");
    }

    public static REString makeEntireString() {
    	return new REString("\"aaa\"");
    }

    public static REString makeAnyString() {
    	return new REString("@");
    }

    public static REString makeNoneString() {
    	return new REString("#");
    }

    public static REString makeRepeatOnceOrMore(REString pattern) {
        return new REString(pattern.getRegex() + "+");
    }

    public static REString makeRepeatZeroOrMore(REString pattern) {
        return new REString(pattern.getRegex() + "*");
    }

    public static REString makeNegation(REString pattern) {
        return new REString("~" + pattern.getRegex());
    }

    public static REString makeNumberRange() {
    	return new REString("<4-17>");
    }

    public static REString makeWildcard() {
    	return new REString(".");
    }
    
    public static REString makeSpecialCharacter() {
    	return new REString("\\%");
    }
    
	public static REString makeAlpha() {
		Random rnd = new Random();
		final String alphanum = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	    return new REString(Character.toString(alphanum.charAt(rnd.nextInt(alphanum.length()))));
	}
	public static REString makeSpecial() {
		Random rnd = new Random();
		final String alphanum = "!@#$%^&*+?";
		return new REString(Character.toString(alphanum.charAt(rnd.nextInt(alphanum.length()))));
	}
	public static REString makeRange() {
		Random rnd = new Random();
		return new REString(String.format("<%d-%d>", rnd.nextInt(100), rnd.nextInt(100)));
	}
	public static REString makeRepeat1() {
		Random rnd = new Random();
		return new REString(String.format("{%d,%d}", rnd.nextInt(100), rnd.nextInt(100)));
	}
	public static REString makeRepeat2() {
		Random rnd = new Random();
		return new REString(String.format("{%d,}", rnd.nextInt(100)));
	}
	public static REString makeRepeat3() {
		Random rnd = new Random();
		return new REString(String.format("{%d}", rnd.nextInt(100)));
	}

	public static REString makeConcatenation(String l, String r) {
		return new REString(l + r);
	}

    // Methods for generating standard match strings
    public static MatchString makeAlphabet() {
    	return new MatchString("a");
    }

    public static MatchString makeNum() {
    	return new MatchString("8");
    }

    public static MatchString makeConcatenation(MatchString l, MatchString r) {
    	return new MatchString(l.getString() + r.getString());
    }
    
    public static MatchString makeSpecialChar() {
    	return new MatchString("%");
    }
}
