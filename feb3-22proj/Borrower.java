import java.util.ArrayList;

/**
 * @author Artur
 *
 */

public abstract class Borrower{
	public Borrower(){
		//TODO student id verification? 
	}
	
	/**
	 * The books the individual has in their possession
	 */
	public ArrayList<String> books_has = new ArrayList<String>();
	
	/**
	 * Adds book to out arraylist
	 * @param book
	 */
	public void catalogueEnter(Book book){ //who keeps making stuff abstract cause they lazy?!
		Main.lib.add(book); //it's not even hard m8
	}
	
	/**
	 * Gets if book is available within Main.out
	 * @param name
	 * @return
	 */
	public boolean availabilityCheck(String name){ //seriously who made this abstract
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
		//check if limit is reached, & change status of book in out arraylist & add book to arraylist of stored
		//remember to override in student and teacher class adjusting for restrictions correctly
	}
}