import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CryptographyTest {

	@Test
	public void testingIfTheSortMethodIsWorkingFine(){
		ArraySorting collections = new ArraySorting();
		
		int result = collections.sort();
		
		assertEquals(sort(), result);

}
}