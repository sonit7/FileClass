import java.io.*;
import java.util.Scanner;
public class FileHandling{
  File myFile;
  FileWriter myWriter;
  String name;
  
  public FileHandling(String n){
    name = n;
    myFile = new File(name);
  }
  
  public void create(){
    try{
      if(myFile.createNewFile()){
        System.out.println("Success in making file");
      }
      else{
        System.out.println("File with same name exists");
      }
    }
    catch(IOException e){
      System.out.println("Something went wrong");
      e.printStackTrace();
    }
  }
  
  public void write(String text){
    try{
      myWriter = new FileWriter(myFile);
      myWriter.write(text);
      myWriter.close();
      System.out.println("Success in writing on the file");
    }
    catch(IOException e){
      System.out.println("Something went wrong");
      e.printStackTrace();
    }
  }
  
  public void read(){
    try{
      Scanner reader = new Scanner(myFile);
      while(reader.hasNextLine()){
        String data = reader.nextLine();
        System.out.println(data);
      }
      reader.close();
    }
    catch(FileNotFoundException e){
      System.out.println("Something went wrong");
      e.printStackTrace();
    }
  }
  
  public void delete(){
    if(myFile.delete()){
      System.out.println("Success. The file has been deleted");
    }
    else{
      System.out.println("The file is already deleted or doesn't exist");
    }
  }
  
  public static void main(String[] args){
    //add code here to run
  }
}
