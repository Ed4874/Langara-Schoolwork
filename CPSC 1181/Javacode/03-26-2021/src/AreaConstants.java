/**
 * Useful constants for the
 * - Lab9Server class
 * - Lab9Service class
 * - Client class
 */

public interface AreaConstants {
    // named in honour of my favourite course this semester
    int PORT = 1181;

    // RADIUS is sent from the client -> server
    //     RADIUS d
    // where d is a double
    int RADIUS = 0;

    // QUIT is sent from the client -> server
    //     QUIT
    int QUIT = 1;

    // AREA is sent from the server -> client
    //     AREA d
    // where d is a double
    // AREA is sent in response to the client's RADIUS
    int AREA = 2;

    // DONE sent from the server -> client
    //     DONE
    // DONE is sent in response to the client's QUIT
    int DONE = 3;

    /**
     * This arrray CMD is a convenience when debugging so that instead
     * of printing a "cryptic number", a string can be printed out.
     * Following the string, we have put the value that should correspond
     * to the constants which are below.
     */
    String[] CMD = {
            "RADIUS", /* 0 */
            "QUIT",   /* 1 */
            "AREA",   /* 2 */
            "DONE"    /* 3 */
    };

}
