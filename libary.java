import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/*
public class libary{
    public static ArrayList<Book> lib = new ArrayList<Book>();
    public static ArrayList<String> fetch(){
      ArrayList<String> out = new ArrayList<String>();
      try{
        System.out.println("fetching file");
        FileReader fileReader = new FileReader("Books.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        boolean b = true;
        while(b){
          String temp = bufferedReader.readLine(); //saves current iteration into temp var
          if(temp==null){ //when reading empty line, temp var = null
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
    
    public static void populateLib(ArrayList<String> out){
      String book_name, author, category, status, isbn;
  for(int i=0;i<out.size()-1;i++){
    String current = out.get(i);
    isbn = current.substring(current.indexOf("ISBNID="), current.indexOf(" BookName="));
    book_name =current.substring(current.indexOf(" BookName="),current.indexOf(" Author="));
    author =current.substring(current.indexOf(" Author="),current.indexOf(" Category="));
    category =current.substring(current.indexOf(" Category="),current.indexOf(" Status="));
    status =current.substring(current.indexOf(" Status="));
    Book temp = new Book(isbn,book_name,author,category,status);
    lib.add(temp);
  }
  }
  }
  */
    