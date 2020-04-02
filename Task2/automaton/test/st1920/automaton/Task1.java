package st1920.automaton;

import org.junit.Test;
import st1920.automaton.RegExpMatcher;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
}