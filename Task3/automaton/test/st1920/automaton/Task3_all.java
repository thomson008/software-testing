package st1920.automaton;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Task3_all {
	@Test
	public void testTask1_01() {
		assertTrue(RegExpMatcher.matches("", ""));
	}

	@Test
	public void testTask1_02() {
		assertFalse(RegExpMatcher.matches("a", ""));
	}

	@Test
	public void testTask1_03() {
		assertTrue(RegExpMatcher.matches("a", "a|a"));
	}

	@Test
	public void testTask1_04() {
		assertFalse(RegExpMatcher.matches("a", "\\#1"));
	}

	@Test
	public void testTask1_05() {
		assertFalse(RegExpMatcher.matches("a", "[b-a]"));
	}

	@Test
	public void testTask1_06() {
		char[] chars = new char[1000];
		Arrays.fill(chars, 'a');
		String s = new String(chars);
		assertFalse(RegExpMatcher.matches(s, "a"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask1_07() {
		RegExpMatcher.matches("a", "a{1,a}");
	}

	@Test
	public void testTask1_08() {
		assertFalse(RegExpMatcher.matches("a", "**"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask1_09() {
		RegExpMatcher.matches("a", "<a-b>");
	}

	@Test
	public void testTask1_10() {
		assertFalse(RegExpMatcher.matches("86420", "a"));
	}

	@Test
	public void testTask1_11() {
		assertTrue(RegExpMatcher.matches("", ".?"));
	}

	@Test
	public void testTask1_12() {
		assertTrue(RegExpMatcher.matches("a", "((a))"));
	}

	@Test
	public void testTask1_13() {
		assertFalse(RegExpMatcher.matches("()", "()"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask1_14() {
		RegExpMatcher.matches("[-", "[-");
	}

	@Test
	public void testTask1_15() {
		assertTrue(RegExpMatcher.matches("abcdefg", "abcdefg"));
	}

	@Test
	public void testTask1_16() {
		String regex = "([a-zA-Z0-9])+\\@([a-zA-Z0-9])+\\.([a-z]){2,3}";
		assertTrue(RegExpMatcher.matches("user@email.com", regex));
	}

	@Test
	public void testTask1_17() {
		assertTrue(RegExpMatcher.matches("nickname2021", "nickname[0-9]+"));
	}

	@Test
	public void testTask1_18() {
		assertFalse(RegExpMatcher.matches("hellohellohello", "hello?"));
	}

	@Test
	public void testTask1_19() {
		assertTrue(RegExpMatcher.matches("123", "\"123\""));
	}
  	
	@Test
	public void testTask1_20() {
		assertTrue(RegExpMatcher.matches("42", "<0-50>"));
	}

	@Test
	public void testTask3_2_01() {
		assertFalse(RegExpMatcher.matches("a", "a{0}"));
	}

	@Test
	public void testTask3_2_02() {
		assertTrue(RegExpMatcher.matches("a", "a{0,}"));
	}

	@Test
	public void testTask3_2_03() {
		assertTrue(RegExpMatcher.matches("a", "a{0,2}"));
	}

	@Test
	public void testTask3_2_04() {
		assertFalse(RegExpMatcher.matches("a", "a{2,3}"));
	}

	@Test
	public void testTask3_2_05() {
		assertFalse(RegExpMatcher.matches("a", "a{2,1}"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask3_2_06() {
		RegExpMatcher.matches("a", "1{a,b}");
	}

	@Test
	public void testTask3_2_07() {
		assertTrue(RegExpMatcher.matches("a", "a{1,20}"));
	}

	@Test
	public void testTask3_2_08() {
		assertTrue(RegExpMatcher.matches("a", "a&a"));
	}

	@Test
	public void testTask3_2_09() {
		assertTrue(RegExpMatcher.matches("a", ".*&a"));
	}

	@Test
	public void testTask3_2_10() {
		assertFalse(RegExpMatcher.matches("a", "a&[0-9]*"));
	}

	@Test
	public void testTask3_2_11() {
		assertTrue(RegExpMatcher.matches("a", ".*&.*"));
	}

	@Test
	public void testTask3_2_12() {
		assertFalse(RegExpMatcher.matches("a", "~a"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask3_2_13() {
		RegExpMatcher.matches("a", "<11>");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask3_2_14() {
		RegExpMatcher.matches("a", "<2");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask3_2_15() {
		RegExpMatcher.matches("a", "\"");
	}

	@Test
	public void testTask3_2_16() {
		assertFalse(RegExpMatcher.matches("a", "[^1-9a-]]"));
	}

	@Test
	public void testTask3_2_17() {
		assertFalse(RegExpMatcher.matches("a", "<3-2>"));
	}

	@Test
	public void testTask3_2_18() {
		assertFalse(RegExpMatcher.matches("a", "<0-1>"));
	}
	
    @Test
    public void testTask3_2_19() {
        assertFalse(RegExpMatcher.matches("aa",
        	"a+ & a* & a & a{1,} & a{1,5} & a{1,7} & a{2,8} | a{6,8} & b{5} | a | b | c & ccc c {1,2} "));
    }
    
    @Test
    public void testTask3_2_20() {
        assertFalse(RegExpMatcher.matches("a", "\"a\"{1} & \"a\"{1}"));
    }
    
    @Test
    public void testTask3_2_21() {
        assertFalse(RegExpMatcher.matches("a", "\"a\" & \"a\" {1}"));
    }

	public static boolean debug = false;

	@Test
	public void test001() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test001");
		st1920.automaton.MatchString matchString0 = null;
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
// The following exception was thrown during execution in test generation
		try {
			boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
// Expected exception.
		}
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
	}

	@Test
	public void test002() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test002");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
	}

	@Test
	public void test003() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test003");
		st1920.automaton.MatcherWrapper matcherWrapper0 = new st1920.automaton.MatcherWrapper();
	}

	@Test
	public void test004() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test004");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeRepeat2();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
	}

	@Test
	public void test005() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test005");
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
		java.lang.Class<?> wildcardClass3 = rEString2.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass3);
	}

	@Test
	public void test006() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test006");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNegation(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnd(rEString7, rEString9);
		java.lang.Class<?> wildcardClass12 = rEString9.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass12);
	}

	@Test
	public void test007() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test007");
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation("", "hi!");
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
	}

	@Test
	public void test008() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test008");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString3);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString15);
		java.lang.Class<?> wildcardClass17 = rEString3.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass17);
	}

	@Test
	public void test009() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test009");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString9);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString9);
		java.lang.Class<?> wildcardClass16 = rEString3.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass16);
	}

	@Test
	public void test010() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test010");
		st1920.automaton.REString rEString0 = null;
// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
// Expected exception.
		}
	}

	@Test
	public void test011() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test011");
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation("hi!", "hi!");
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
	}

	@Test
	public void test012() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test012");
		st1920.automaton.REString rEString0 = null;
// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNegation(rEString0);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
// Expected exception.
		}
	}

	@Test
	public void test013() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test013");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeLetterRange();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString5, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString7);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNegation(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeAnd(rEString13, rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
	}

	@Test
	public void test014() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test014");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString5);
		java.lang.Class<?> wildcardClass7 = rEString3.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass7);
	}

	@Test
	public void test015() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test015");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNumberRange();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString4);
		java.lang.Class<?> wildcardClass6 = rEString5.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass6);
	}

	@Test
	public void test016() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test016");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString8, rEString10);
		boolean boolean12 = st1920.automaton.MatcherWrapper.matches(matchString4, rEString10);
		st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString15, rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString17);
		boolean boolean19 = st1920.automaton.MatcherWrapper.matches(matchString13, rEString18);
		st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeOr(rEString22, rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString24);
		boolean boolean26 = st1920.automaton.MatcherWrapper.matches(matchString20, rEString25);
		st1920.automaton.MatchString matchString27 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13,
				matchString20);
		st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString4,
				matchString13);
		java.lang.Class<?> wildcardClass29 = matchString28.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass29);
	}

	@Test
	public void test017() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test017");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlphabet();
		st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean3 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString2);
		st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1,
				matchString4);
		st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeOr(rEString8, rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString10,
				rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeOr(rEString12, rEString14);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString12);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString17,
				rEString18);
		boolean boolean21 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
	}

	@Test
	public void test018() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test018");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
		java.lang.Class<?> wildcardClass3 = rEString2.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass3);
	}

	@Test
	public void test019() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test019");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
	}

	@Test
	public void test020() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test020");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlphabet();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		boolean boolean3 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
	}

	@Test
	public void test021() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test021");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeAnd(rEString3, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
	}

	@Test
	public void test022() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test022");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
		st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString7, rEString12);
		st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString7);
		st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean17 = st1920.automaton.MatcherWrapper.matches(matchString15, rEString16);
		st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString15,
				matchString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeOr(rEString21, rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString23,
				rEString25);
		boolean boolean27 = st1920.automaton.MatcherWrapper.matches(matchString19, rEString25);
		st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString29);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeOr(rEString30, rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString32);
		boolean boolean34 = st1920.automaton.MatcherWrapper.matches(matchString28, rEString33);
		st1920.automaton.MatchString matchString35 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString36);
		st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeOr(rEString37, rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString39);
		boolean boolean41 = st1920.automaton.MatcherWrapper.matches(matchString35, rEString40);
		st1920.automaton.MatchString matchString42 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString28,
				matchString35);
		st1920.automaton.MatchString matchString43 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString19,
				matchString28);
		st1920.automaton.MatchString matchString44 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7,
				matchString28);
		st1920.automaton.MatchString matchString45 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean47 = st1920.automaton.MatcherWrapper.matches(matchString45, rEString46);
		st1920.automaton.MatchString matchString48 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString49 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString45,
				matchString48);
		st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString51 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString50);
		st1920.automaton.REString rEString52 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString53 = st1920.automaton.MatcherWrapper.makeOr(rEString51, rEString52);
		st1920.automaton.REString rEString54 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString53);
		st1920.automaton.REString rEString55 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString56 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString53,
				rEString55);
		boolean boolean57 = st1920.automaton.MatcherWrapper.matches(matchString49, rEString55);
		st1920.automaton.MatchString matchString58 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString59 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString60 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString59);
		st1920.automaton.REString rEString61 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString62 = st1920.automaton.MatcherWrapper.makeOr(rEString60, rEString61);
		st1920.automaton.REString rEString63 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString62);
		boolean boolean64 = st1920.automaton.MatcherWrapper.matches(matchString58, rEString63);
		st1920.automaton.MatchString matchString65 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString66 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString67 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString66);
		st1920.automaton.REString rEString68 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString69 = st1920.automaton.MatcherWrapper.makeOr(rEString67, rEString68);
		st1920.automaton.REString rEString70 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString69);
		boolean boolean71 = st1920.automaton.MatcherWrapper.matches(matchString65, rEString70);
		st1920.automaton.MatchString matchString72 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString58,
				matchString65);
		st1920.automaton.MatchString matchString73 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString49,
				matchString58);
		st1920.automaton.MatchString matchString74 = st1920.automaton.MatcherWrapper.makeAlphabet();
		st1920.automaton.MatchString matchString75 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString76 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean77 = st1920.automaton.MatcherWrapper.matches(matchString75, rEString76);
		st1920.automaton.MatchString matchString78 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString79 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString75,
				matchString78);
		st1920.automaton.MatchString matchString80 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString74,
				matchString79);
		st1920.automaton.MatchString matchString81 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString73,
				matchString79);
		st1920.automaton.MatchString matchString82 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString28,
				matchString73);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString42);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString43);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString44);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString45);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString48);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString49);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString58);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString65);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString72);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString73);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString74);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString75);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString78);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString79);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString80);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString81);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString82);
	}

	@Test
	public void test023() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test023");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNegation(rEString0);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNegation(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeOr(rEString8, rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnd(rEString6, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}

	@Test
	public void test024() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test024");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
	}

	@Test
	public void test025() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test025");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
		boolean boolean9 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
	}

	@Test
	public void test026() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test026");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString3);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString15);
		java.lang.Class<?> wildcardClass18 = rEString15.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass18);
	}

	@Test
	public void test027() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test027");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
		java.lang.Class<?> wildcardClass5 = rEString4.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass5);
	}

	@Test
	public void test028() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test028");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString3);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeConcatenation("hi!", "");
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeDigit();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNegation(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeOr(rEString12, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString14);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString10,
				rEString14);
		boolean boolean19 = st1920.automaton.MatcherWrapper.matches(matchString4, rEString18);
		java.lang.Class<?> wildcardClass20 = matchString4.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass20);
	}

	@Test
	public void test029() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test029");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString5, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNegation(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeAnd(rEString9, rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
	}

	@Test
	public void test030() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test030");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNegation(rEString0);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNegation(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeOr(rEString8, rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnd(rEString6, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNegation(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}

	@Test
	public void test031() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test031");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString3);
		st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		boolean boolean11 = st1920.automaton.MatcherWrapper.matches(matchString5, rEString10);
		st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString5);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13,
				rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString13);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNegation(rEString13);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeNegation(rEString13);
		boolean boolean19 = st1920.automaton.MatcherWrapper.matches(matchString12, rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
	}

	@Test
	public void test032() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test032");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString3);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString15);
		java.lang.Class<?> wildcardClass18 = rEString17.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass18);
	}

	@Test
	public void test033() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test033");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString3);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString3);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNegation(rEString3);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString3);
		st1920.automaton.REString rEString10 = null;
// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString10);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
// Expected exception.
		}
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
	}

	@Test
	public void test034() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test034");
		st1920.automaton.MatchString matchString0 = null;
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString6);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNegation(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeAnd(rEString8, rEString10);
// The following exception was thrown during execution in test generation
		try {
			boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString12);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
// Expected exception.
		}
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}

	@Test
	public void test035() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test035");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeNegation(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeOr(rEString17, rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString19,
				rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString21);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13,
				rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString13);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString26,
				rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString26);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeOr(rEString13, rEString26);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeOr(rEString32, rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString34);
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString34,
				rEString36);
		st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeOr(rEString36, rEString38);
		st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString41);
		st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeOr(rEString42, rEString43);
		st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString44);
		st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString40,
				rEString45);
		st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString45,
				rEString48);
		st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString26,
				rEString48);
		st1920.automaton.REString rEString51 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString26);
		st1920.automaton.REString rEString52 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString51);
		st1920.automaton.REString rEString53 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString52);
		st1920.automaton.REString rEString54 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString55 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString54);
		st1920.automaton.REString rEString56 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString57 = st1920.automaton.MatcherWrapper.makeOr(rEString55, rEString56);
		st1920.automaton.REString rEString58 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString59 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString58);
		st1920.automaton.REString rEString60 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString61 = st1920.automaton.MatcherWrapper.makeOr(rEString59, rEString60);
		st1920.automaton.REString rEString62 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString61);
		st1920.automaton.REString rEString63 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString64 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString61,
				rEString63);
		st1920.automaton.REString rEString65 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString66 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString65);
		st1920.automaton.REString rEString67 = st1920.automaton.MatcherWrapper.makeOr(rEString63, rEString65);
		st1920.automaton.REString rEString68 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString63);
		st1920.automaton.REString rEString69 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString57,
				rEString63);
		st1920.automaton.REString rEString70 = st1920.automaton.MatcherWrapper.makeOr(rEString52, rEString63);
		st1920.automaton.REString rEString71 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString72 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString71);
		st1920.automaton.REString rEString73 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString74 = st1920.automaton.MatcherWrapper.makeOr(rEString72, rEString73);
		st1920.automaton.REString rEString75 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString74);
		st1920.automaton.REString rEString76 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString77 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString74,
				rEString76);
		st1920.automaton.REString rEString78 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString76);
		st1920.automaton.REString rEString79 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString80 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString79);
		st1920.automaton.REString rEString81 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString82 = st1920.automaton.MatcherWrapper.makeOr(rEString80, rEString81);
		st1920.automaton.REString rEString83 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString82);
		st1920.automaton.REString rEString84 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString82);
		st1920.automaton.REString rEString85 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString82);
		st1920.automaton.REString rEString86 = st1920.automaton.MatcherWrapper.makeAnd(rEString78, rEString82);
		st1920.automaton.REString rEString87 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString52,
				rEString82);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString80);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString87);
	}

	@Test
	public void test036() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test036");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString8);
		java.lang.Class<?> wildcardClass12 = rEString8.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass12);
	}

	@Test
	public void test037() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test037");
		st1920.automaton.MatchString matchString0 = null;
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString1);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNegation(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString15, rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString17,
				rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeOr(rEString19, rEString21);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString19);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13,
				rEString19);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeAnd(rEString9, rEString13);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString9);
