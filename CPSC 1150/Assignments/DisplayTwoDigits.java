public class DisplayTwoDigits
{
   public static void main(String[] args)
   {
      double base, rate, howMuch;
      
      base = 10.12;
      rate = 5.5;
      
      howMuch = base * rate;
      
      System.out.println("howMuch is: " + howMuch);
      
      //Using printf to display two digits after the decimal point
      System.out.printf("howMuch using printf is: %.2f \n", howMuch);
      
      //Using Math.round method to modify the howMuch variable to include 2 didgits after the decimal point
      System.out.println("\nMath.round(howMuch) is: " + Math.round(howMuch));
      howMuch = Math.round(howMuch * 100);
      System.out.println("\nNow howMuch is: " + howMuch / 100);
      
   }
}