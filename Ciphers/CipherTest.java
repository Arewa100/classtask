import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherTest {
	
	@Test
	public void testingIfFunctionToEncryptTextUsingCeaserEncryptionCAnWorkProperly() {
		Cipher feedback = new Cipher();
		
		String cipherText = feedback.encrypt("miracle");
		
		assertEquals("pludfoh", cipherText);
	}
	
	@Test
	public void testingIfCipherFunctionCanEncryptPlainTestForTestStartingWithLletterX() {
		Cipher feedback = new Cipher();
		assertEquals("apdva", feedback.encrypt("xmasx"));
	}

}