// The following exception was thrown during execution in test generation
		try {
			boolean boolean28 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString7);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
// Expected exception.
		}
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
	}

	@Test
	public void test038() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test038");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString3);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeConcatenation("hi!", "");
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeDigit();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNegation(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeOr(rEString12, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString14);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString10,
				rEString14);
		boolean boolean19 = st1920.automaton.MatcherWrapper.matches(matchString4, rEString18);
		st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean22 = st1920.automaton.MatcherWrapper.matches(matchString20, rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString21);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAnd(rEString18, rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
	}

	@Test
	public void test039() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test039");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeLetterRange();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString5, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString7);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
	}

	@Test
	public void test040() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test040");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString3);
		java.lang.Class<?> wildcardClass5 = rEString4.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass5);
	}

	@Test
	public void test041() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test041");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNegation(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
	}

	@Test
	public void test042() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test042");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
		st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString7, rEString12);
		st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString7);
		java.lang.Class<?> wildcardClass15 = matchString0.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass15);
	}

	@Test
	public void test043() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test043");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeConcatenation("hi!", "");
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNegation(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeOr(rEString8, rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeOr(rEString4, rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
	}

	@Test
	public void test044() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test044");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString8, rEString10);
		boolean boolean12 = st1920.automaton.MatcherWrapper.matches(matchString4, rEString10);
		st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString15, rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString17);
		boolean boolean19 = st1920.automaton.MatcherWrapper.matches(matchString13, rEString18);
		st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeOr(rEString22, rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString24);
		boolean boolean26 = st1920.automaton.MatcherWrapper.matches(matchString20, rEString25);
		st1920.automaton.MatchString matchString27 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13,
				matchString20);
		st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString4,
				matchString13);
		st1920.automaton.MatchString matchString29 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean31 = st1920.automaton.MatcherWrapper.matches(matchString29, rEString30);
		st1920.automaton.MatchString matchString32 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString33 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString29,
				matchString32);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString34);
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeOr(rEString35, rEString36);
		st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString37);
		st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString37,
				rEString39);
		boolean boolean41 = st1920.automaton.MatcherWrapper.matches(matchString33, rEString39);
		st1920.automaton.MatchString matchString42 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString43);
		st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeOr(rEString44, rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString46);
		boolean boolean48 = st1920.automaton.MatcherWrapper.matches(matchString42, rEString47);
		st1920.automaton.MatchString matchString49 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString51 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString50);
		st1920.automaton.REString rEString52 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString53 = st1920.automaton.MatcherWrapper.makeOr(rEString51, rEString52);
		st1920.automaton.REString rEString54 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString53);
		boolean boolean55 = st1920.automaton.MatcherWrapper.matches(matchString49, rEString54);
		st1920.automaton.MatchString matchString56 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString42,
				matchString49);
		st1920.automaton.MatchString matchString57 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString33,
				matchString42);
		st1920.automaton.MatchString matchString58 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13,
				matchString57);
		st1920.automaton.MatchString matchString59 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.MatchString matchString60 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString61 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean62 = st1920.automaton.MatcherWrapper.matches(matchString60, rEString61);
		st1920.automaton.MatchString matchString63 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString59,
				matchString60);
		st1920.automaton.MatchString matchString64 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString57,
				matchString63);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString42);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString49);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString56);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString57);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString58);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString59);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString60);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString63);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString64);
	}

	@Test
	public void test045() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test045");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString3);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString15);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeOr(rEString19, rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString21,
				rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeOr(rEString23, rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeOr(rEString29, rEString30);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString27,
				rEString32);
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeOr(rEString15, rEString27);
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeNegation(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
	}

	@Test
	public void test046() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test046");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString6 = null;
// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnd(rEString3, rEString6);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
// Expected exception.
		}
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
	}

	@Test
	public void test047() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test047");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeLetterRange();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString5, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString7);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeOr(rEString16, rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString18,
				rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeOr(rEString20, rEString22);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString20);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeAnd(rEString13, rEString20);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
	}

	@Test
	public void test048() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test048");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
	}

	@Test
	public void test049() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test049");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
		boolean boolean9 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}

	@Test
	public void test050() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test050");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnd(rEString7, rEString10);
		boolean boolean12 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
	}

	@Test
	public void test051() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test051");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean3 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString2);
		st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1,
				matchString4);
		st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString6);
	}

	@Test
	public void test052() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test052");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNegation(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
	}

	@Test
	public void test053() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test053");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
		st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString11,
				rEString13);
		boolean boolean15 = st1920.automaton.MatcherWrapper.matches(matchString7, rEString13);
		boolean boolean16 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString13);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeat3();
		boolean boolean18 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeOr(rEString20, rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeOr(rEString24, rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString26,
				rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString30);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeOr(rEString28, rEString30);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString28);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22,
				rEString28);
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString22);
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString35);
		boolean boolean37 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
	}

	@Test
	public void test054() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test054");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNegation(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString10, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString12,
				rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeOr(rEString14, rEString16);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString14);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString8, rEString14);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeAnd(rEString4, rEString14);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
	}

	@Test
	public void test055() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test055");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeDigit();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeAnd(rEString2, rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
	}

	@Test
	public void test056() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test056");
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation("hi!", "");
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeDigit();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNegation(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString2, rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString5, rEString9);
		java.lang.Class<?> wildcardClass14 = rEString9.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass14);
	}

	@Test
	public void test057() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test057");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNoneString();
		st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean3 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString2);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString4, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeNegation(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeOr(rEString18, rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString20,
				rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString22);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString14,
				rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString14);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString27,
				rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString27);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeOr(rEString14, rEString27);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeOr(rEString33, rEString34);
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString35);
		st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString35,
				rEString37);
		st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString39);
		st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeOr(rEString37, rEString39);
		st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString42);
		st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeOr(rEString43, rEString44);
		st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString46);
		st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString41,
				rEString46);
		st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString46,
				rEString49);
		st1920.automaton.REString rEString51 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString27,
				rEString49);
		st1920.automaton.REString rEString52 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString27);
		st1920.automaton.REString rEString53 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString52);
		st1920.automaton.REString rEString54 = st1920.automaton.MatcherWrapper.makeOr(rEString12, rEString53);
		st1920.automaton.REString rEString55 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString54);
		st1920.automaton.REString rEString56 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString57 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString56);
		st1920.automaton.REString rEString58 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString59 = st1920.automaton.MatcherWrapper.makeOr(rEString57, rEString58);
		st1920.automaton.REString rEString60 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString59);
		st1920.automaton.REString rEString61 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString59);
		st1920.automaton.REString rEString62 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString63 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString62);
		st1920.automaton.REString rEString64 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString65 = st1920.automaton.MatcherWrapper.makeOr(rEString63, rEString64);
		st1920.automaton.REString rEString66 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString65);
		st1920.automaton.REString rEString67 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString68 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString65,
				rEString67);
		st1920.automaton.REString rEString69 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString70 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString69);
		st1920.automaton.REString rEString71 = st1920.automaton.MatcherWrapper.makeOr(rEString67, rEString69);
		st1920.automaton.REString rEString72 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString59,
				rEString71);
		st1920.automaton.REString rEString73 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString71);
		st1920.automaton.REString rEString74 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString54,
				rEString73);
		st1920.automaton.REString rEString75 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString76 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString75);
		st1920.automaton.REString rEString77 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString78 = st1920.automaton.MatcherWrapper.makeOr(rEString76, rEString77);
		st1920.automaton.REString rEString79 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString78);
		st1920.automaton.REString rEString80 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString78);
		st1920.automaton.REString rEString81 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString78);
		st1920.automaton.MatchString matchString82 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.REString rEString83 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString84 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString83);
		st1920.automaton.REString rEString85 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString86 = st1920.automaton.MatcherWrapper.makeOr(rEString84, rEString85);
		st1920.automaton.REString rEString87 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString86);
		st1920.automaton.REString rEString88 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString89 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString86,
				rEString88);
		boolean boolean90 = st1920.automaton.MatcherWrapper.matches(matchString82, rEString88);
		st1920.automaton.REString rEString91 = st1920.automaton.MatcherWrapper.makeAnd(rEString81, rEString88);
		st1920.automaton.REString rEString92 = st1920.automaton.MatcherWrapper.makeOr(rEString74, rEString91);
		java.lang.Class<?> wildcardClass93 = rEString74.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString80);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString82);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString87);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass93);
	}

	@Test
	public void test058() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test058");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNegation(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnd(rEString7, rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNegation(rEString9);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeOr(rEString14, rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeOr(rEString19, rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString21);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString21);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAnd(rEString16, rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
	}

	@Test
	public void test059() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test059");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString1);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString14,
				rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString14);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString14);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeOr(rEString20, rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString22);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeOr(rEString26, rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString28,
				rEString30);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeOr(rEString30, rEString32);
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22,
				rEString34);
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeAnd(rEString18, rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
	}

	@Test
	public void test060() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test060");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString3);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
		st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString11,
				rEString13);
		boolean boolean15 = st1920.automaton.MatcherWrapper.matches(matchString7, rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeAnd(rEString6, rEString13);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNoneString();
		st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean20 = st1920.automaton.MatcherWrapper.matches(matchString18, rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeOr(rEString23, rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString25);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeOr(rEString21, rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString30);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeNegation(rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString31);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString34);
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeOr(rEString35, rEString36);
		st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString37);
		st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString37,
				rEString39);
		st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString39);
		st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString31,
				rEString41);
		st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString31);
		st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString44,
				rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString44);
		st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeOr(rEString31, rEString44);
		st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString49);
		st1920.automaton.REString rEString51 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString52 = st1920.automaton.MatcherWrapper.makeOr(rEString50, rEString51);
		st1920.automaton.REString rEString53 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString52);
		st1920.automaton.REString rEString54 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString55 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString52,
				rEString54);
		st1920.automaton.REString rEString56 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString57 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString56);
		st1920.automaton.REString rEString58 = st1920.automaton.MatcherWrapper.makeOr(rEString54, rEString56);
		st1920.automaton.REString rEString59 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString60 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString59);
		st1920.automaton.REString rEString61 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString62 = st1920.automaton.MatcherWrapper.makeOr(rEString60, rEString61);
		st1920.automaton.REString rEString63 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString62);
		st1920.automaton.REString rEString64 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString63);
		st1920.automaton.REString rEString65 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString58,
				rEString63);
		st1920.automaton.REString rEString66 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString67 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString63,
				rEString66);
		st1920.automaton.REString rEString68 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString44,
				rEString66);
		st1920.automaton.REString rEString69 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString44);
		st1920.automaton.REString rEString70 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString69);
		st1920.automaton.REString rEString71 = st1920.automaton.MatcherWrapper.makeOr(rEString29, rEString70);
		st1920.automaton.REString rEString72 = st1920.automaton.MatcherWrapper.makeOr(rEString17, rEString71);
		st1920.automaton.REString rEString73 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString74 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString73);
		st1920.automaton.REString rEString75 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString76 = st1920.automaton.MatcherWrapper.makeOr(rEString74, rEString75);
		st1920.automaton.REString rEString77 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString76);
		st1920.automaton.REString rEString78 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString76);
		st1920.automaton.REString rEString79 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString80 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString79);
		st1920.automaton.REString rEString81 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString82 = st1920.automaton.MatcherWrapper.makeOr(rEString80, rEString81);
		st1920.automaton.REString rEString83 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString82);
		st1920.automaton.REString rEString84 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString85 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString82,
				rEString84);
		st1920.automaton.REString rEString86 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString87 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString86);
		st1920.automaton.REString rEString88 = st1920.automaton.MatcherWrapper.makeOr(rEString84, rEString86);
		st1920.automaton.REString rEString89 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString76,
				rEString88);
		st1920.automaton.REString rEString90 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString88);
		st1920.automaton.REString rEString91 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString71,
				rEString90);
		st1920.automaton.REString rEString92 = st1920.automaton.MatcherWrapper.makeOr(rEString16, rEString71);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString80);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString87);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
	}

	@Test
	public void test061() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test061");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString5);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAnd(rEString7, rEString11);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
		st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean21 = st1920.automaton.MatcherWrapper.matches(matchString19, rEString20);
		st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString19,
				matchString22);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation("hi!", "");
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeDigit();
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeNegation(rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString26,
				rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString30);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeOr(rEString31, rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString33);
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString33);
		st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString29,
				rEString33);
		boolean boolean38 = st1920.automaton.MatcherWrapper.matches(matchString23, rEString37);
		st1920.automaton.MatchString matchString39 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean41 = st1920.automaton.MatcherWrapper.matches(matchString39, rEString40);
		st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString40);
		st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString42);
		st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeAnd(rEString37, rEString43);
		st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeOr(rEString18, rEString44);
		st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString15,
				rEString44);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString39);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
	}

	@Test
	public void test062() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test062");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString8, rEString10);
		boolean boolean12 = st1920.automaton.MatcherWrapper.matches(matchString4, rEString10);
		st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString15, rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString17);
		boolean boolean19 = st1920.automaton.MatcherWrapper.matches(matchString13, rEString18);
		st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeOr(rEString22, rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString24);
		boolean boolean26 = st1920.automaton.MatcherWrapper.matches(matchString20, rEString25);
		st1920.automaton.MatchString matchString27 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13,
				matchString20);
		st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString4,
				matchString13);
		st1920.automaton.MatchString matchString29 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString30);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeOr(rEString31, rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString33);
		boolean boolean35 = st1920.automaton.MatcherWrapper.matches(matchString29, rEString34);
		st1920.automaton.MatchString matchString36 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString37);
		st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeOr(rEString38, rEString39);
		st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString40);
		boolean boolean42 = st1920.automaton.MatcherWrapper.matches(matchString36, rEString41);
		st1920.automaton.MatchString matchString43 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString29,
				matchString36);
		st1920.automaton.MatchString matchString44 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean46 = st1920.automaton.MatcherWrapper.matches(matchString44, rEString45);
		st1920.automaton.MatchString matchString47 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString48 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString44,
				matchString47);
		st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString49);
		st1920.automaton.REString rEString51 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString52 = st1920.automaton.MatcherWrapper.makeOr(rEString50, rEString51);
		st1920.automaton.REString rEString53 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString52);
		st1920.automaton.REString rEString54 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString55 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString52,
				rEString54);
		boolean boolean56 = st1920.automaton.MatcherWrapper.matches(matchString48, rEString54);
		st1920.automaton.MatchString matchString57 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString58 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString59 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString58);
		st1920.automaton.REString rEString60 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString61 = st1920.automaton.MatcherWrapper.makeOr(rEString59, rEString60);
		st1920.automaton.REString rEString62 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString61);
		boolean boolean63 = st1920.automaton.MatcherWrapper.matches(matchString57, rEString62);
		st1920.automaton.MatchString matchString64 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString65 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString66 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString65);
		st1920.automaton.REString rEString67 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString68 = st1920.automaton.MatcherWrapper.makeOr(rEString66, rEString67);
		st1920.automaton.REString rEString69 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString68);
		boolean boolean70 = st1920.automaton.MatcherWrapper.matches(matchString64, rEString69);
		st1920.automaton.MatchString matchString71 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString57,
				matchString64);
		st1920.automaton.MatchString matchString72 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString48,
				matchString57);
		st1920.automaton.MatchString matchString73 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString36,
				matchString57);
		st1920.automaton.MatchString matchString74 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString4,
				matchString73);
		java.lang.Class<?> wildcardClass75 = matchString74.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString36);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString43);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString44);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString47);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString48);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString57);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString64);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString71);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString72);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString73);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString74);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass75);
	}

	@Test
	public void test063() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test063");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
	}

	@Test
	public void test064() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test064");
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation("hi!", "");
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNegation(rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString4);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString7);
		java.lang.Class<?> wildcardClass9 = rEString8.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass9);
	}

	@Test
	public void test065() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test065");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString3);
		st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		boolean boolean11 = st1920.automaton.MatcherWrapper.matches(matchString5, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
		boolean boolean14 = st1920.automaton.MatcherWrapper.matches(matchString5, rEString13);
		st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString5);
		st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean18 = st1920.automaton.MatcherWrapper.matches(matchString16, rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeOr(rEString20, rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22,
				rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeNegation(rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeAnd(rEString26, rEString28);
		boolean boolean31 = st1920.automaton.MatcherWrapper.matches(matchString16, rEString26);
		boolean boolean32 = st1920.automaton.MatcherWrapper.matches(matchString5, rEString26);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeNegation(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
	}

	@Test
	public void test066() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test066");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeLetterRange();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString5, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString7);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString13);
		java.lang.Class<?> wildcardClass15 = rEString14.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass15);
	}

	@Test
	public void test067() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test067");
		st1920.automaton.REString rEString0 = null;
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnd(rEString2, rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString9);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeNegation(rEString12);
// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0,
					rEString12);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
