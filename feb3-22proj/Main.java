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
  System.out.println("Please enter if you are a teacher or a student");
  String in = scnr.next().toLowerCase();
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

 /**
  * fills out with input from Books.txt
  */
 public static ArrayList<String> fetch(String max){
  ArrayList<String> out = new ArrayList<String>();
  try{
   System.out.println("fetching file");
   FileReader fileReader = new FileReader(max);
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
   System.out.println("failed to fetch file");
  }
  return out;

 }
}
