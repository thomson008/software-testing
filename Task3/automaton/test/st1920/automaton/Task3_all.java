package st1920.automaton;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
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
    
    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeSpecial();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNegation(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNegation(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString6);
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString7);
        java.lang.Class<?> wildcardClass9 = matchString1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString2, rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString4);
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString8, rEString11);
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        st1920.automaton.MatchString matchString0 = null;
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString8, rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNegation(rEString8);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString11);
        boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString3, rEString6);
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        java.lang.Class<?> wildcardClass2 = rEString0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        java.lang.Class<?> wildcardClass1 = rEString0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13, rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNegation(rEString13);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString2, rEString18);
        java.lang.Class<?> wildcardClass20 = rEString19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString12, rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeNegation(rEString12);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeOr(rEString10, rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeNegation(rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString15, rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeAnd(rEString6, rEString18);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString20);
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString2);
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
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13, rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNegation(rEString13);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString2, rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString20);
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString24, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeNegation(rEString24);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeOr(rEString22, rEString27);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString28);
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString19, rEString29);
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
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString3);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString6);
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
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeEntireString();
        java.lang.Class<?> wildcardClass1 = rEString0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        st1920.automaton.MatchString matchString0 = null;
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString2);
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
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13, rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNegation(rEString13);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString2, rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeOr(rEString20, rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22, rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeOr(rEString19, rEString22);
        java.lang.Class<?> wildcardClass27 = rEString26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString2);
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
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString2, rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString10, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeNegation(rEString10);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeOr(rEString8, rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNegation(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeAnd(rEString4, rEString16);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeat2();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeOr(rEString18, rEString19);
        java.lang.Class<?> wildcardClass21 = rEString19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnd(rEString2, rEString4);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRange();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeat2();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString7);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString11);
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
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        java.lang.Class<?> wildcardClass3 = matchString1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString3);
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString6);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString11, rEString13);
        boolean boolean16 = st1920.automaton.MatcherWrapper.matches(matchString6, rEString13);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeAnd(rEString3, rEString13);
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
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNegation(rEString7);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString10);
        boolean boolean12 = st1920.automaton.MatcherWrapper.matches(matchString2, rEString5);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
        boolean boolean16 = st1920.automaton.MatcherWrapper.matches(matchString2, rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString17);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString8);
        boolean boolean11 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString8);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        st1920.automaton.MatcherWrapper matcherWrapper0 = new st1920.automaton.MatcherWrapper();
        java.lang.Class<?> wildcardClass1 = matcherWrapper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNegation(rEString7);
        boolean boolean10 = st1920.automaton.MatcherWrapper.matches(matchString4, rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString6);
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
        boolean boolean12 = st1920.automaton.MatcherWrapper.matches(matchString7, rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
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
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString3);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString1);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString1);
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
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString6);
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString10, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString12);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString15, matchString16);
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString14, matchString15);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString20, rEString22);
        boolean boolean25 = st1920.automaton.MatcherWrapper.matches(matchString15, rEString22);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeAnd(rEString12, rEString22);
        boolean boolean27 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
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
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString7);
        java.lang.Class<?> wildcardClass9 = rEString7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNegation(rEString7);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString10);
        boolean boolean12 = st1920.automaton.MatcherWrapper.matches(matchString2, rEString5);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeLetterRange();
        boolean boolean14 = st1920.automaton.MatcherWrapper.matches(matchString2, rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString2, rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString10, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeNegation(rEString10);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeOr(rEString8, rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNegation(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeAnd(rEString4, rEString16);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeat2();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeOr(rEString18, rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeOr(rEString21, rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString23, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString27);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString28);
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString30);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString31, rEString32);
        st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeNegation(rEString31);
        st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeOr(rEString29, rEString34);
        st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeNegation(rEString36);
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString34, rEString37);
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeAnd(rEString25, rEString37);
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeRepeat2();
        st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeOr(rEString39, rEString40);
        st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString18, rEString39);
        st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString43);
        st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString44);
        st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeAnd(rEString42, rEString44);
        st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString42);
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
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString4);
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
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnd(rEString3, rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString6);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString14);
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
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString2, rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString10, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeNegation(rEString10);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeOr(rEString8, rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNegation(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeAnd(rEString4, rEString16);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeOr(rEString19, rEString20);
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString21, rEString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString26);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString28);
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString29, rEString30);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeNegation(rEString29);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeOr(rEString27, rEString32);
        st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeNegation(rEString34);
        st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString32, rEString35);
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeAnd(rEString23, rEString35);
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString37);
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeOr(rEString4, rEString38);
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
        org.junit.Assert.assertNotNull(rEString39);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNegation(rEString2);
        st1920.automaton.REString rEString5 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeOr(rEString4, rEString5);
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
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString4);
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
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString9);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString16);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString20);
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString24, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeNegation(rEString24);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeOr(rEString22, rEString27);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeNegation(rEString29);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString27, rEString30);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString19, rEString31);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString18, rEString19);
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
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString8);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString15, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeNegation(rEString15);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeOr(rEString13, rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString20);
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString24, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeNegation(rEString24);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeOr(rEString22, rEString27);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString28);
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13, rEString29);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeAnd(rEString10, rEString13);
        boolean boolean32 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString10);
        st1920.automaton.MatchString matchString33 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString34 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString35 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString33, matchString34);
        st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString36);
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString37);
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString39);
        st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString40, rEString41);
        st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeNegation(rEString40);
        st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeOr(rEString38, rEString43);
        boolean boolean45 = st1920.automaton.MatcherWrapper.matches(matchString35, rEString38);
        st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString46);
        st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString48);
        st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString49);
        st1920.automaton.REString rEString51 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString47, rEString49);
        st1920.automaton.REString rEString52 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString53 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString52);
        st1920.automaton.REString rEString54 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString55 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString53, rEString54);
        st1920.automaton.REString rEString56 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString55);
        st1920.automaton.REString rEString57 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString55);
        st1920.automaton.REString rEString58 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString49, rEString55);
        boolean boolean59 = st1920.automaton.MatcherWrapper.matches(matchString35, rEString58);
        st1920.automaton.MatchString matchString60 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString34);
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
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString60);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString3);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString6);
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
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        st1920.automaton.REString rEString0 = null;
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString5, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNegation(rEString5);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString14, rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNegation(rEString14);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeOr(rEString12, rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeOr(rEString21, rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString23, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeOr(rEString20, rEString23);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeNegation(rEString27);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString28);
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString29);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNegation(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNegation(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeat3();
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString13);
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
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13, rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNegation(rEString13);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString2, rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeOr(rEString20, rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22, rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeOr(rEString19, rEString22);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeNegation(rEString26);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeOr(rEString28, rEString29);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeOr(rEString27, rEString29);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString31);
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
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString5);
        boolean boolean7 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString5);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAnd(rEString10, rEString12);
        boolean boolean15 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString10);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString6);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString10, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString12);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString14, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString16);
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString18, matchString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString25, rEString26);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeNegation(rEString25);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeOr(rEString23, rEString28);
        boolean boolean30 = st1920.automaton.MatcherWrapper.matches(matchString20, rEString23);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
        boolean boolean34 = st1920.automaton.MatcherWrapper.matches(matchString20, rEString33);
        st1920.automaton.MatchString matchString35 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString17, matchString20);
        st1920.automaton.MatchString matchString36 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString35);
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString37);
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString38);
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeNegation(rEString38);
        st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString41);
        st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString42);
        st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString43);
        st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeAnd(rEString40, rEString43);
        st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString45);
        st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeNumberRange();
        st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeRepeat1();
        st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString47, rEString48);
        st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString45, rEString49);
        boolean boolean51 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
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
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString35);
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNegation(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnd(rEString3, rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString10, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString12);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString15, matchString16);
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString14, matchString15);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString20, rEString22);
        boolean boolean25 = st1920.automaton.MatcherWrapper.matches(matchString15, rEString22);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeAnd(rEString12, rEString22);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString22);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString22);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString28);
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
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
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
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString2, rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString10, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeNegation(rEString10);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeOr(rEString8, rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNegation(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeAnd(rEString4, rEString16);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeat2();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeOr(rEString18, rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString18);
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
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNegation(rEString7);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString12);
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
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13, rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNegation(rEString13);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString2, rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeOr(rEString20, rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22, rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeOr(rEString19, rEString22);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeNegation(rEString26);
        st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString29 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString30 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString31 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString29, matchString30);
        st1920.automaton.MatchString matchString32 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString28, matchString29);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRange();
        st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeRepeat2();
        st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeOr(rEString33, rEString34);
        st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString33);
        boolean boolean37 = st1920.automaton.MatcherWrapper.matches(matchString29, rEString36);
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeAnd(rEString26, rEString36);
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
        org.junit.Assert.assertNotNull(matchString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNegation(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
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
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNegation(rEString7);
        boolean boolean11 = st1920.automaton.MatcherWrapper.matches(matchString5, rEString7);
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString14);
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString16);
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString18, matchString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeLetterRange();
        boolean boolean22 = st1920.automaton.MatcherWrapper.matches(matchString18, rEString21);
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString17, matchString18);
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString3);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString1);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13, rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNegation(rEString13);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22, rEString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeNegation(rEString22);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeOr(rEString20, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString26);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString11, rEString27);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString29);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString30);
        st1920.automaton.MatchString matchString32 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString33 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString34 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString35 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString33, matchString34);
        st1920.automaton.MatchString matchString36 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString32, matchString33);
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString37);
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString39);
        st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString40);
        st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString38, rEString40);
        boolean boolean43 = st1920.automaton.MatcherWrapper.matches(matchString33, rEString40);
        st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeWildcard();
        boolean boolean45 = st1920.automaton.MatcherWrapper.matches(matchString33, rEString44);
        st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString30, rEString44);
        st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeOr(rEString28, rEString46);
        st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString47);
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
        org.junit.Assert.assertNotNull(matchString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString35);
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
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13, rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNegation(rEString13);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString2, rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString2);
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
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnd(rEString2, rEString4);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
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
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString1);
        java.lang.Class<?> wildcardClass3 = rEString1.getClass();
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
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNegation(rEString2);
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
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNegation(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
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
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNegation(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString10);
        java.lang.Class<?> wildcardClass12 = rEString10.getClass();
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
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString3);
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString6);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString11, rEString13);
        boolean boolean16 = st1920.automaton.MatcherWrapper.matches(matchString6, rEString13);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeAnd(rEString3, rEString13);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString13);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString13);
        java.lang.Class<?> wildcardClass20 = rEString13.getClass();
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
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNegation(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString3);
        java.lang.Class<?> wildcardClass5 = rEString3.getClass();
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
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeRepeat1();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNegation(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnd(rEString5, rEString8);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNumberRange();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeat1();
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString12, rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString10, rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNegation(rEString10);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString10);
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
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumberRange();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeat1();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString5);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeAnd(rEString7, rEString10);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString7);
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
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumberRange();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString6);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString10, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString12);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString14, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString16);
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString18, matchString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString25, rEString26);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeNegation(rEString25);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeOr(rEString23, rEString28);
        boolean boolean30 = st1920.automaton.MatcherWrapper.matches(matchString20, rEString23);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
        boolean boolean34 = st1920.automaton.MatcherWrapper.matches(matchString20, rEString33);
        st1920.automaton.MatchString matchString35 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString17, matchString20);
        st1920.automaton.MatchString matchString36 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString35);
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString37);
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeNegation(rEString39);
        st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeOr(rEString37, rEString40);
        boolean boolean42 = st1920.automaton.MatcherWrapper.matches(matchString36, rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
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
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString35);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRange();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeat2();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeOr(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString6);
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
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumberRange();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeat1();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString8, rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNegation(rEString8);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString17, rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeNegation(rEString17);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeOr(rEString15, rEString20);
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeOr(rEString24, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString27);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString26, rEString28);
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeOr(rEString23, rEString26);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeNegation(rEString30);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString30);
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
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumberRange();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeat1();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
        java.lang.Class<?> wildcardClass4 = rEString0.getClass();
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
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString6);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString10, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString12);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString14, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString16);
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString18, matchString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString25, rEString26);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeNegation(rEString25);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeOr(rEString23, rEString28);
        boolean boolean30 = st1920.automaton.MatcherWrapper.matches(matchString20, rEString23);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
        boolean boolean34 = st1920.automaton.MatcherWrapper.matches(matchString20, rEString33);
        st1920.automaton.MatchString matchString35 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString17, matchString20);
        st1920.automaton.MatchString matchString36 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString35);
        st1920.automaton.MatchString matchString37 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString38 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString39 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString37, matchString38);
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString40);
        st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString41);
        st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString43);
        st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString44, rEString45);
        st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeNegation(rEString44);
        st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeOr(rEString42, rEString47);
        boolean boolean49 = st1920.automaton.MatcherWrapper.matches(matchString39, rEString42);
        st1920.automaton.MatchString matchString50 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString51 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString39, matchString50);
        st1920.automaton.MatchString matchString52 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString53 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString54 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString52, matchString53);
        st1920.automaton.MatchString matchString55 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString56 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString52, matchString55);
        st1920.automaton.MatchString matchString57 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString39, matchString56);
        st1920.automaton.MatchString matchString58 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString35, matchString39);
        st1920.automaton.MatchString matchString59 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString60 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString61 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString62 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString60, matchString61);
        st1920.automaton.MatchString matchString63 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString59, matchString60);
        st1920.automaton.MatchString matchString64 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString65 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString66 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString64, matchString65);
        st1920.automaton.MatchString matchString67 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString60, matchString66);
        st1920.automaton.MatchString matchString68 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString69 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString70 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString68, matchString69);
        st1920.automaton.MatchString matchString71 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString67, matchString70);
        st1920.automaton.MatchString matchString72 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString35, matchString71);
        st1920.automaton.REString rEString73 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString74 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString73);
        st1920.automaton.REString rEString75 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString74);
        st1920.automaton.REString rEString76 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString77 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString76);
        st1920.automaton.REString rEString78 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString77);
        st1920.automaton.REString rEString79 = st1920.automaton.MatcherWrapper.makeNegation(rEString77);
        st1920.automaton.REString rEString80 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString81 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString80);
        st1920.automaton.REString rEString82 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString81);
        st1920.automaton.REString rEString83 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString82);
        st1920.automaton.REString rEString84 = st1920.automaton.MatcherWrapper.makeAnd(rEString79, rEString82);
        st1920.automaton.REString rEString85 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString84);
        st1920.automaton.REString rEString86 = st1920.automaton.MatcherWrapper.makeAnd(rEString74, rEString85);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean87 = st1920.automaton.MatcherWrapper.matches(matchString72, rEString86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: expected '}' at position 13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
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
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString38);
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
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString55);
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
        org.junit.Assert.assertNotNull(matchString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString72);
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
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString8);
        boolean boolean11 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString8);
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString14);
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString12, matchString13);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString18, matchString19);
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString17, matchString18);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString22, matchString23);
        st1920.automaton.MatchString matchString25 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString18, matchString24);
        st1920.automaton.MatchString matchString26 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString27 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString26, matchString27);
        st1920.automaton.MatchString matchString29 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString25, matchString28);
        st1920.automaton.MatchString matchString30 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString31 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString32 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString30, matchString31);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString33);
        st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString34);
        st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString36);
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString37, rEString38);
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeNegation(rEString37);
        st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeOr(rEString35, rEString40);
        boolean boolean42 = st1920.automaton.MatcherWrapper.matches(matchString32, rEString35);
        st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
        boolean boolean46 = st1920.automaton.MatcherWrapper.matches(matchString32, rEString45);
        st1920.automaton.MatchString matchString47 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString29, matchString32);
        st1920.automaton.MatchString matchString48 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString47);
        st1920.automaton.MatchString matchString49 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString32);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString49);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString1);
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
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnd(rEString3, rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNegation(rEString9);
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
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeRange();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString5, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNegation(rEString5);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeNegation(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeOr(rEString12, rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString15);
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
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNegation(rEString7);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString10);
        boolean boolean12 = st1920.automaton.MatcherWrapper.matches(matchString2, rEString5);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString2, matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString6);
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9, matchString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString16, rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeNegation(rEString16);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeOr(rEString14, rEString19);
        boolean boolean21 = st1920.automaton.MatcherWrapper.matches(matchString11, rEString14);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
        boolean boolean25 = st1920.automaton.MatcherWrapper.matches(matchString11, rEString24);
        st1920.automaton.MatchString matchString26 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString26);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString1);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeDigit();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNegation(rEString3);
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
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation("", "");
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnd(rEString2, rEString4);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString4);
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString9);
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString14, rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNegation(rEString14);
        boolean boolean18 = st1920.automaton.MatcherWrapper.matches(matchString12, rEString14);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString7, rEString14);
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
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
    }
}
