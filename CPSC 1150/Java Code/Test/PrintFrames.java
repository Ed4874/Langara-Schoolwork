import java.util.*;
public class PrintFrames
{
    public static void main(String[] args) {
        int frameType, size, row, col;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the Frame type");
        frameType = scan.nextInt();
        System.out.println("Please enter the Frame size:");
        size = scan.nextInt();

        if ( frameType == 7 ) {
            for ( row = 1; row <= size; row++ ) {
                for ( col = 1; col <= size + 3; col++ )
                      System.out.print('+');
                System. out.println();
            }
        }
        else if ( frameType == 4 ) {
            for ( row = 1; row <= 2*size; row++ ) {
                for ( col = 1; col <= size/2; col++ )
                     System.out.print('*');  
                System.out.println();
            }
        }
        else if ( frameType == 2 || frameType == 3 ) {
            for ( row = 1; row <= size+12; row++ ) {
                 for ( col = 1; col <= size - 4; col++ )
                        System.out.print('$');
                 System.out.println();
            }
        }
        else {
             for ( row = 11; row <= 18; row++ ) {
                  for ( col = 11; col <= 15; col++ )
                        System.out.print('#');
                  System.out.println();
             }
        }
    }
}