// Expected exception.
		}
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
	}

	@Test
	public void test068() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test068");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeDigit();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString0);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
	}

	@Test
	public void test069() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test069");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString3);
		st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		boolean boolean11 = st1920.automaton.MatcherWrapper.matches(matchString5, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
		boolean boolean14 = st1920.automaton.MatcherWrapper.matches(matchString5, rEString13);
		st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString5);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeOr(rEString17, rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeOr(rEString21, rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeAnd(rEString17, rEString24);
		boolean boolean27 = st1920.automaton.MatcherWrapper.matches(matchString15, rEString17);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeNegation(rEString29);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString29);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeOr(rEString33, rEString34);
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString35);
		st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString35,
				rEString37);
		st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString37);
		st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString29,
				rEString39);
		st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString29);
		st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString42,
				rEString43);
		st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString42);
		st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeOr(rEString29, rEString42);
		st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString47);
		st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeOr(rEString48, rEString49);
		st1920.automaton.REString rEString51 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString50);
		st1920.automaton.REString rEString52 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString53 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString50,
				rEString52);
		st1920.automaton.REString rEString54 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString55 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString54);
		st1920.automaton.REString rEString56 = st1920.automaton.MatcherWrapper.makeOr(rEString52, rEString54);
		st1920.automaton.REString rEString57 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString58 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString57);
		st1920.automaton.REString rEString59 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString60 = st1920.automaton.MatcherWrapper.makeOr(rEString58, rEString59);
		st1920.automaton.REString rEString61 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString60);
		st1920.automaton.REString rEString62 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString61);
		st1920.automaton.REString rEString63 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString56,
				rEString61);
		st1920.automaton.REString rEString64 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString65 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString61,
				rEString64);
		st1920.automaton.REString rEString66 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString42,
				rEString64);
		st1920.automaton.MatchString matchString67 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString68 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString69 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString68);
		st1920.automaton.REString rEString70 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString71 = st1920.automaton.MatcherWrapper.makeOr(rEString69, rEString70);
		st1920.automaton.REString rEString72 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString71);
		boolean boolean73 = st1920.automaton.MatcherWrapper.matches(matchString67, rEString72);
		st1920.automaton.REString rEString74 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString75 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString74);
		boolean boolean76 = st1920.automaton.MatcherWrapper.matches(matchString67, rEString75);
		st1920.automaton.REString rEString77 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString75);
		st1920.automaton.REString rEString78 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString77);
		st1920.automaton.REString rEString79 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString66,
				rEString77);
		st1920.automaton.REString rEString80 = st1920.automaton.MatcherWrapper.makeAnd(rEString17, rEString66);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString67);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString80);
	}

	@Test
	public void test070() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test070");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString8, rEString10);
		boolean boolean12 = st1920.automaton.MatcherWrapper.matches(matchString4, rEString10);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeOr(rEString14, rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString16,
				rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString18);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeOr(rEString22, rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString24);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeAnd(rEString20, rEString24);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAnd(rEString10, rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
	}

	@Test
	public void test071() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test071");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeDigit();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNegation(rEString0);
		java.lang.Class<?> wildcardClass2 = rEString1.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass2);
	}

	@Test
	public void test072() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test072");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNegation(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnd(rEString7, rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString13, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString15,
				rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString17);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeNegation(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeAnd(rEString19, rEString21);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeAnd(rEString7, rEString21);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString26);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAnd(rEString25, rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeNegation(rEString25);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeAnd(rEString24, rEString30);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString24);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
	}

	@Test
	public void test073() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test073");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeLetterRange();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString11);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeOr(rEString20, rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22,
				rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeOr(rEString24, rEString26);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString24);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeAnd(rEString17, rEString24);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString17);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeNegation(rEString17);
		java.lang.Class<?> wildcardClass33 = rEString17.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass33);
	}

	@Test
	public void test074() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test074");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
	}

	@Test
	public void test075() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test075");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNegation(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnd(rEString7, rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString13, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString15,
				rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString17);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeNegation(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeAnd(rEString19, rEString21);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeAnd(rEString7, rEString21);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString26);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAnd(rEString25, rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeNegation(rEString25);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeAnd(rEString24, rEString30);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeConcatenation("hi!", "");
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeDigit();
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeNegation(rEString35);
		st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString34,
				rEString36);
		st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeOr(rEString39, rEString40);
		st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString41);
		st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString41);
		st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString41);
		st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString37,
				rEString41);
		st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeOr(rEString30, rEString45);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
	}

	@Test
	public void test076() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test076");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNegation(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString11);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString5, rEString11);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString5);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeNegation(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString20);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeOr(rEString24, rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString26,
				rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString28);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString20,
				rEString30);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString20);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString20);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString20);
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
	}

	@Test
	public void test077() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test077");
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation("hi!", "");
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeDigit();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNegation(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString2, rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
	}

	@Test
	public void test078() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test078");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString9);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString9);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString3);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeNegation(rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
	}

	@Test
	public void test079() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test079");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString3);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString15);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeOr(rEString19, rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString21,
				rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeOr(rEString23, rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeOr(rEString29, rEString30);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString27,
				rEString32);
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeOr(rEString15, rEString27);
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
	}

	@Test
	public void test080() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test080");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString1);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString14,
				rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString14);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString14);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeOr(rEString20, rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22,
				rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeOr(rEString24, rEString26);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString29);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeOr(rEString30, rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString28,
				rEString33);
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString33,
				rEString36);
		st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString14,
				rEString36);
		st1920.automaton.MatchString matchString39 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString40);
		st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeOr(rEString41, rEString42);
		st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString43);
		boolean boolean45 = st1920.automaton.MatcherWrapper.matches(matchString39, rEString44);
		st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString46);
		boolean boolean48 = st1920.automaton.MatcherWrapper.matches(matchString39, rEString47);
		st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString47);
		st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString49);
		st1920.automaton.REString rEString51 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString38,
				rEString49);
		st1920.automaton.MatchString matchString52 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString53 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean54 = st1920.automaton.MatcherWrapper.matches(matchString52, rEString53);
		st1920.automaton.MatchString matchString55 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString56 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString52,
				matchString55);
		st1920.automaton.MatchString matchString57 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString58 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString59 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString58);
		st1920.automaton.REString rEString60 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString61 = st1920.automaton.MatcherWrapper.makeOr(rEString59, rEString60);
		st1920.automaton.REString rEString62 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString61);
		boolean boolean63 = st1920.automaton.MatcherWrapper.matches(matchString57, rEString62);
		st1920.automaton.REString rEString64 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString65 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString64);
		boolean boolean66 = st1920.automaton.MatcherWrapper.matches(matchString57, rEString65);
		st1920.automaton.MatchString matchString67 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString52,
				matchString57);
		st1920.automaton.REString rEString68 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString69 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString68);
		st1920.automaton.REString rEString70 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString71 = st1920.automaton.MatcherWrapper.makeOr(rEString69, rEString70);
		st1920.automaton.REString rEString72 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString73 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString72);
		st1920.automaton.REString rEString74 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString75 = st1920.automaton.MatcherWrapper.makeOr(rEString73, rEString74);
		st1920.automaton.REString rEString76 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString75);
		st1920.automaton.REString rEString77 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString76);
		st1920.automaton.REString rEString78 = st1920.automaton.MatcherWrapper.makeAnd(rEString69, rEString76);
		boolean boolean79 = st1920.automaton.MatcherWrapper.matches(matchString67, rEString69);
		st1920.automaton.REString rEString80 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString69);
		st1920.automaton.REString rEString81 = st1920.automaton.MatcherWrapper.makeAnd(rEString51, rEString69);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString39);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString52);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString55);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString56);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString57);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString67);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString80);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
	}

	@Test
	public void test081() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test081");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNegation(rEString0);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNegation(rEString0);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
	}

	@Test
	public void test082() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test082");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
		boolean boolean9 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString12 = null;
// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString11,
					rEString12);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
// Expected exception.
		}
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
	}

	@Test
	public void test083() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test083");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString8, rEString10);
		boolean boolean12 = st1920.automaton.MatcherWrapper.matches(matchString4, rEString10);
		st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString15, rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString17);
		boolean boolean19 = st1920.automaton.MatcherWrapper.matches(matchString13, rEString18);
		st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeOr(rEString22, rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString24);
		boolean boolean26 = st1920.automaton.MatcherWrapper.matches(matchString20, rEString25);
		st1920.automaton.MatchString matchString27 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13,
				matchString20);
		st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString4,
				matchString13);
		java.lang.Class<?> wildcardClass29 = matchString13.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass29);
	}

	@Test
	public void test084() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test084");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
		boolean boolean9 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNegation(rEString11);
		st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean15 = st1920.automaton.MatcherWrapper.matches(matchString13, rEString14);
		st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13,
				matchString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeNegation(rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeOr(rEString23, rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString25,
				rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString27);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString19,
				rEString29);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString19);
		boolean boolean32 = st1920.automaton.MatcherWrapper.matches(matchString17, rEString19);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString12,
				rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
	}

	@Test
	public void test085() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test085");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString3);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
		st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString11,
				rEString13);
		boolean boolean15 = st1920.automaton.MatcherWrapper.matches(matchString7, rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeAnd(rEString6, rEString13);
		st1920.automaton.REString rEString17 = null;
// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6,
					rEString17);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
