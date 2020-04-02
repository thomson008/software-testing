package st1920.automaton;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task3_2 {

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
}