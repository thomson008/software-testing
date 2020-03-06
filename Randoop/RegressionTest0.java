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
        java.lang.String str0 = st1920.automaton.RegExpMatcher.makeSpecial();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str0 + "' != '" + "!" + "'", str0.equals("!"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.String str0 = st1920.automaton.RegExpMatcher.makeRange();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str0 + "' != '" + "<98-23>" + "'", str0.equals("<98-23>"));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.String str0 = st1920.automaton.RegExpMatcher.makeRepeat1();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str0 + "' != '" + "{79,36}" + "'", str0.equals("{79,36}"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String str0 = st1920.automaton.RegExpMatcher.makeRepeat2();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str0 + "' != '" + "{78,}" + "'", str0.equals("{78,}"));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<98-23>", "{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("!", "{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.String str0 = st1920.automaton.RegExpMatcher.makeAlpha();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str0 + "' != '" + "F" + "'", str0.equals("F"));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.String str0 = st1920.automaton.RegExpMatcher.makeRepeat3();
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str0 + "' != '" + "{48}" + "'", str0.equals("{48}"));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{78,}", "{79,36}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("F", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{78,}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{78,}" + "'", str2.equals("{78,}"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("F", "{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F{78,}" + "'", str2.equals("F{78,}"));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        st1920.automaton.RegExpMatcher regExpMatcher0 = new st1920.automaton.RegExpMatcher();
        java.lang.Class<?> wildcardClass1 = regExpMatcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{48}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{48}" + "'", str2.equals("{48}"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("F", "{48}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F{48}" + "'", str2.equals("F{48}"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("F", "!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F!" + "'", str2.equals("F!"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("F{78,}", "F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F{78,}F{78,}" + "'", str2.equals("F{78,}F{78,}"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<98-23>", "F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<98-23>F" + "'", str2.equals("<98-23>F"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("F", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("F!", "<98-23>F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("F!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F!" + "'", str2.equals("F!"));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{78,}", "<98-23>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<98-23>", "F{48}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{78,}", "F{78,}F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{78,}F{78,}F{78,}" + "'", str2.equals("{78,}F{78,}F{78,}"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<98-23>", "F{78,}F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<98-23>F{78,}F{78,}" + "'", str2.equals("<98-23>F{78,}F{78,}"));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("F{78,}", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{79,36}", "<98-23>F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{78,}F{78,}F{78,}", "F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{78,}F{78,}F{78,}F{78,}" + "'", str2.equals("{78,}F{78,}F{78,}F{78,}"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("!", "F!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!F!" + "'", str2.equals("!F!"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{78,}F{78,}F{78,}F{78,}", "F{78,}F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!", "F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!F{78,}" + "'", str2.equals("hi!F{78,}"));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("", "F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F" + "'", str2.equals("F"));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<98-23>F{78,}F{78,}", "<98-23>F{78,}F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}" + "'", str2.equals("<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{78,}F{78,}F{78,}F{78,}", "F!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "{48}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<98-23>F{78,}F{78,}", "!F!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{79,36}", "{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}", "F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F" + "'", str2.equals("<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F"));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!F{78,}", "hi!F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("", "<98-23>F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<98-23>F" + "'", str2.equals("<98-23>F"));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}", "F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<98-23>", "!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("!F!", "{78,}F{78,}F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("F{78,}F{78,}", "hi!F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F{78,}F{78,}hi!F{78,}" + "'", str2.equals("F{78,}F{78,}hi!F{78,}"));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!", "<98-23>F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!<98-23>F" + "'", str2.equals("hi!<98-23>F"));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("F!", "<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F!<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}" + "'", str2.equals("F!<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}"));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{78,}F{78,}F{78,}", "!F!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{78,}F{78,}F{78,}!F!" + "'", str2.equals("{78,}F{78,}F{78,}!F!"));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!", "{79,36}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!{79,36}" + "'", str2.equals("hi!{79,36}"));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{79,36}", "F!<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{79,36}F!<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}" + "'", str2.equals("{79,36}F!<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}"));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("F!", "hi!{79,36}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F!hi!{79,36}" + "'", str2.equals("F!hi!{79,36}"));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("F{48}", "<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F" + "'", str2.equals("F{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F"));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{48}", "{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{78,}F{78,}F{78,}F{78,}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{78,}F{78,}F{78,}F{78,}" + "'", str2.equals("{78,}F{78,}F{78,}F{78,}"));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{78,}F{78,}F{78,}!F!", "!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!F{78,}", "hi!{79,36}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<98-23>", "<98-23>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<98-23><98-23>" + "'", str2.equals("<98-23><98-23>"));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("F!hi!{79,36}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}", "F{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F" + "'", str2.equals("<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F"));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("", "!F!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!F!" + "'", str2.equals("!F!"));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{79,36}", "F{78,}F{78,}hi!F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!{79,36}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!{79,36}" + "'", str2.equals("hi!{79,36}"));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("F{78,}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F{78,}" + "'", str2.equals("F{78,}"));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("F!", "F{78,}F{78,}hi!F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F", "F!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("", "F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F{78,}" + "'", str2.equals("F{78,}"));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<98-23>F", "F{78,}F{78,}hi!F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<98-23>FF{78,}F{78,}hi!F{78,}" + "'", str2.equals("<98-23>FF{78,}F{78,}hi!F{78,}"));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{48}", "<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{48}", "<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F" + "'", str2.equals("{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F"));
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!{79,36}", "F{48}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!{79,36}F{48}" + "'", str2.equals("hi!{79,36}F{48}"));
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<98-23>FF{78,}F{78,}hi!F{78,}", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<98-23>FF{78,}F{78,}hi!F{78,}" + "'", str2.equals("<98-23>FF{78,}F{78,}hi!F{78,}"));
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("F", "F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FF{78,}" + "'", str2.equals("FF{78,}"));
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{78,}", "hi!F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("F", "F{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F", "hi!{79,36}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}Fhi!{79,36}" + "'", str2.equals("<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}Fhi!{79,36}"));
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{78,}F{78,}F{78,}", "{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<98-23>", "hi!<98-23>F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("F!hi!{79,36}", "<98-23>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F!hi!{79,36}<98-23>" + "'", str2.equals("F!hi!{79,36}<98-23>"));
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("F!<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}", "{48}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F!<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}{48}" + "'", str2.equals("F!<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}{48}"));
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("F!hi!{79,36}<98-23>", "<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F", "F!<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("F!hi!{79,36}<98-23>", "{48}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F!hi!{79,36}<98-23>{48}" + "'", str2.equals("F!hi!{79,36}<98-23>{48}"));
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("!", "<98-23>FF{78,}F{78,}hi!F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<98-23>F", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<98-23>F" + "'", str2.equals("<98-23>F"));
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{78,}", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F", "F!hi!{79,36}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("F{48}", "F!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("F!<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}{48}", "<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "F!<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}" + "'", str2.equals("F!<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}"));
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F", "FF{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!<98-23>F", "hi!F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!<98-23>Fhi!F{78,}" + "'", str2.equals("hi!<98-23>Fhi!F{78,}"));
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("F", "F{48}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!F{78,}", "F!hi!{79,36}<98-23>");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("F{48}", "F!hi!{79,36}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test96");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F", "<98-23>FF{78,}F{78,}hi!F{78,}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F<98-23>FF{78,}F{78,}hi!F{78,}" + "'", str2.equals("<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F<98-23>FF{78,}F{78,}hi!F{78,}"));
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test97");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("!", "{48}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test98");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("F!", "{48}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}F");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test99() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test99");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("{78,}", "<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}Fhi!{79,36}");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{78,}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}Fhi!{79,36}" + "'", str2.equals("{78,}<98-23>F{78,}F{78,}<98-23>F{78,}F{78,}Fhi!{79,36}"));
    }
}
