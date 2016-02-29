
/**
 * @author Artur
 *
 */
public class Teacher extends Borrower {
	public Teacher(String username){
		super(username);
	}

	@Override
	public void checkOut(Book in) {
		// TODO Auto-generated method stub <-Nicky&Justin
	}

	@Override
	void UI() {
		System.out.println("Successfully logged in");
		// TODO Auto-generated method stub <-Nicky
		//remember to only use scanner scnr, saves system resources and makes it better to close
	}
}