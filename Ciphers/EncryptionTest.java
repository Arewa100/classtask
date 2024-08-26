import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherTest {
	
	@Test
	public void testingIfFunctionToEncryptTextUsingCeaserEncryptionCAnWorkProperly() {
		Cipher feedback = new Cipher();
		
		String cipherText = feedback.encrypt("miracle");
		
		assertEquals("pludfoh", ciphertext);
	}
}