public class FlightTesterFirst
{
	public static void main( String[] args )
	{
		Flight flightAC = new Flight("AC8050");  

		// add names some with blanks before, some with blanks after, some with upper case letters
		String person = "Manpreet";
		if (!flightAC.add(person)) 
			System.out.println("failed to add properly");
		if (!flightAC.add(" MING ")) 
			System.out.println("failed to add properly");
		if (!flightAC.add("anniE")) 
			System.out.println("failed to add properly");
		if (!flightAC.add("bOBBy  ")) 
			System.out.println("failed to add properly");
		if (!flightAC.add("        jiMMy")) 
			System.out.println("failed to add properly");
      
        System.out.println(flightAC.toString());
        //Expected output:
        //AC8050 {Passengers: 5 [manpreet ,ming ,annie ,bobby ,jimmy ] }
      
        // try to add annie who is already on the flight
         if (flightAC.add("ANNIE   "))
              System.err.println("ERROR: should not have been added");
         else
              System.err.println("Duplicate names, the passenger is not added.");
      
         System.out.println(flightAC.toString());
         //Expected output:
		 //AC8050 {Passengers: 5 [manpreet ,ming ,annie ,bobby ,jimmy ] }
      
         System.out.println("\nNumberof flights created = " + Flight.getNumberOfFlights());
         //Expected output: Numberof flights created = 1
   }
}
