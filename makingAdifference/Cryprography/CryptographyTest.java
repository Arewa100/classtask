import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CryptographyTest {

	@Test
	public void testingIfTheEncryptionMethodCanEncryptAFourDigitNumber(){
		Cryptography data = new Cryptography();
		
		int result = data.encrypt("0149");
		
		assertEquals(1678, result);
}
	@Test
	public void testingIfTheswapMethodCanSwapFourDigitNumber(){
		Cryptography data = new Cryptography();
		
		int result = data.swap(9, 1, 2, 3);
		
		assertEquals(2391, result);
}
	@Test
	public void testingIfTheDecryptionMethodCanDecryptTheAnEncryptedFourDigitNumber(){
		Cryptography data = new Cryptography();
		
		String result = data.decrypt(1678);
		
		assertEquals("0149", result); 
}

	@Test
	public void testingIfTheDecryptionMethodCanDecryptTheAnEncryptedNegativeFourDigitNumber(){
		Cryptography data = new Cryptography();
		
		String result = data.decrypt(-1678);
		
		assertEquals("-4-52-3", result); 
}
}