/**
 * @author Artur
 *
 */

public abstract class Borrower{
	public Borrower(){
		
	}
	abstract void catalogueEnter();
	abstract void availabilityCheck();
	abstract void checkOut();
}