import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.REString.makeRepeatZeroOrOne(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        st1920.automaton.MatchString matchString0 = null;
        st1920.automaton.MatchString matchString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        st1920.automaton.MatcherWrapper matcherWrapper0 = new st1920.automaton.MatcherWrapper();
        java.lang.Class<?> wildcardClass1 = matcherWrapper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeAlpha();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeRepeatZeroOrMore(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.REString.makeRepeatZeroOrMore(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeWildcard();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeAlpha();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeRepeatZeroOrMore(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.REString.makeRepeatOnceOrMore(rEString0);
        java.lang.String str3 = rEString2.getRegex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "a+" + "'", str3.equals("a+"));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString2, matchString5);
        java.lang.Class<?> wildcardClass7 = matchString5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeNumberRange();
        java.lang.Class<?> wildcardClass1 = rEString0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        st1920.automaton.REString rEString0 = null;
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeNumberRange();
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.REString.makeConcatenation(rEString0, rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeDigit();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeRepeatOnceOrMore(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.REString.makeNegation(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeNegation(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.REString.makeNegation(rEString1);
        st1920.automaton.REString rEString3 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString4 = st1920.automaton.REString.makeAnd(rEString2, rEString3);
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
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeNoneString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeLetterRange();
        java.lang.String str1 = rEString0.getRegex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-zA-z]" + "'", str1.equals("[a-zA-z]"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        st1920.automaton.MatchString matchString0 = null;
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString4, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString5);
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString7);
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
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeRangeOfOccurences(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        st1920.automaton.MatchString matchString0 = null;
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
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
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeSpecialCharacter();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeRepeatOnceOrMore(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.REString.makeNegation(rEString0);
        st1920.automaton.REString rEString3 = st1920.automaton.REString.makeNegation(rEString2);
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeEntireString();
        java.lang.String str2 = rEString1.getRegex();
        st1920.automaton.REString rEString3 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString4 = st1920.automaton.REString.makeConcatenation(rEString1, rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.REString.makeOr(rEString0, rEString1);
        st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
        st1920.automaton.REString rEString8 = st1920.automaton.REString.makeAnd(rEString1, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.REString.makeNegation(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"aaa\"" + "'", str2.equals("\"aaa\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeLetterRange();
        java.lang.Class<?> wildcardClass1 = rEString0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString8);
        st1920.automaton.MatchString matchString11 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString3 = st1920.automaton.REString.makeEntireString();
        java.lang.String str4 = rEString3.getRegex();
        st1920.automaton.REString rEString5 = st1920.automaton.REString.makeNegation(rEString3);
        boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString2, rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"aaa\"" + "'", str4.equals("\"aaa\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9, matchString10);
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString11);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString11);
        st1920.automaton.REString rEString15 = st1920.automaton.REString.makeAlpha();
        st1920.automaton.REString rEString16 = st1920.automaton.REString.makeRepeatZeroOrMore(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.REString.makeRepeatZeroOrOne(rEString16);
        boolean boolean18 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.REString.makeRepeatOnceOrMore(rEString17);
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
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString3 = st1920.automaton.REString.makeEntireString();
        java.lang.String str4 = rEString3.getRegex();
        st1920.automaton.REString rEString5 = st1920.automaton.REString.makeNegation(rEString3);
        boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString5);
        java.lang.Class<?> wildcardClass7 = rEString5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"aaa\"" + "'", str4.equals("\"aaa\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString2, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString10, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9, matchString12);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString12);
        st1920.automaton.REString rEString15 = st1920.automaton.REString.makeAnyString();
        st1920.automaton.REString rEString16 = st1920.automaton.REString.makeNegation(rEString15);
        boolean boolean17 = st1920.automaton.MatcherWrapper.matches(matchString14, rEString16);
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
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeSpecialCharacter();
        st1920.automaton.REString rEString2 = st1920.automaton.REString.makeRepeatOnceOrMore(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.REString.makeAnd(rEString0, rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.REString.makeRepeatZeroOrOne(rEString3);
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
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("hi!");
        st1920.automaton.REString rEString2 = st1920.automaton.REString.makeNegation(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString2, matchString4);
        st1920.automaton.REString rEString7 = st1920.automaton.REString.makeDigit();
        boolean boolean8 = st1920.automaton.MatcherWrapper.matches(matchString6, rEString7);
        java.lang.String str9 = rEString7.getRegex();
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
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "8" + "'", str9.equals("8"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeAlpha();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeRepeatZeroOrMore(rEString0);
        java.lang.Class<?> wildcardClass2 = rEString1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeEntireString();
        java.lang.String str1 = rEString0.getRegex();
        st1920.automaton.REString rEString2 = st1920.automaton.REString.makeNegation(rEString0);
        st1920.automaton.REString rEString3 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString4 = st1920.automaton.REString.makeSpecialCharacter();
        st1920.automaton.REString rEString5 = st1920.automaton.REString.makeRepeatOnceOrMore(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.REString.makeAnd(rEString3, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.REString.makeOr(rEString2, rEString3);
        java.lang.String str8 = rEString7.getRegex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\"aaa\"" + "'", str1.equals("\"aaa\""));
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "~\"aaa\"|\"aaa\"" + "'", str8.equals("~\"aaa\"|\"aaa\""));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeAlpha();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeRepeatZeroOrMore(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.REString.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.REString.makeNegation(rEString2);
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
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("a+");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeSpecialCharacter();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeRangeOfOccurences(rEString0);
        java.lang.String str2 = rEString0.getRegex();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\%" + "'", str2.equals("\\%"));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeSpecialCharacter();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeRepeatOnceOrMore(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.REString.makeAlpha();
        st1920.automaton.REString rEString3 = st1920.automaton.REString.makeRepeatZeroOrMore(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.REString.makeConcatenation(rEString0, rEString3);
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
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        st1920.automaton.REString rEString0 = null;
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeAlpha();
        st1920.automaton.REString rEString2 = st1920.automaton.REString.makeRepeatZeroOrMore(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.REString.makeRepeatZeroOrOne(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString5 = st1920.automaton.REString.makeEntireString();
        java.lang.String str6 = rEString5.getRegex();
        st1920.automaton.REString rEString7 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString8 = st1920.automaton.REString.makeConcatenation(rEString5, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.REString.makeOr(rEString4, rEString5);
        st1920.automaton.REString rEString10 = st1920.automaton.REString.makeRepeatZeroOrMore(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.REString.makeConcatenation(rEString2, rEString10);
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString12 = st1920.automaton.REString.makeOr(rEString0, rEString2);
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\"aaa\"" + "'", str6.equals("\"aaa\""));
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
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeLetterRange();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeNegation(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.REString.makeRangeOfOccurences(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9, matchString10);
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString12, matchString13);
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString14);
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString14);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString14);
        st1920.automaton.REString rEString18 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString19 = st1920.automaton.REString.makeEntireString();
        java.lang.String str20 = rEString19.getRegex();
        st1920.automaton.REString rEString21 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString22 = st1920.automaton.REString.makeConcatenation(rEString19, rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.REString.makeOr(rEString18, rEString19);
        boolean boolean24 = st1920.automaton.MatcherWrapper.matches(matchString17, rEString19);
        st1920.automaton.MatchString matchString25 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString2, matchString17);
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
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "\"aaa\"" + "'", str20.equals("\"aaa\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString25);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeDigit();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeRepeatOnceOrMore(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.REString.makeRepeatZeroOrOne(rEString0);
        st1920.automaton.REString rEString3 = st1920.automaton.REString.makeRepeatOnceOrMore(rEString0);
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
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString8);
        st1920.automaton.REString rEString11 = st1920.automaton.REString.makeAnyString();
        st1920.automaton.REString rEString12 = st1920.automaton.REString.makeNegation(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.REString.makeNegation(rEString12);
        boolean boolean14 = st1920.automaton.MatcherWrapper.matches(matchString10, rEString12);
        st1920.automaton.REString rEString15 = st1920.automaton.REString.makeEntireString();
        java.lang.String str16 = rEString15.getRegex();
        st1920.automaton.REString rEString17 = st1920.automaton.REString.makeNegation(rEString15);
        st1920.automaton.REString rEString18 = st1920.automaton.REString.makeOr(rEString12, rEString15);
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
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\"aaa\"" + "'", str16.equals("\"aaa\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeEntireString();
        java.lang.String str2 = rEString1.getRegex();
        st1920.automaton.REString rEString3 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString4 = st1920.automaton.REString.makeConcatenation(rEString1, rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.REString.makeOr(rEString0, rEString1);
        st1920.automaton.REString rEString6 = st1920.automaton.REString.makeRepeatZeroOrMore(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.REString.makeRangeOfOccurences(rEString6);
        java.lang.Class<?> wildcardClass8 = rEString7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\"aaa\"" + "'", str2.equals("\"aaa\""));
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeSpecialCharacter();
        st1920.automaton.REString rEString2 = st1920.automaton.REString.makeRepeatOnceOrMore(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.REString.makeAnd(rEString0, rEString2);
        java.lang.Class<?> wildcardClass4 = rEString2.getClass();
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
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString3 = st1920.automaton.REString.makeEntireString();
        java.lang.String str4 = rEString3.getRegex();
        st1920.automaton.REString rEString5 = st1920.automaton.REString.makeNegation(rEString3);
        boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString5);
        java.lang.Class<?> wildcardClass7 = matchString1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\"aaa\"" + "'", str4.equals("\"aaa\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString8);
        st1920.automaton.REString rEString11 = st1920.automaton.REString.makeAnyString();
        st1920.automaton.REString rEString12 = st1920.automaton.REString.makeNegation(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.REString.makeNegation(rEString12);
        boolean boolean14 = st1920.automaton.MatcherWrapper.matches(matchString10, rEString12);
        st1920.automaton.REString rEString15 = st1920.automaton.REString.makeRepeatZeroOrOne(rEString12);
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
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        st1920.automaton.REString rEString0 = st1920.automaton.REString.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.REString.makeNegation(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.REString.makeRangeOfOccurences(rEString0);
        st1920.automaton.REString rEString3 = st1920.automaton.REString.makeRangeOfOccurences(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.REString.makeRangeOfOccurences(rEString3);
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
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        st1920.automaton.REString rEString1 = new st1920.automaton.REString("[a-zA-z]");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString3 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString4 = st1920.automaton.REString.makeEntireString();
        java.lang.String str5 = rEString4.getRegex();
        st1920.automaton.REString rEString6 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString7 = st1920.automaton.REString.makeConcatenation(rEString4, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.REString.makeOr(rEString3, rEString4);
        boolean boolean9 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.REString.makeEntireString();
        java.lang.String str11 = rEString10.getRegex();
        st1920.automaton.REString rEString12 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString13 = st1920.automaton.REString.makeConcatenation(rEString10, rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.REString.makeNegation(rEString10);
        st1920.automaton.REString rEString15 = st1920.automaton.REString.makeOr(rEString8, rEString10);
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\"aaa\"" + "'", str5.equals("\"aaa\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "\"aaa\"" + "'", str11.equals("\"aaa\""));
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
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9, matchString10);
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString11);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString3);
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
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeSpecialChar();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString2, matchString5);
        st1920.automaton.REString rEString7 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString8 = st1920.automaton.REString.makeEntireString();
        java.lang.String str9 = rEString8.getRegex();
        st1920.automaton.REString rEString10 = st1920.automaton.REString.makeEntireString();
        st1920.automaton.REString rEString11 = st1920.automaton.REString.makeConcatenation(rEString8, rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.REString.makeOr(rEString7, rEString8);
        st1920.automaton.REString rEString13 = st1920.automaton.REString.makeRepeatZeroOrMore(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.REString.makeEntireString();
        java.lang.String str15 = rEString14.getRegex();
        st1920.automaton.REString rEString16 = st1920.automaton.REString.makeNegation(rEString14);
        st1920.automaton.REString rEString17 = st1920.automaton.REString.makeAnd(rEString12, rEString16);
        boolean boolean18 = st1920.automaton.MatcherWrapper.matches(matchString2, rEString16);
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString19, matchString20);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString22, matchString23);
        st1920.automaton.MatchString matchString25 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString21, matchString23);
        st1920.automaton.MatchString matchString26 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString2, matchString21);
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
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\"aaa\"" + "'", str9.equals("\"aaa\""));
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "\"aaa\"" + "'", str15.equals("\"aaa\""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
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
    }
}

