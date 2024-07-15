import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseNumber {
	
	@Test
	public void testingIfTheReversalFunctionWorks() {
		ReverseNumber reverseNumber = new ReverseNumber();
		
		int result = reverseNumber.reverse(12345);
		
		assertEquals(54321, result);
}
}