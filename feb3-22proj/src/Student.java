/**
 * @author Artur
 *
 */
public class Student extends Borrower {
	public Student(String username){
		super(username);
	}

	@Override
	public void checkOut(Book in) {
		// TODO Auto-generated method stub <-Nicky&Justin
		//cannot complete until borrower completed <-Nicky

	}

	@Override
	void UI() {
		System.out.println("Successfully logged in");
		// TODO Auto-generated method stub <-Nicky
		//remember to only use scanner scnr, saves system resources and makes it better to close
		
	}
}