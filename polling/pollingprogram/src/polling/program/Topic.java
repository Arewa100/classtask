package polling.program;

public enum Topic {
    POLITICAL_ISSUE("corruption a major problem"),
    PATERNITY_FRAUD("many robbed of fatherhood"),
    FINANCIAL_ISSUE("poverty a major problem"),
    MATERNITY_ISSUE("women health is important"),
    ENVIRONMENTAL_ISSUE("global warming is a major issue");


    private final String description;
    Topic(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
