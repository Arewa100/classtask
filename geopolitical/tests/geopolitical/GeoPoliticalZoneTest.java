package geopolitical;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeoPoliticalZoneTest {

    @Test
    public void test_That_Geo_Political_Zones_Exists() {
        GeoPoliticalZone politicalZone = new GeoPoliticalZone();
        assertNotNull(politicalZone);
    }

    @Test
    public void test_that_Geo_Political_Zones_Can_Display_Number_Zone() {
        GeoPoliticalZone politicalZone = new GeoPoliticalZone();
        assertEquals(politicalZone.getZones().length, politicalZone.getNumberOfZones());
    }

    @Test
    public void test_that_Geo_Political_Zones_Can_Display_List_Of_Zones() {
        GeoPoliticalZone politicalZone = new GeoPoliticalZone();
        Zones[] zones = politicalZone.getZones();
        assertArrayEquals(Zones.values(), zones);
    }
    @Test
    public void test_That_Geo_Political_Zone_Can_Display_List_Of_State() {
        GeoPoliticalZone politicalZone = new GeoPoliticalZone();
        Zones zone = politicalZone.getState(Zones.NORTH_EAST);
        String states = zone.getDescription();
        assertEquals("cakes", states);
    }

}
