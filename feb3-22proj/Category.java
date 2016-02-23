//tried my best...By Justin :)
import java.util.Scanner();
public ArrayList<String> Category {
  ArrayList<String>fullList= new ArrayList<String>;
  Scanner bob = new Scanner();
  System.out.print("Enter the category of books that you would like to see:");
  String pokemon = bob.next().toLowerCase();
  String gundam = "Books.txt"
  ArrayList<String> catalogue = fetch(gundam);
  for(int i=0; i<catalogue.size(); i++){
    String line = catalogue.get(i);
    String[] s1 = line.split(" ");
    for(String s : s1){
        if(pokemon.equals(s)){
          fullList.add(line);
        }
        else
          break;//is this the correct way?
    }
  }
  return fullList;
}
  