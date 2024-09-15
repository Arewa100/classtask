package geopolitical;

public class GeoPoliticalZone {


    public int getNumberOfZones() {
        return 6;
    }
    public Zones[] getZones() {
        return Zones.values();
    }

    public Zones getState(Zones zones) {
        return zones;
    }
}
