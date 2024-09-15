package polling.program;

public class Polling {
    private Topic listOfTopics;
    private final int[][] response = new int[5][10];

    public int getNumberOfIssues() {
        return 5;
    }
    public Topic getTopic() {
        return listOfTopics;
    }

    public int[][] getResponse() {
        return response;
    }

    public void setResponse(Topic topic, int column) {
        Topic[] issues = listOfTopics.values();
        for(Topic issue: issues) {
            if(topic.equals(issue)) {
                response[issue.ordinal()][column] = response[issue.ordinal()][column] + 1;
            }
        }
    }
}
