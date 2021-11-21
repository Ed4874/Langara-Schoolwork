public class FlightTester
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
      
		System.out.println(flightAC);
		//Expected output: AC8050 {passengers:5 [manpreet ,ming ,annie ,bobby ,jimmy]}
      
		System.out.println();
      
		// create a flight without passengers
		Flight flightLH = new Flight("LH492");
      
		System.out.println(flightLH);
		//expected output: LH492 {Passengers: 0  [ ] }
      
		System.out.println();
      
		if (!flightLH.add(" gretzky ")) 
			System.out.println("failed to add properly");
		if (!flightLH.add(" McDavid")) 
			System.out.println("failed to add properly");
		if (!flightLH.add("Bobby")) 
			System.out.println("failed to add properly");
		if (!flightLH.add("Lafleur ")) 
			System.out.println("failed to add properly");
      
		System.out.println(flightLH);
		//Expected output: LH492 {Passengers: 4 [gretzky ,mcdavid ,bobby ,lafleur ] }
      
		System.out.println();
            
		System.out.print("LH492.totalNoDups(AC8050) = " + flightLH.totalNoDups(flightAC));
		System.out.println(" -- expecting 8");
      
		System.out.print("AC8050.totalNoDups(AC8050) = " + flightAC.totalNoDups(flightAC));
		System.out.println(" -- expecting 5");
      
		System.out.print("AC8050.totalNoDups(null) = " + flightAC.totalNoDups(null));
		System.out.println(" -- expecting 5");
      
		System.out.println();
      
		Flight flightBA = new Flight("BA84");
		if (!flightBA.add("Gretzky ")) 
			System.out.println("failed to add properly");
		if (!flightBA.add(" McDavid")) 
			System.out.println("failed to add properly");
		if (!flightBA.add("Crosby")) 
			System.out.println("failed to add properly");
		if (!flightBA.add("Lafleur ")) 
			System.out.println("failed to add properly");
		
		System.out.println(flightBA);
		//Expected output: BA84 {Passengers: 4 [gretzky ,mcdavid ,crosby ,lafleur ] }
      
		System.out.println();
      
		System.out.print("BA84.totalNoDups(LH492) = " + flightBA.totalNoDups(flightLH));
		System.out.println(" -- expecting 5");
      
		System.out.print("BA84.totalNoDups(null) = " + flightBA.totalNoDups(null));
		System.out.println(" -- expecting 4");
		System.out.println();
      
		System.out.print("instances of Flights = " + Flight.getNumberOfFlights());
		System.out.println(" -- expecting 3");
      
		System.out.println();

	}
}
