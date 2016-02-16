/**
 * @author Artur
 *
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter if you are a teacher or a student");
		String in = scnr.next();
		if(in.equals("student")){
			//Student pokemon = new Book();
		}
		else if(in.equals("teacher")){
			//Teacher qiu = new Teacher();
		}
		else{
			System.out.println("You entered an invalid statement. Please re-enter your occupation");
			//bug here, no program continuation
		}
		scnr.close();
		//creates student or teacher object depending on user input
	}

}
