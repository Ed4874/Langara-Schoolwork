/**
  * The Envelope class contains a Card subclass object of.
 */
public class Envelope
{
	private Card card;
   
	/**
	  * Constructs an Envelope object that has an object of Card sub-classes
	  * @param aCard a Card object added to the envelope
	  */
	public Envelope(Card aCard)
	{
		card = aCard;
	}
	
	/** Open the envelope by readin the card.greeting method
	  */
	public void open()
	{
		card.greeting();
	}
}