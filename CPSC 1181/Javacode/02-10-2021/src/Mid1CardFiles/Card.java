/** The abstract class Card has a recipeint */

public abstract class Card
{
	private  String recipient;
	
	/** Card constructor has a name of the card recipient 
	  * @param recipeint the name of the recipeint
	  */
	public Card(String recipeint)
	{
		this. recipient =  recipeint;	
	}

	public Card() {

	}

	/** @return the card recipeint
	  */
	public String getRecipient()
	{
		return recipient;
	}
   
	/** abstract method which must be overridden by the Card sub-classes
	  */
	public abstract void greeting();
   
}