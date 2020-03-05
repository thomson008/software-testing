package st1920.automaton;
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
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString1);
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
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        st1920.automaton.REString rEString0 = null;
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlphabet();
        java.lang.Class<?> wildcardClass1 = matchString0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeEntireString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
        boolean boolean4 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
        java.lang.Class<?> wildcardClass5 = rEString1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        st1920.automaton.MatcherWrapper matcherWrapper0 = new st1920.automaton.MatcherWrapper();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeDigit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnd(rEString3, rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString3);
        java.lang.Class<?> wildcardClass7 = rEString6.getClass();
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString1);
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString1);
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
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNegation(rEString2);
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
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnd(rEString3, rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString3);
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
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
        boolean boolean4 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString6);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString10, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAnd(rEString13, rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString11, rEString13);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString16);
        boolean boolean18 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumberRange();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnd(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString6);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString10, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeAnd(rEString9, rEString10);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString10);
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNumberRange();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString2, rEString4);
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
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
        boolean boolean4 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnd(rEString8, rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString8);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString6);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAnd(rEString13, rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
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
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnd(rEString8, rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString8);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString4);
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
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString2);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnd(rEString5, rEString6);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeOr(rEString4, rEString5);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString4);
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
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnd(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString10);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString10);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAnd(rEString6, rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString6);
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
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
        boolean boolean5 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString2);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString11);
        boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString6, rEString9);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeOr(rEString16, rEString17);
        boolean boolean19 = st1920.automaton.MatcherWrapper.matches(matchString15, rEString16);
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString14, matchString15);
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString15);
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeAnd(rEString24, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAnd(rEString27, rEString28);
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeAnd(rEString24, rEString29);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22, rEString29);
        boolean boolean32 = st1920.automaton.MatcherWrapper.matches(matchString6, rEString22);
        java.lang.Class<?> wildcardClass33 = rEString22.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
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
        org.junit.Assert.assertNotNull(matchString21);
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnd(rEString3, rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNegation(rEString5);
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
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
        boolean boolean5 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString2);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString9, rEString11);
        boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString6, rEString9);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeOr(rEString16, rEString17);
        boolean boolean19 = st1920.automaton.MatcherWrapper.matches(matchString15, rEString16);
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString14, matchString15);
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString15);
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeAnd(rEString24, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAnd(rEString27, rEString28);
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeAnd(rEString24, rEString29);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22, rEString29);
        boolean boolean32 = st1920.automaton.MatcherWrapper.matches(matchString6, rEString22);
        st1920.automaton.MatchString matchString33 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString34 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeOr(rEString35, rEString36);
        boolean boolean38 = st1920.automaton.MatcherWrapper.matches(matchString34, rEString35);
        st1920.automaton.MatchString matchString39 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString33, matchString34);
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeOr(rEString40, rEString41);
        st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString41);
        boolean boolean44 = st1920.automaton.MatcherWrapper.matches(matchString33, rEString43);
        boolean boolean45 = st1920.automaton.MatcherWrapper.matches(matchString6, rEString43);
        java.lang.Class<?> wildcardClass46 = matchString6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
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
        org.junit.Assert.assertNotNull(matchString21);
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
        org.junit.Assert.assertNotNull(matchString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString34);
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
        org.junit.Assert.assertNotNull(rEString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
        boolean boolean5 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString2);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeOr(rEString7, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString8);
        boolean boolean11 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString10);
        st1920.automaton.MatchString matchString12 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnd(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString6);
        boolean boolean9 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString6);
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
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNegation(rEString3);
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
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString1);
        st1920.automaton.REString rEString3 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString3);
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
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString4);
        boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString2, rEString3);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString12);
        boolean boolean14 = st1920.automaton.MatcherWrapper.matches(matchString10, rEString11);
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9, matchString10);
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeOr(rEString17, rEString18);
        boolean boolean20 = st1920.automaton.MatcherWrapper.matches(matchString16, rEString17);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeOr(rEString21, rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeAnd(rEString24, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22, rEString24);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeOr(rEString17, rEString22);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeOr(rEString29, rEString30);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString30);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString30);
        st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeOr(rEString34, rEString35);
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeAnd(rEString37, rEString38);
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString35, rEString37);
        st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString33, rEString40);
        st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22, rEString41);
        boolean boolean43 = st1920.automaton.MatcherWrapper.matches(matchString9, rEString42);
        st1920.automaton.MatchString matchString44 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString9);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString44);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNegation(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNegation(rEString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeOr(rEString4, rEString5);
        boolean boolean7 = st1920.automaton.MatcherWrapper.matches(matchString3, rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeOr(rEString8, rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeAnd(rEString11, rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString11);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString4, rEString9);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeAnd(rEString16, rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString9, rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeWildcard();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString3);
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
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
        boolean boolean4 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnd(rEString8, rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString8);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString6);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString13, rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString14);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeOr(rEString18, rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeAnd(rEString21, rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString19, rEString21);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString17, rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
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
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
        boolean boolean4 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnd(rEString8, rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString8);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString6);
        java.lang.Class<?> wildcardClass13 = rEString1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
        boolean boolean4 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnd(rEString8, rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString8);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString6);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString13, rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString14);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeOr(rEString18, rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeAnd(rEString21, rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString19, rEString21);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString17, rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAnd(rEString27, rEString28);
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString29);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString29);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeAnd(rEString25, rEString29);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeNegation(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
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
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNegation(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNegation(rEString0);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnd(rEString3, rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString7);
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
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumberRange();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnd(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString6);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString10, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeAnd(rEString9, rEString10);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeAnd(rEString10, rEString15);
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
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeOr(rEString2, rEString3);
        boolean boolean5 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString2);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeOr(rEString8, rEString9);
        boolean boolean11 = st1920.automaton.MatcherWrapper.matches(matchString7, rEString8);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeOr(rEString12, rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeAnd(rEString15, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13, rEString15);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeOr(rEString8, rEString13);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeOr(rEString20, rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString21);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString21);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeOr(rEString25, rEString26);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeAnd(rEString28, rEString29);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString26, rEString28);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString24, rEString31);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString13, rEString32);
        boolean boolean34 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString33);
        st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeRangeOfOccurences(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeOr(rEString3, rEString4);
        boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString2, rEString3);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeOr(rEString11, rEString12);
        boolean boolean14 = st1920.automaton.MatcherWrapper.matches(matchString10, rEString11);
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9, matchString10);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeOr(rEString16, rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeOr(rEString18, rEString20);
        boolean boolean22 = st1920.automaton.MatcherWrapper.matches(matchString15, rEString18);
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeOr(rEString25, rEString26);
        boolean boolean28 = st1920.automaton.MatcherWrapper.matches(matchString24, rEString25);
        st1920.automaton.MatchString matchString29 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString23, matchString24);
        st1920.automaton.MatchString matchString30 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString15, matchString24);
        st1920.automaton.MatchString matchString31 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString30);
        st1920.automaton.MatchString matchString32 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString33 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeOr(rEString34, rEString35);
        boolean boolean37 = st1920.automaton.MatcherWrapper.matches(matchString33, rEString34);
        st1920.automaton.MatchString matchString38 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString32, matchString33);
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeOr(rEString39, rEString40);
        st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString42);
        st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeOr(rEString41, rEString43);
        boolean boolean45 = st1920.automaton.MatcherWrapper.matches(matchString38, rEString41);
        st1920.automaton.MatchString matchString46 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString47 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeOr(rEString48, rEString49);
        boolean boolean51 = st1920.automaton.MatcherWrapper.matches(matchString47, rEString48);
        st1920.automaton.MatchString matchString52 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString46, matchString47);
        st1920.automaton.MatchString matchString53 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString38, matchString47);
        st1920.automaton.REString rEString54 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString55 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString54);
        st1920.automaton.REString rEString56 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString57 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString58 = st1920.automaton.MatcherWrapper.makeAnd(rEString56, rEString57);
        st1920.automaton.REString rEString59 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString60 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString61 = st1920.automaton.MatcherWrapper.makeAnd(rEString59, rEString60);
        st1920.automaton.REString rEString62 = st1920.automaton.MatcherWrapper.makeAnd(rEString56, rEString61);
        st1920.automaton.REString rEString63 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString54, rEString61);
        boolean boolean64 = st1920.automaton.MatcherWrapper.matches(matchString38, rEString54);
        st1920.automaton.MatchString matchString65 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString66 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString67 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString68 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString69 = st1920.automaton.MatcherWrapper.makeOr(rEString67, rEString68);
        boolean boolean70 = st1920.automaton.MatcherWrapper.matches(matchString66, rEString67);
        st1920.automaton.MatchString matchString71 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString65, matchString66);
        st1920.automaton.REString rEString72 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString73 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString74 = st1920.automaton.MatcherWrapper.makeOr(rEString72, rEString73);
        st1920.automaton.REString rEString75 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString73);
        boolean boolean76 = st1920.automaton.MatcherWrapper.matches(matchString65, rEString75);
        boolean boolean77 = st1920.automaton.MatcherWrapper.matches(matchString38, rEString75);
        st1920.automaton.MatchString matchString78 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString30, matchString38);
        st1920.automaton.MatchString matchString79 = st1920.automaton.MatcherWrapper.makeAlphabet();
        st1920.automaton.MatchString matchString80 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString78, matchString79);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
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
        org.junit.Assert.assertNotNull(matchString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString31);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString38);
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
        org.junit.Assert.assertNotNull(matchString46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString53);
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString80);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnd(rEString8, rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString8);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString4, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString11);
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
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnd(rEString2, rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnd(rEString5, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnd(rEString2, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString7);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString10, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString15, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeAnd(rEString18, rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString16, rEString18);
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString14, rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString21);
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeOr(rEString25, rEString26);
        boolean boolean28 = st1920.automaton.MatcherWrapper.matches(matchString24, rEString25);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString25);
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
        org.junit.Assert.assertNotNull(matchString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumberRange();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnd(rEString2, rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnd(rEString5, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnd(rEString2, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString7);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString10, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString11);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString11);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString15, rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeAnd(rEString18, rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString16, rEString18);
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString14, rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString21);
        java.lang.Class<?> wildcardClass24 = rEString23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumberRange();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnd(rEString4, rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnd(rEString0, rEString6);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString10, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeAnd(rEString9, rEString10);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString13);
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
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOr(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString1);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString1);
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString7);
        boolean boolean9 = st1920.automaton.MatcherWrapper.matches(matchString5, rEString6);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString10, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAnd(rEString13, rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString11, rEString13);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOr(rEString6, rEString11);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeOr(rEString18, rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString19);
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString19);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeOr(rEString23, rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeAnd(rEString26, rEString27);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString24, rEString26);
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString22, rEString29);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString11, rEString30);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeAnd(rEString32, rEString33);
        st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString34);
        st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString34);
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeAnd(rEString30, rEString34);
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeAnd(rEString1, rEString37);
        st1920.automaton.REString rEString39 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString37, rEString39);
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
        org.junit.Assert.assertNotNull(matchString5);
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
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString2);
        boolean boolean4 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOr(rEString5, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnd(rEString8, rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString8);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOr(rEString1, rEString6);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeOr(rEString13, rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrOne(rEString14);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeRepeatOnceOrMore(rEString14);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeNoneString();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeOr(rEString18, rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeLetterRange();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeAnd(rEString21, rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString19, rEString21);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString17, rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeAnyString();
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeRepeatZeroOrMore(rEString27);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAnd(rEString26, rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
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
    }
}

