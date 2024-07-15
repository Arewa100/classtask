import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
	
	@Test
	public void testingIfFactorialFunctionIsWorking() {

		Factorial calculator = new Factorial();
		
		int result = calculator.factorial(5);
		
		assertEquals(120, result);
}
}