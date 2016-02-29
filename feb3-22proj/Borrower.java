import java.util.ArrayList;

/**
 * @author Artur
 *
 */

public abstract class Borrower{

	/**
	 * The books the individual has in their possession
	 */
	public ArrayList<String> books_has = new ArrayList<String>();
	public String username;
	public Borrower(String username){
		this.username = username;
	}
	
	/**
	 * Adds book to lib arraylist
	 * @param book
	 */
	public void catalogueEnter(Book book){
		Main.lib.add(book);
	}
	
	/**
	 * Gets if book is available within Main.lib
	 * @param name
	 * @return
	 */
	public boolean availabilityCheck(String name){
		for(int i = 0; i<Main.lib.size()-1;i++){
			if(Main.lib.get(i).toString().indexOf(name)!=-1){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param in
	 */
	public void checkOut(Book in){
		//in.setTime_of_checkout(new Date()); 
		
		//TODO
		//check if limit is reached, & change status of book in out arraylist & add book to arraylist of stored <-Justin
		//remember to override in student and teacher class adjusting for restrictions correctly <-Nicky
	}
	abstract void UI();

}