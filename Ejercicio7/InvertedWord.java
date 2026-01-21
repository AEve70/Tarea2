package Ejercicio7;
import Resources.IOManager;
public class InvertedWord {
    public static void main(String [] args){
        String word = IOManager.readString("Provide a word: ");
        String invertedWord ="";

        for(int i = word.length() -1; i >=0; i--){
            invertedWord += word.toLowerCase().charAt(i);
        }

        IOManager.print("Inverted word: " + invertedWord);
    }
}
