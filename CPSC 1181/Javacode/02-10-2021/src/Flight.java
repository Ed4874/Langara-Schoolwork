import java.util.ArrayList;
/** 
* The Flight class has a flight number, keeps a list of the names of the passengers that are on the Flight.
*
* Each passenger has a single name (a single word). 
* The name of the passenger is stored in lower case letters without blanks.
*
* It is possible to obtain the number of flights that have been created.
*
*/

public class Flight
{
	private ArrayList<String> flightList;
	private static int count = 0;


	/**
	* Constructs a Flight that has a flightNum and no passengers.
	* @param flightNum the flight number which could include the airline code. 
	* Precondition: flightNum is well formed  and is not null.
	*/
	public Flight(String flightNum)
	{
		flightList = new ArrayList<String>();
		flightList.add(flightNum);
		count++;
	}
   
	/**
	 * Adds a passenger name to the  Flight only if the name
	 *  is not in the Flight passenger list already.
	 *
	 *  When deciding whether a name is a passenger already or
	 *  not, the  name  is matched against the passenger list names
	 *  regardless of (upper/lower) case and regardless of leading and trailing blanks.
	 *
	 * @param name a single word  with possible leading and trailing blanks. Precondition: name is not null.
	 * @return true if the name was added to the list of passengers,  false otherwise
	 */
	public boolean add(String name)
	{
		boolean result = true;
		for (int i = 0; i < flightList.size(); i++) {
			if (flightList.get(i) == name.toLowerCase().strip()) {
				result = false;
			}
		}
		flightList.add(name);
		return result;
	}
   
	/**
	 * @return a string in the format
	 *
	 *    flightNumber  {passengers: n    
	 *          name 0  ,
	 *           name 1 ,
	 *           name 2   ...
	 *           name n-1  ]}
	 *
	 */
	public String toString()
	{
		String result = "";
		result = result.concat(flightList.get(0) + " {passengers: " + (flightList.size()-1)) + " [";
      	for (int i = 1; i < (flightList.size()-1); i++) {
			result = result.concat(flightList.get(i).toLowerCase().strip()) + ", ";
		}
      	result = result.concat(flightList.get(flightList.size()-1).toLowerCase().strip()) + "] }";
		return result;
	}
   
	/**
	 * @return the number of  Flight instances created,
	 * i.e. the number of objects of the class Flight that have been constructed.
	 */
	public static int getNumberOfFlights()
	{

		
		//This statement is added to make the class compile
		return count;
	}
    
	/**
	 * Returns the total  number of passengers that are in the  Flight
	 * added to the total  number  of passengers in the  other Flight ;
	 * however, if a passenger name is in both flights, then it is only counted once.
	 *
	 * For example, if the string returned by a flight's  toString  method is
	 *
	 * CZ330 {passengers:5 [ming, bobby, jimmy, annie, manpreet]}
	 *
	 * and the string returned by the another flight's toStringmethod is
	 *
	 * LH492 {passengers:4 [gretzky, mcdavid, bobby, lafleur]}
	 *
	 * then  totalNoDups  returns 8  because "bobby" is a duplicate since it is in both flights.
	 * @param other the specified other Flight
	 * @return the cardinality of the union of the passengers in the Flight and  in the other Flight
	 */
    
	public int totalNoDups(Flight other)  // based on solution by Damien Lee
	{
		//This statement is added to make the class compile
		return 0;
	}
   
}
