package st1920.automaton;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task4 {

	@Test
	public void testExample() {
		assertTrue(RegExpMatcher.matches("a\naaa\r\n", "(a+$)+"));
	}
	
	@Test
	public void oneOrMore() {
		String test = "\n\r\n\r";
		String regex = "$+";
		assertTrue(RegExpMatcher.matches(test, regex));
	}
	
	@Test
	public void range() {
		String test = "\n\r\n\n\r";
		String regex = "${1,5}";
		assertTrue(RegExpMatcher.matches(test, regex));
	}
	
	@Test
	public void zeroOrOne() {
		String test = "\n\r\r";
		String regex = "$?";
		assertFalse(RegExpMatcher.matches(test, regex));
	}
	
	@Test
	public void canBeBoth2or3() {
		String test = "\r\n\n";
		String regex = "${3}&${2}";
		assertTrue(RegExpMatcher.matches(test, regex));
	}
	
	@Test
	public void zeroOrMore() {
		String test = "hello";
		String regex = "\"hello\"$*";
		assertTrue(RegExpMatcher.matches(test, regex));
	}
	
	@Test
	public void orAnotherPattern() {
		String test = "\n\n\r\r\n";
		String regex = "$+|test";
		assertTrue(RegExpMatcher.matches(test, regex));
	}
	
	@Test
	public void betweenWords() {
		String test = "hello\nworld\r\n!";
		String regex = "[a-z]+$\"world\"$!";
		assertTrue(RegExpMatcher.matches(test, regex));
	}
	
	@Test
	public void wrongOrder() {
		String test = "hello\n\rworld";
		String regex = "\"hello\"$[a-zA-Z0-9]+";
		assertFalse(RegExpMatcher.matches(test, regex));
	}
	
	@Test
	public void moreThanFive() {
		String test = "\n\r\r\n";
		String regex = "${5,}";
		assertFalse(RegExpMatcher.matches(test, regex));
	}
}
