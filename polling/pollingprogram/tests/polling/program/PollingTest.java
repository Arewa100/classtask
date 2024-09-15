package polling.program;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PollingTest {
    @Test
    @DisplayName("testing that polling class exists")
    public void test_That_Polling_Exists() {
        assertNotNull(new Polling());
    }
    @Test
    @DisplayName("test that polling have five issues")
    public void test_That_Polling_HaveFiveIssues() {
        Polling polling = new Polling();
        assertEquals(5, polling.getNumberOfIssues());
    }
    
}
