package st1920.automaton;

import java.util.Random;

/**
 * Utility class to provide a simple interface to the package.
 */
public class RegExpMatcher {
	/**
	 * Tells whether the string <code>m</code> matches the regular expression <code>re</code>.
	 * @param m string to be matched
	 * @param re regular expression
	 */
	public static boolean matches(String m, String re) {
		RegExp regExp = new RegExp(re);
		Automaton a = regExp.toAutomaton();
		return a.run(m);
	}

	public static String makeAlpha() {
		Random rnd = new Random();
		final String alphanum = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	    return Character.toString(alphanum.charAt(rnd.nextInt(alphanum.length())));
	}
	public static String makeSpecial() {
		Random rnd = new Random();
		final String alphanum = "!@#$%^&*+?";
		return Character.toString(alphanum.charAt(rnd.nextInt(alphanum.length())));
	}
	public static String makeRange() {
		Random rnd = new Random();
		return String.format("<%d-%d>", rnd.nextInt(100), rnd.nextInt(100));
	}
	public static String makeRepeat1() {
		Random rnd = new Random();
		return String.format("{%d,%d}", rnd.nextInt(100), rnd.nextInt(100));
	}
	public static String makeRepeat2() {
		Random rnd = new Random();
		return String.format("{%d,}", rnd.nextInt(100));
	}
	public static String makeRepeat3() {
		Random rnd = new Random();
		return String.format("{%d}", rnd.nextInt(100));
	}

	public static String makeConcatenation(String l, String r) {
		return l + r;
	}
}
