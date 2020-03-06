package st1920.automaton;
import static org.junit.Assert.*;
import org.junit.Test;

public class Task4 {
	@Test
	public void testUnix() {
		assertTrue(RegExpMatcher.matches("\n", "$"));
	}
	
	@Test
	public void testWindows() {
		assertTrue(RegExpMatcher.matches("\r\n", "$"));
	}
	
	@Test
	public void testMac() {
		assertTrue(RegExpMatcher.matches("\r", "$"));
	}
	
	@Test
	public void testExample() {
		assertTrue(RegExpMatcher.matches("a\naaa\r\n", "(a+$)+"));
	}
	
	@Test
	public void oneOrMore() {
		assertTrue(RegExpMatcher.matches("\n\r\n\r", "$+"));
	}
	
	@Test
	public void range() {
		assertTrue(RegExpMatcher.matches("\n\r\n\n\r", "${1,5}"));
	}
	
	@Test
	public void zeroOrOne() {
		assertFalse(RegExpMatcher.matches("\n\r\r", "$?"));
	}
	
	@Test
	public void canBeBoth2or3() {
		assertTrue(RegExpMatcher.matches("\r\n\n", "${3}&${2}"));
	}
	
	@Test
	public void zeroOrMore() {
		assertTrue(RegExpMatcher.matches("hello", "\"hello\"$*"));
	}
	
	@Test
	public void orAnotherPattern() {
		assertTrue(RegExpMatcher.matches("\n\n\r\r\n", "$+|test"));
	}
	
	@Test
	public void betweenWords() {
		assertTrue(RegExpMatcher.matches("hello\nworld\r\n!", "[a-z]+$\"world\"$!"));
	}
	
	@Test
	public void wrongOrder() {
		assertFalse(RegExpMatcher.matches("hello\n\rworld", "\"hello\"$[a-zA-Z0-9]+"));
	}
	
	@Test
	public void moreThanFive() {
		assertFalse(RegExpMatcher.matches("\n\r\r\n", "${5,}"));
	}
	
	@Test
	public void empty() {
		assertFalse(RegExpMatcher.matches("", "$"));
	}
	
	@Test
	public void noNewline() {
		assertFalse(RegExpMatcher.matches("aaaa.bbbb\\*^5", "($+)*"));
	}
	
	@Test
	public void surroundingWords() {
		assertTrue(RegExpMatcher.matches("\n\raaa.b\r\n", "$$a+.[a-z]${2,}"));
	}
}
