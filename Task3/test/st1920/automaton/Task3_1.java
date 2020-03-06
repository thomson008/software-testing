package st1920.automaton;

import org.junit.Test;

public class Task3_1 {

    @Test
    public void test01() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<81-94>", "{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("&", "{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{52,}", "{93,5}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06() {
        st1920.automaton.RegExpMatcher regExpMatcher0 = new st1920.automaton.RegExpMatcher();
        java.lang.Class<?> wildcardClass1 = regExpMatcher0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() {
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2&", "<81-94>2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{52,}", "<81-94>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<81-94>", "2{85}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test12() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2{52,}", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test13() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{93,5}", "<81-94>2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test14() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{52,}2{52,}2{52,}2{52,}", "2{52,}2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15() {
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{52,}2{52,}2{52,}2{52,}", "2&");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "{85}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17() {
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<81-94>2{52,}2{52,}", "&2&");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{93,5}", "{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!2{52,}", "hi!2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}", "2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test21() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<81-94>", "&");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test22() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("&2&", "{52,}2{52,}2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{85}", "{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{52,}2{52,}2{52,}&2&", "&");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!2{52,}", "hi!{93,5}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2&hi!{93,5}", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{93,5}", "2{52,}2{52,}hi!2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2&", "2{52,}2{52,}hi!2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29() {
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2", "2&");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{85}", "<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test31() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{52,}", "hi!2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2", "2{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test33() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{52,}2{52,}2{52,}", "{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<81-94>", "hi!<81-94>2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2&hi!{93,5}<81-94>", "<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2", "2&<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("&", "<81-94>22{52,}2{52,}hi!2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{52,}", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2", "2&hi!{93,5}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40() {
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2{85}", "2&");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2", "22{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test42() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2", "2{85}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!2{52,}", "2&hi!{93,5}<81-94>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test44() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2{85}", "2&hi!{93,5}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("&", "{85}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test46() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2&", "{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test47() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{93,5}2&<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}", "{52,}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2hi!{93,5}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test48() {
        try {
            boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{52,}2{52,}2{52,}2{52,}", "&2&");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unexpected end-of-string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2&<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}", "&");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!2{52,}", "<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2{85}", "2{85}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test52() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2<81-94>22{52,}2{52,}hi!2{52,}", "hi!<81-94>2hi!2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test53() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{52,}2{52,}2{52,}", "hi!{93,5}2{85}{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test54() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2&hi!{93,5}", "<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test55() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "2&hi!{93,5}<81-94>{85}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test56() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2", "<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test57() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test58() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!", "<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2<81-94>22{52,}2{52,}hi!2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test59() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2", "<81-94>22{52,}2{52,}hi!2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test60() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("&2{52,}2{52,}hi!2{52,}", "2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test61() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2&<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}", "{52,}2{52,}2{52,}2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test62() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{52,}2{52,}2{52,}", "{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test63() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2<81-94>{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test64() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2&hi!{93,5}", "<81-94>22{52,}2{52,}hi!2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test65() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2{52,}2{52,}hi!2{52,}", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test66() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2&", "2{85}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test67() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{52,}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2hi!{93,5}", "2{52,}2{52,}hi!2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test68() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("2{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2", "&");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test69() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2", "{93,5}2&<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2&{52,}2{52,}2{52,}2{52,}&2&{52,}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2hi!{93,5}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test70() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2", "<81-94>2{52,}2{52,}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test71() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "&");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test72() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2<81-94><81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test73() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{93,5}2&<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2&{52,}2{52,}2{52,}2{52,}&2&{52,}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2hi!{93,5}", "hi!{93,5}2{85}{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test74() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2", "{52,}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2hi!{93,5}hi!<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test75() {
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!{93,5}2{85}{85}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}2", "2{52,}2{52,}hi!2{52,}<81-94>2{52,}2{52,}<81-94>2{52,}2{52,}<81-94>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}
