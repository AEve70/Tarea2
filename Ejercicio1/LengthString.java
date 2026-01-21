package Ejercicio1;
import Resources.IOManager;

public class LengthString{
   public static void main(String[] args){
   
      String phrase = IOManager.readString("Provide any phrase");

        IOManager.print("Length of the phrase: " + phrase.length());
   }
}