// Expected exception.
		}
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
	}

	@Test
	public void test086() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test086");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString0);
		st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean4 = st1920.automaton.MatcherWrapper.matches(matchString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString8, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString10);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeNegation(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeAnd(rEString12, rEString14);
		boolean boolean17 = st1920.automaton.MatcherWrapper.matches(matchString2, rEString12);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
	}

	@Test
	public void test087() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test087");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString11,
				rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
	}

	@Test
	public void test088() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test088");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumberRange();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
		st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean4 = st1920.automaton.MatcherWrapper.matches(matchString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNegation(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString15);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeOr(rEString19, rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString21,
				rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString15,
				rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString15);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString28,
				rEString29);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString28);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeOr(rEString15, rEString28);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeOr(rEString34, rEString35);
		st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString36);
		st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString36,
				rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString40);
		st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeOr(rEString38, rEString40);
		st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString43);
		st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeOr(rEString44, rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString46);
		st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString47);
		st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString42,
				rEString47);
		st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString51 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString47,
				rEString50);
		st1920.automaton.REString rEString52 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString28,
				rEString50);
		st1920.automaton.REString rEString53 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString28);
		st1920.automaton.REString rEString54 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString53);
		st1920.automaton.REString rEString55 = st1920.automaton.MatcherWrapper.makeOr(rEString13, rEString54);
		st1920.automaton.REString rEString56 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString55);
		st1920.automaton.REString rEString57 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString55);
		st1920.automaton.REString rEString58 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString57);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
	}

	@Test
	public void test089() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test089");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNumberRange();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
	}

	@Test
	public void test090() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test090");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString3);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString3);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString9);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeNegation(rEString9);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeNegation(rEString9);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAnd(rEString7, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
	}

	@Test
	public void test091() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test091");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString2);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString2);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNoneString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnd(rEString5, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString10, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeOr(rEString14, rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString16,
				rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeOr(rEString18, rEString20);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeOr(rEString24, rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22,
				rEString27);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeAnd(rEString12, rEString22);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeNegation(rEString30);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeAnd(rEString7, rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
	}

	@Test
	public void test092() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test092");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeOr(rEString17, rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString15,
				rEString20);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString20,
				rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeOr(rEString4, rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeOr(rEString27, rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString29);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString29,
				rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString31);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString31);
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
	}

	@Test
	public void test093() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test093");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
	}

	@Test
	public void test094() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test094");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
		st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString11,
				rEString13);
		boolean boolean15 = st1920.automaton.MatcherWrapper.matches(matchString7, rEString13);
		boolean boolean16 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString13);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeat3();
		boolean boolean18 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString17);
		st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean21 = st1920.automaton.MatcherWrapper.matches(matchString19, rEString20);
		st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString22);
	}

	@Test
	public void test095() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test095");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString4);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNegation(rEString4);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNegation(rEString4);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeNumberRange();
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString14,
				rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeOr(rEString18, rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString20,
				rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeOr(rEString22, rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString22);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeNegation(rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAnd(rEString15, rEString27);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeAnd(rEString4, rEString29);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString4);
		st1920.automaton.REString rEString32 = null;
// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString31,
					rEString32);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
// Expected exception.
		}
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
	}

	@Test
	public void test096() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test096");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeat2();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString11,
				rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString13, rEString15);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeOr(rEString19, rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString17,
				rEString22);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString17);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
	}

	@Test
	public void test097() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test097");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString14);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNegation(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
	}

	@Test
	public void test098() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test098");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString15, rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13,
				rEString18);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeAnd(rEString3, rEString13);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeNegation(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeOr(rEString24, rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString25);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22,
				rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
	}

	@Test
	public void test099() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test099");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
		boolean boolean9 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString13, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeOr(rEString18, rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString20);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString20);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeAnd(rEString15, rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeOr(rEString8, rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
	}

	@Test
	public void test100() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test100");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean5 = st1920.automaton.MatcherWrapper.matches(matchString3, rEString4);
		st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3,
				matchString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString11,
				rEString13);
		boolean boolean15 = st1920.automaton.MatcherWrapper.matches(matchString7, rEString13);
		st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString7);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeNegation(rEString17);
		boolean boolean19 = st1920.automaton.MatcherWrapper.matches(matchString16, rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
	}

	@Test
	public void test101() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test101");
		st1920.automaton.REString rEString0 = null;
// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString0);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
// Expected exception.
		}
	}

	@Test
	public void test102() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test102");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeLetterRange();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString11);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeOr(rEString20, rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22,
				rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeOr(rEString24, rEString26);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString24);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeAnd(rEString17, rEString24);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString17);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeNegation(rEString17);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeNegation(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
	}

	@Test
	public void test103() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test103");
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation("hi!", "");
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNegation(rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeNegation(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAnd(rEString11, rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNegation(rEString13);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeAnd(rEString2, rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
	}

	@Test
	public void test104() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test104");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString5);
		st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean11 = st1920.automaton.MatcherWrapper.matches(matchString9, rEString10);
		st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9,
				matchString12);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation("hi!", "");
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeDigit();
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeNegation(rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString16,
				rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeOr(rEString21, rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString23);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString19,
				rEString23);
		boolean boolean28 = st1920.automaton.MatcherWrapper.matches(matchString13, rEString27);
		st1920.automaton.MatchString matchString29 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean31 = st1920.automaton.MatcherWrapper.matches(matchString29, rEString30);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString30);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeAnd(rEString27, rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString27);
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
	}

	@Test
	public void test105() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test105");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString13, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString15);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString15);
		st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeOr(rEString21, rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString23,
				rEString25);
		boolean boolean27 = st1920.automaton.MatcherWrapper.matches(matchString19, rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeAnd(rEString18, rEString25);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAnd(rEString3, rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
	}

	@Test
	public void test106() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test106");
		st1920.automaton.REString rEString0 = null;
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString8, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeOr(rEString10, rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString10);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString10);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString17);
// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0,
					rEString17);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
