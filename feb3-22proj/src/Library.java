/**
 * @author Artur
 *
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Library {
	protected static ArrayList<Book> lib = new ArrayList<Book>();
	protected static ArrayList<Borrower> users = new ArrayList<Borrower>(); 
	protected static Borrower currentUser;
	protected static Scanner scnr = new Scanner(System.in);
	public String name;

	public Library(String name) {
		this.name = name;
		launch(true);
	}
	
	@Override
	public String toString(){
		return name;
	}
	
	public static void launch(boolean firstStart){
		if(firstStart == false){
			populateUsers();
			populateLib(fetch());
		}
		getUser();
		currentUser.UI(); //TODO finish UI <-Nicky
		
		updateUsers();
		updateLib();
		System.exit(0);
	}
	
	private static void updateUsers() {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(".");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(fout);
		} catch (IOException e) {
			e.printStackTrace();
		}   
		for(Borrower temp: users){
			try {
				oos.writeObject(temp);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// TODO test this <-Artur
		
	}

	private static void populateUsers() {
		// TODO Auto-generated method stub <-Artur
		
	}

	private static void populateLib(ArrayList<String> out){
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

	private static void updateLib(){
		File directory = new File("Books.txt");
		try {
			FileWriter write = new FileWriter(directory);
			for(Book temp:lib){
				write.write(temp.toString());
			}
			write.close();
		} catch (IOException e) {
			System.out.println("could not write to normal file location, writing to random file name to attempt to preserve data");
			try {
				directory = new File("Backup.txt");
				FileWriter write = new FileWriter(directory);
				for(Book temp:lib){
					write.write(temp.toString());
				}
				write.close();
			} catch (IOException e1) {
				for(Book temp:lib){
					System.out.println(temp.toString());
				}
				System.out.println("data could not be saved, dumping contents into console");
				e1.printStackTrace();
			}
		}
	}
	
	/**
	 * Creates user specific instance
	 */
	private static void getUser(){
		System.out.println("Are you a Borrower(b) Or Librarian(l)");
		String a = scnr.next();
		if (a=="l"){
			//LIBIARIAN GOES HERE
		}
		else if(a=="b"){
		System.out.println("Sign in: 'i' %nSign up: 'u'");
		String in = scnr.next().toLowerCase();
		System.out.printf("Are you a teacher or a student? %n Student:'S', Teacher'T'");
		String type = scnr.next().toLowerCase();
		System.out.println("enter your username: (case sensitive)");
		String username =scnr.next();
		if(in.equals("u")){
			if(type.equals("s")){
				Student temp = new Student(username);
				users.add(temp);
				currentUser = temp;
				
			}else if(type.equals("t")){
				Teacher temp = new Teacher(username);
				users.add(temp);
				currentUser = temp;
			}

		}else if(in.equals("i")){
			boolean a1 = false;
			Borrower user = null;
			for(Borrower temp: users){
				if(temp.username.equals(username)){
					a1 = true;
					temp = user;
					break;
				}
			}
			if(a1){
				currentUser = user;
			}
		}else{
			System.out.printf("you have entered a username that does not exist, returning you to sign in/sign up screen");
			getUser();
		}
		}
		else {
			System.out.println("Are you a Borrower(b) Or Librarian(l)");
		}
		
	}

	/**
	 * fills out with input from Books.txt
	 */
	protected static ArrayList<String> fetch(){
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
