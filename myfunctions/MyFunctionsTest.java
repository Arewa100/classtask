import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFunctionsTest {
	
	@Test
	public void testingIfFactorialFunctionIsWorking() {

		Function calculator = new Function();
		
		int result = calculator.factorial(5);
		
		assertEquals(120, result);
}
	@Test
	public void testingIfTheReversalFunctionWorks() {

	Function reverseNumber = new Function();
		
	int result = reverseNumber.reverse(12345);
		
		assertEquals(54321, result);
}
	@Test
	public void testingIfPowerFunctionWorks() {
		Function calculate = new Function();
	
		int result = calculate.power(2, 3);
		
		assertEquals(8, result);
}
	@Test
	public void testingIfPowerFunctionCanTestForWhenSecondNumberIsZero() {
		Function calculate = new Function();
		
		int result = calculate.power(2, 0);
		
		assertEquals(1, result);
}
}