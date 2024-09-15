package geopolitical;

public enum Zones {

    NORTH_EAST("cakes"),
    NORTH_WEST("small chops"),
    NORTH_CENTRAL("big"),
    SOUTH_EAST("bad boy"),
    SOUTH_WEST("bently"),
    SOUTH_SOUTH("table");


    private final String description;
    Zones(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
