/**
 * A kitchen is a room that may or may not have a pantry.
 * When calculating the area of the kitchen, we do NOT take the pantry's
 * area in consideration.
 */
public class Kitchen extends Room {

    // Width of the pantry: the pantry area is not included in the kitchen area.
    private int pantryWidth;

    // Length of the pantry: the pantry area is not included in the kitchen area.
    private int pantryLength;

    /**
     * Creates a kitchen without a pantry.
     * @param width the width of the kitchen (including the pantry width)
     *  precondition: width is greater than 0
     * @param length the length of the kitchen (including the pantry length)
     *  precondition: length is greater than 0
     */
    public Kitchen(int width, int length) {



    }

    /**
     * Adds a pantry (a closet) of dimensions width by length to the kitchen.
     * @param width the width of the pantry
     *  precondition: width is greater than 0
     * @param length the length of the pantry
     *  precondition: length is greater than 0
     */
    public void addPantry(int width, int length) {

        pantryWidth = width;
        pantryLength = length;

    }

    @Override
    public int getArea() {
        return getWidth() * getLength();
    }

    /**
     * Calculates the area of the kitchen using the width times the length
     * and if the kitchen has a pantry, the pantry's area is subtracted
     * from that area.
     * @throws Exception if the room area is less than MIN_ROOM_AREA
     */




}
