import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Artur
 *
 */

public abstract class Borrower{
	public Borrower(){

	}
	/*
	 * storage for all the lines in the text file. each line is a new string
	 */
	public ArrayList<String> out = new ArrayList<String>();
	/*
	 * gets everything inside the text file and writes it to out
	 */
	public void reader() {
		try{
			FileReader fileReader = new FileReader("Books.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			boolean b = true;
			while(b){
				String temp = bufferedReader.readLine(); //saves current iteration into temp var
				if(temp.equals(null)){ //when reading empty line, temp var = null
					b = false; //prevent more looping
					break; //do not continue loop
				}
				out.add(temp); //if not null, or error, write to arraylist
			}
			bufferedReader.close(); //close importstream to prevent mem leak

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	abstract void catalogueEnter();
	abstract void availabilityCheck();
	abstract void checkOut();
}