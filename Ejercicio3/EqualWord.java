package Ejercicio3;
import Resources.IOManager;
public class EqualWord{
    public static void main(String[] args){

        String word1 = IOManager.readString("Provide the first word:");
        String word2 = "" + IOManager.readString("Provide the second word:");

        IOManager.print((word1.equalsIgnoreCase(word2)) ? 
        "The words are equal" : "The words are different");
    }

}