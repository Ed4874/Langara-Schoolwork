/**
 * A bedroom is a room that may or may not have a balcony.
 * When calculating the area of the bedroom, we add the balcony's area
 * (if there is a balcony).
 */
public class Bedroom {

    // Width of the bedroom in meters.
    public static final int BEDROOM_WIDTH = 3;

    // Length of the bedroom in meters.
    public static final int BEDROOM_LENGTH = 4;

    // The area in square meters of the balcony: the balcony is adjacent to the
    // bedroom and is considered part of the bedroom.
    //
    private static final int BALCONY_AREA = 1;

    // determines if the bedroom has a balcony
    private boolean hasBalcony;

    /**
     * Creates a bedroom with dimensions BEDROOM_WIDTH by BEDROOM_LENGTH: the bedroom
     * may or may not have a balcony.
     * @param hasBalcony indicates that the bedroom has a balcony when true,
     * false indicates no balcony attached to the bedroom.
     */
    public Bedroom(boolean hasBalcony) {


    }

    /**
     * Calculates the area of the bedroom using the width times the length
     * and if the bedroom has a balcony, the balcony's area is added to the
     * rooms area.
     * @throws Exception if the room area is less than MIN_ROOM_AREA
     */






}
