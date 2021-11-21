import java.awt.Color;
/**
 * A room has a width, a length and a color.
 */
public abstract class Room {
    // Minimum required area of the room for the room to be useful:
    // i.e. if the area is so small, we don't "count" this area when computing
    // the total footage of a house and we say that this room's area is not
    // significant.
    public static final int MIN_ROOM_AREA = 6;

    //A room's (default) color.
    public static final Color ROOM_COLOR = Color.WHITE;

    // set this instance variable to the default ROOM_COLOR
    private Color color;
    // dimensions of the room
    private int width;
    private int length;





    /**
     * Changes the color of the room to the color passed
     * @param color the new color of the room
     */
    public void setColor(Color color)
    {
        this.color = color;
    }
    /**
     * Gets the current color of the room
     * @return the color that the room has
     */
    public Color getColor()
    {
        return color;
    }

    public int getWidth()
    {
        return width;
    }

    public int getLength()
    {
        return length;
    }




    /* Composes a string that gives
     *  the class name followed by a blank
     *  the width followed by a blank
     *  the length followed by a blank
     *  the color (using toString from the class Color)
     * and the color (using toString of the color)
     * @return a textual representation of the object
     */
    @Override
    public String toString()
    {
        String str = getClass().getName();
        str += " " + width + " " + length + " " + color;
        return str;
    }
}