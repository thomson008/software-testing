import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import st1920.automaton.RegExpMatcher;

public class Task1 {
	@Test
	public void email() {
		String test = "user@email.com";
		String regex = "([a-zA-Z0-9])+\\@([a-zA-Z0-9])+\\.([a-z]){2,3}";
		assertTrue(RegExpMatcher.matches(test, regex));
	}
	
	@Test
	public void regexEmpty() {
		String test = "1234";
		String regex = "";
		assertFalse(RegExpMatcher.matches(test, regex));
	}
	
	@Test
	public void numbersAfterWord() {
		String test = "nickname2021";
		String regex = "nickname[0-9]+";
		assertTrue(RegExpMatcher.matches(test, regex));
	}
	
	@Test
	public void zeroOrOne() {
		String test = "hello";
		String regex = "hello?";
		assertFalse(RegExpMatcher.matches(test, regex));
	}
	
	@Test
	public void bothEmpty() {
		String test = "";
		String regex = "";
		assertTrue(RegExpMatcher.matches(test, regex));
	}
	
	@Test
	public void quotedString() {
		String test = "123";
		String regex = "\"123\"";
		assertTrue(RegExpMatcher.matches(test, regex));
	}
	
	
}
