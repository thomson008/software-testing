package st1920.automaton;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

public class Task1 {

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

    @Test
    public void testTask1_07() {
        assertTrue(RegExpMatcher.matches("a", "a{1,a}"));
    }

    @Test
    public void testTask1_08() {
        assertFalse(RegExpMatcher.matches("a", "**"));
    }

    @Test
    public void testTask1_09() {
        assertTrue(RegExpMatcher.matches("a", "<a-b>"));
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
        assertFalse(RegExpMatcher.matches("a", "((a))"));
    }

    @Test
    public void testTask1_13() {
        assertFalse(RegExpMatcher.matches("()", "()"));
    }

    @Test
    public void testTask1_14() {
        assertTrue(RegExpMatcher.matches("[-", "[-"));
    }

    @Test
    public void testTask1_15() {
        assertTrue(RegExpMatcher.matches("abcdefg", "abcdefg"));
    }
}