// Expected exception.
		}
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
	}

	@Test
	public void test107() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test107");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeAnd(rEString3, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeOr(rEString14, rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeAnd(rEString11, rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
	}

	@Test
	public void test108() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test108");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString11);
		java.lang.Class<?> wildcardClass13 = rEString11.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass13);
	}

	@Test
	public void test109() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test109");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString8);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNegation(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeNegation(rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
	}

	@Test
	public void test110() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test110");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNegation(rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString11,
				rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString13, rEString15);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString13);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeAnd(rEString3, rEString13);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
	}

	@Test
	public void test111() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test111");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString5);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAnd(rEString7, rEString11);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
	}

	@Test
	public void test112() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test112");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNumberRange();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNegation(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}

	@Test
	public void test113() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test113");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString2);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
	}

	@Test
	public void test114() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test114");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString3);
		st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		boolean boolean11 = st1920.automaton.MatcherWrapper.matches(matchString5, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
		boolean boolean14 = st1920.automaton.MatcherWrapper.matches(matchString5, rEString13);
		st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString5);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeOr(rEString17, rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeOr(rEString21, rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeAnd(rEString17, rEString24);
		boolean boolean27 = st1920.automaton.MatcherWrapper.matches(matchString15, rEString17);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeNegation(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
	}

	@Test
	public void test115() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test115");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString6);
		boolean boolean8 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString6);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNegation(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString10);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
		boolean boolean14 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
	}

	@Test
	public void test116() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test116");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNegation(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnd(rEString7, rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNegation(rEString9);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeNegation(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAnd(rEString9, rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
	}

	@Test
	public void test117() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test117");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString4);
		boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
		st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString7, rEString12);
		st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString7);
		st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean17 = st1920.automaton.MatcherWrapper.matches(matchString15, rEString16);
		st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString15,
				matchString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeOr(rEString21, rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString23,
				rEString25);
		boolean boolean27 = st1920.automaton.MatcherWrapper.matches(matchString19, rEString25);
		st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString29);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeOr(rEString30, rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString32);
		boolean boolean34 = st1920.automaton.MatcherWrapper.matches(matchString28, rEString33);
		st1920.automaton.MatchString matchString35 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString36);
		st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeOr(rEString37, rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString39);
		boolean boolean41 = st1920.automaton.MatcherWrapper.matches(matchString35, rEString40);
		st1920.automaton.MatchString matchString42 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString28,
				matchString35);
		st1920.automaton.MatchString matchString43 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString19,
				matchString28);
		st1920.automaton.MatchString matchString44 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7,
				matchString28);
		st1920.automaton.MatchString matchString45 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString46);
		st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeOr(rEString47, rEString48);
		st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString49);
		boolean boolean51 = st1920.automaton.MatcherWrapper.matches(matchString45, rEString50);
		st1920.automaton.MatchString matchString52 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString53 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString54 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString53);
		st1920.automaton.REString rEString55 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString56 = st1920.automaton.MatcherWrapper.makeOr(rEString54, rEString55);
		st1920.automaton.REString rEString57 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString56);
		boolean boolean58 = st1920.automaton.MatcherWrapper.matches(matchString52, rEString57);
		st1920.automaton.MatchString matchString59 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString45,
				matchString52);
		st1920.automaton.MatchString matchString60 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString61 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean62 = st1920.automaton.MatcherWrapper.matches(matchString60, rEString61);
		st1920.automaton.MatchString matchString63 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString64 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString60,
				matchString63);
		st1920.automaton.REString rEString65 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString66 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString65);
		st1920.automaton.REString rEString67 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString68 = st1920.automaton.MatcherWrapper.makeOr(rEString66, rEString67);
		st1920.automaton.REString rEString69 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString68);
		st1920.automaton.REString rEString70 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString71 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString68,
				rEString70);
		boolean boolean72 = st1920.automaton.MatcherWrapper.matches(matchString64, rEString70);
		st1920.automaton.MatchString matchString73 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString74 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString75 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString74);
		st1920.automaton.REString rEString76 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString77 = st1920.automaton.MatcherWrapper.makeOr(rEString75, rEString76);
		st1920.automaton.REString rEString78 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString77);
		boolean boolean79 = st1920.automaton.MatcherWrapper.matches(matchString73, rEString78);
		st1920.automaton.MatchString matchString80 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString81 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString82 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString81);
		st1920.automaton.REString rEString83 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString84 = st1920.automaton.MatcherWrapper.makeOr(rEString82, rEString83);
		st1920.automaton.REString rEString85 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString84);
		boolean boolean86 = st1920.automaton.MatcherWrapper.matches(matchString80, rEString85);
		st1920.automaton.MatchString matchString87 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString73,
				matchString80);
		st1920.automaton.MatchString matchString88 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString64,
				matchString73);
		st1920.automaton.MatchString matchString89 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString52,
				matchString73);
		st1920.automaton.MatchString matchString90 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString44,
				matchString89);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString42);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString43);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString44);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString45);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString52);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString59);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString60);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString63);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString64);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString73);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString80);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString87);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString88);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString89);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString90);
	}

	@Test
	public void test118() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test118");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNumberRange();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		java.lang.Class<?> wildcardClass7 = rEString3.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass7);
	}

	@Test
	public void test119() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test119");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString3);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString15);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeOr(rEString19, rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString21,
				rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeOr(rEString23, rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeOr(rEString29, rEString30);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString27,
				rEString32);
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeOr(rEString15, rEString27);
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
	}

	@Test
	public void test120() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test120");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
	}

	@Test
	public void test121() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test121");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString7);
		java.lang.Class<?> wildcardClass10 = rEString5.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass10);
	}

	@Test
	public void test122() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test122");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString1);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
	}

	@Test
	public void test123() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test123");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeNegation(rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeOr(rEString17, rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString19,
				rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString21);
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13,
				rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString13);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences();
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeAlpha();
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString26,
				rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString26);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeOr(rEString13, rEString26);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeOr(rEString32, rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString34);
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString34,
				rEString36);
		st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeOr(rEString36, rEString38);
		st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString41);
		st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeOr(rEString42, rEString43);
		st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString44);
		st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString40,
				rEString45);
		st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString45,
				rEString48);
		st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString26,
				rEString48);
		st1920.automaton.REString rEString51 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString26);
		st1920.automaton.REString rEString52 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString51);
		st1920.automaton.REString rEString53 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString52);
		st1920.automaton.REString rEString54 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
		st1920.automaton.REString rEString55 = st1920.automaton.MatcherWrapper.makeNegation(rEString54);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
	}

	@Test
	public void test124() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test124");
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
		st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean5 = st1920.automaton.MatcherWrapper.matches(matchString3, rEString4);
		st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3,
				matchString6);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation("hi!", "");
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeDigit();
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNegation(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString10,
				rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString15, rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString17);
		st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString17);
		st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13,
				rEString17);
		boolean boolean22 = st1920.automaton.MatcherWrapper.matches(matchString7, rEString21);
		st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean25 = st1920.automaton.MatcherWrapper.matches(matchString23, rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeAnd(rEString21, rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString28);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString28);
		java.lang.Class<?> wildcardClass32 = rEString31.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass32);
	}

	@Test
	public void test125() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test125");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNumberRange();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNegation(rEString3);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeConcatenation("hi!", "");
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNegation(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnd(rEString6, rEString9);
		st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
		st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean17 = st1920.automaton.MatcherWrapper.matches(matchString15, rEString16);
		st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString15,
				matchString18);
		st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeConcatenation("hi!", "");
		st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeDigit();
		st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeNegation(rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22,
				rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeOr(rEString27, rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString29);
		st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString29);
		st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString29);
		st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString25,
				rEString29);
		boolean boolean34 = st1920.automaton.MatcherWrapper.matches(matchString19, rEString33);
		st1920.automaton.MatchString matchString35 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean37 = st1920.automaton.MatcherWrapper.matches(matchString35, rEString36);
		st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString36);
		st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeAnd(rEString33, rEString39);
		st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeOr(rEString14, rEString40);
		st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString40);
		st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeAnd(rEString6, rEString40);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString15);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString18);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString19);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString35);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
	}

	@Test
	public void test126() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test126");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
		st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0,
				matchString3);
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeat3();
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString8, rEString10);
		boolean boolean12 = st1920.automaton.MatcherWrapper.matches(matchString4, rEString10);
		st1920.automaton.MatchString matchString13 = null;
// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString4,
					matchString13);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
// Expected exception.
		}
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
	}

	@Test
	public void test127() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test127");
		st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
		st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
		java.lang.Class<?> wildcardClass4 = rEString3.getClass();
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass4);
	}

	@Test
	public void test128() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test128");
		st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
		st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumberRange();
		boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
		st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
		st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
		st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeEntireString();
		st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
		st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
		st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(matchString0);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString1);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}
}
