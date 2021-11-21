import java.util.ArrayList;

/**
* A purse holds a collection of coins.CPSC 1181 Lab III from  Programming Exercise P7.5  Big Java, 4th Edition, Cay Horstmann
* @author modified heavily by Gladys Monagan and Hengameh Hamavand
* @version January 25, 2015
* Edited by Student: Edward Lu, 100359822
*/
public class Purse
{
	private ArrayList<Coin> listOfCoins;

	private int coinCount;
	private int value;
	private int totalCount;


	/**
	   * Constructs an empty purse.
	   */
	public Purse() {
		listOfCoins = new ArrayList<Coin>();
	}
   

	/**
	   * Adds a coin to the purse regardless of whether the <code>coin</code> was in the 
	   * purse  already or not
	   * @param coin the coin to add
	   */
	public void addCoin(Coin addingCoin) {
		listOfCoins.add(addingCoin);
	}



	/**
	   * Removes a coin from the purse that is the same (denomination) as <code>coin</code>
	   * i.e. it removes a coin from the pruse that is  <code>equal</code> to <code>coin</code>.
	   * <p>
	   * precondition: <code>equals</code> has been define for <code>coin</code>
	   * @param coin a coin that matches the one that should be removed from purse
	   * @return true if the matching coin was removed from the purse, false otherwise
	  */
   public void removeCoin(Coin removingCoin) {
		listOfCoins.remove(removingCoin);
   }

	/**
	   * Gives a text representation of the purse.
	   * @return a string in the format "Purse[coin1,coin2,...]"
	   */
	public String toString()
	{
	      return "Purse " + listOfCoins.toString();

	}

	/**
	   * Counts the number of occurrences of <code>coin</code> in this purse.
	   * <p>
	   * IMPLEMENTATION detail for the lab:
	   * in order for two coins to be considered equal, their value and their name
	   * must match  but there is a method <code>equals</code> defined inside
	   * of the <code>Coin</code> class already
	   * @param coin the item to match against
	   * @return count the number of times the coin is in purse
	   */

	public String getHighestOccurrence() {
		int xElement;
		int xPenny = 0;
		int xNickel = 0;
		int xDime = 0;
		int xQuarter = 0;

		for (int i = 1; i < listOfCoins.size(); i += 2) {
			{
				xElement = listOfCoins.get(i).getValue();
				switch (xElement) {
					case 1:
						xPenny += 1;
					case 5:
						xNickel += 1;
					case 10:
						xDime += 1;
					case 25:
						xQuarter += 1;
				}
			}
		}
		String finalString = "";

		if ((xPenny > xNickel) && (xPenny > xDime) && (xPenny > xQuarter)) {
			finalString = "xPenny, " + xPenny + " occurrences\n";
			return finalString;
		}
		else if ((xNickel > xPenny) && (xNickel > xDime) && (xNickel > xQuarter)) {
			finalString = "xNickel, " + xNickel + " occurrences\n";
			return finalString;
		}
		else if ((xDime > xPenny) && (xNickel < xDime) && (xDime > xQuarter)) {
			finalString = "xDime, " + xDime + " occurrences\n";
			return finalString;
		}
		else if ((xQuarter > xPenny) && (xQuarter > xNickel) && (xDime < xQuarter)) {
			finalString = "xQuarter, " + xQuarter + " occurrences\n";
			return finalString;
		}
		else if ((xPenny == xNickel) && (xPenny > xDime) && (xPenny > xQuarter)) {
			finalString = "xPenny and xNickel, " + xPenny + " occurrences each\n";
			return finalString;
		}
		else if (xPenny == xDime && (xPenny > xNickel) && (xPenny > xQuarter)) {
			finalString = "xPenny and xDime, " + xPenny + " occurrences each\n";
			return finalString;
		}
		else if (xPenny == xQuarter && (xPenny > xNickel) && (xPenny > xDime)) {
			finalString = "xPenny and xQuarter, " + xPenny + " occurrences each\n";
			return finalString;
		}
		else if (xDime == xNickel  && (xDime > xPenny) && (xDime > xQuarter)) {
			finalString = "xNickel and xDime, " + xNickel + " occurrences each\n";
			return finalString;
		}
		else if (xQuarter == xNickel && (xQuarter > xDime) && (xPenny < xQuarter)) {
			finalString = "xNickel and xQuarter, " + xNickel + " occurrences each\n";
			return finalString;
		}
		else if (xQuarter == xDime && (xPenny < xDime) && (xNickel < xQuarter)) {
			finalString = "xDime and xQuarter, " + xDime + " occurrences each\n";
			return finalString;
		}
		else {
			return finalString;
		}
	}

