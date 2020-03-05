package st1920.automaton;

public class MatcherWrapper {
    public static boolean matches(MatchString m, REString re) {
        return RegExpMatcher.matches(m.getString(), re.getRegex());
    }

    // Methods for generating RegExp strings
    public static REString makeAlpha() {
    	return new REString("a");
    }

    public static REString makeDigit() {
    	return new REString("9");
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
    	return new REString("\"teststring\"");
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

    // Methods for generating standard match strings
    public static MatchString makeAlphabet() {
    	return new MatchString("a");
    }

    public static MatchString makeNum() {
    	return new MatchString("1");
    }

    public static MatchString makeConcatenation(MatchString l, MatchString r) {
    	return new MatchString(l.getString() + r.getString());
    }
}
