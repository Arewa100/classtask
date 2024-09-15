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
    @Test
    @DisplayName("test that issues can be gotten by name")
    public void test_That_Issues_Can_Be_Gotten_By_Name() {
        Polling polling = new Polling();
        assertEquals(5, polling.getNumberOfIssues());
        Topic[] issues = polling.getTopic().values();
        assertEquals("PATERNITY_FRAUD", issues[1].name());
    }
    @Test
    @DisplayName("test to check if two dimensional array response block exists")
    public void test_That_Response_Block_Exists_And_Number_Of_Rows_is_Five() {
        Polling polling = new Polling();
        int[][] responses = polling.getResponse();
        assertEquals(5, responses.length);
    }
    @Test
    @DisplayName("test to affirm that the number of column is 10")
    public void test_That_NumberOf_Column_Is_10() {
        Polling polling = new Polling();
        int[][] responses = polling.getResponse();
        for(int[] response: responses) {
            assertEquals(10, response.length);
        }
    }
    @Test
    @DisplayName("test to set response for specific issue")
    public void test_That_Response_For_Specific_Issue() {
        Polling polling = new Polling();
        int[][] responses = polling.getResponse();
        polling.setResponse(Topic.POLITICAL_ISSUE, 1);
        assertEquals(1, responses[0][1]);
    }
    @Test
    @DisplayName("test to check that number of response increments when set again")
    public void test_That_NumberOf_Response_Increments_When_Set_Again() {
        Polling polling = new Polling();
        int[][] responses = polling.getResponse();
        polling.setResponse(Topic.POLITICAL_ISSUE, 1);
        assertEquals(1, responses[0][1]);
        polling.setResponse(Topic.POLITICAL_ISSUE, 1);
        assertEquals(2, responses[0][1]);
    }
    @Test
    @DisplayName("test to check that number of response increment for two other issue")
    public void test_That_NumberOf_Response_Increments_When_Set_Again_Two_Others() {
        Polling polling = new Polling();
        int[][] responses = polling.getResponse();
        polling.setResponse(Topic.POLITICAL_ISSUE, 1);
        assertEquals(1, responses[0][1]);
        polling.setResponse(Topic.POLITICAL_ISSUE, 1);
        assertEquals(2, responses[0][1]);
        polling.setResponse(Topic.POLITICAL_ISSUE, 8);
        assertEquals(1, responses[0][8]);
        polling.setResponse(Topic.POLITICAL_ISSUE, 8);
        assertEquals(2, responses[0][8]);

    }
}