	/**
	   * Determines if a purse has the same coins as the <code>otherPurse</code>,
	   * (regardless of order and possible duplicates).
	   * <p>
	   * IMPLEMENTATION detail for the lab: you must use the method <code>this.occurrences</code>
	   * when implementing <code>hasSameCoins</code>
	   * @param otherPurse the other purse with coins
	   * @param y
	 * @return true if this and the otherPurse have the same coins, false otherwise
	   */

	public boolean hasSameCoins(Purse otherPurse) {
		int xElement;
		int yElement;
		int xPenny = 0;
		int xNickel = 0;
		int xDime = 0;
		int xQuarter = 0;
		int yPenny = 0;
		int yNickel = 0;
		int yDime = 0;
		int yQuarter = 0;
		if ((listOfCoins != null) && (otherPurse != null)) {
			for (int i = 1; i < listOfCoins.size(); i += 2) {
				{
					xElement = listOfCoins.get(i).getValue();
					switch (xElement) {
						case 1:
							xPenny += 1;
						case 5:
							xNickel += 1;
						case 10:
							xDime += 1;
						case 25:
							xQuarter += 1;
					}
				}
			}
			for (int i = 1; i < otherPurse.listOfCoins.size(); i += 2) {
				{
					yElement = otherPurse.listOfCoins.get(i).getValue();
					switch (yElement) {
						case 1:
							yPenny += 1;
						case 5:
							yNickel += 1;
						case 10:
							yDime += 1;
						case 25:
							yQuarter += 1;
					}
				}
			}
		}
		else {
			return false;
		}
		if ((xPenny == yPenny) && (xNickel == yNickel) && (xDime == yDime) && (xQuarter == yQuarter)) {
			return true;
		}
		else {
			return false;
		}

	}

	/**
	   * Gives the highest monetary value of any coin in the purse.
	   * @return the highest coin value of any coin in the purse and 0 if the purse is empty.
	   */
	public String getHighestCoinValue() {
		int xElement;
		int xPenny = 0;
		int xNickel = 0;
		int xDime = 0;
		int xQuarter = 0;

		for (int i = 1; i < listOfCoins.size(); i += 2) {
			{
				xElement = listOfCoins.get(i).getValue();
				switch (xElement) {
					case 1:
						xPenny += 1;
					case 5:
						xNickel += 1;
					case 10:
						xDime += 1;
					case 25:
						xQuarter += 1;
				}
			}
		}
		xNickel = xNickel * 5;
		xDime = xDime * 10;
		xQuarter = xQuarter * 25;
		String finalString = "";

		if ((xPenny > xNickel) && (xPenny > xDime) && (xPenny > xQuarter)) {
			finalString = "xPenny, total worth " + xPenny;
			return finalString;
		}
		else if ((xNickel > xPenny) && (xNickel > xDime) && (xNickel > xQuarter)) {
			finalString = "xNickel, total worth " + xNickel;
			return finalString;
		}
		else if ((xDime > xPenny) && (xNickel < xDime) && (xDime > xQuarter)) {
			finalString = "xDime, total worth " + xDime;
			return finalString;
		}
		else if ((xQuarter > xPenny) && (xQuarter > xNickel) && (xDime < xQuarter)) {
			finalString = "xQuarter, total worth " + xQuarter;
			return finalString;
		}
		else {
			return finalString;
		}
	}

   
   
   
   
	  
}
