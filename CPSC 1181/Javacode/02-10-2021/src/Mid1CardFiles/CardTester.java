import java.util.*;

public class CardTester
{
	public static void main (String[] args)
	{
		Envelope  first  = new Envelope(new Birthday( "Stephanie", 29 ));
		Envelope  second = new Envelope(new Valentine("May", 5));
		
		first.open();
		//Expected output:
		//Dear Stephanie
                //Happy 29th Birthday
		
		second.open();
		//Expected output:
		//My May
                //Love and Kisses,
		//XXXXX
	}
}