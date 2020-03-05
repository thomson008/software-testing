package st1920.automaton;

public class MatcherWrapper {
    public static boolean matches(String m, REString re) {
        RegExp regExp = new RegExp(re.getRegex());
        Automaton a = regExp.toAutomaton();
        return a.run(m);
    }
    
    public static REString makeAlpha() {
    	return new REString("a");
    }
    
    public static REString makeDigit() {
    	return new REString("9");
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

    public static REString makeRepeatOnceOrMore(REString pattern) {
        return new REString(pattern.getRegex() + "+");
    }

    public static REString makeRepeatZeroOrMore(REString pattern) {
        return new REString(pattern.getRegex() + "*");
    }

    public static REString makeNegation(REString pattern) {
        return new REString("~" + pattern.getRegex());
    }
}
