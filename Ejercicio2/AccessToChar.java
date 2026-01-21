package Ejercicio2;
import Resources.IOManager;

public class AccessToChar {
    public static void main(String[] args){
        
        String word = IOManager.readString("Provide a word:");

        IOManager.print("First character: " + word.charAt(0));
        
        IOManager.print("Last character: " + word.charAt(word.length() - 1));
    }
}
