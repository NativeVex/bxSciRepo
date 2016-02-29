/**
 * @author Artur
 *
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static ArrayList<Book> lib = new ArrayList<Book>();
	public static ArrayList<Borrower> users = new ArrayList<Borrower>(); 

	public static void main(String[] args) {
		getUser();
		populateLib(fetch());
		//TODO make user interface here
		updateLib();

	}
	public static void populateLib(ArrayList<String> out){
		String book_name, author, category, status;
		long isbn;
		Date time_of_checkout = new Date();
		for(int i=0;i<out.size()-1;i++){
			String current = out.get(i);
			isbn = Integer.parseInt(current.substring(current.indexOf("ISBN ID ="), current.indexOf(" Book Name =")));
			book_name =current.substring(current.indexOf(" Book Name ="),current.indexOf(" Author ="));
			author =current.substring(current.indexOf(" Author ="),current.indexOf(" Category ="));
			category =current.substring(current.indexOf(" Category ="),current.indexOf(" Status ="));
			status =current.substring(current.indexOf(" Status ="),current.indexOf(" Time of most recent checkout"));
			time_of_checkout.setTime(Long.parseLong(current.substring(current.indexOf(" Time of most recent checkout"),current.length())));
			Book temp = new Book(isbn,book_name,author,category,status);
			temp.setTime_of_checkout(time_of_checkout);
			lib.add(temp);
		}
	}

	public static void updateLib(){
		//TODO write out arraylist to books.txt
		//mad work
		//warn user if could not save
	}
	/**
	 * Creates user specific instance
	 */
	public static void getUser(){
		Scanner scnr = new Scanner(System.in);
		System.out.println("Sign in: 'i' %nSign up: 'u'");
		if(scnr.next().toLowerCase().equals("u")){
			
		}
		System.out.printf("Are you a teacher or a student? %n Student:'S', Teacher'T'");
		String inputtedname ="";
		if(scnr.next().toLowerCase().equals("s")){
			System.out.println("enter your username: (case sensitive)");
			inputtedname = scnr.next();
			for(Borrower temp: users){
				if(temp.username.equals(inputtedname)){
					//TODO
				}else{
					System.out.println("you have entered a username that does not exist, perhaps you're trying to make a new account?");
				}
			}
		}
	}

	/**
	 * fills out with input from Books.txt
	 */
	public static ArrayList<String> fetch(){
		ArrayList<String> out = new ArrayList<String>();
		try{
			System.out.println("fetching file");
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
			e.printStackTrace();
			System.out.println("failed to fetch file");
		}
		return out;

	}
}
