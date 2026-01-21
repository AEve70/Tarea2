package Ejercicio4;
import Resources.IOManager;

public class LoweUpperCase {
    public static void main(String[] args){
        String phrase = IOManager.readString("Provide a phrase:");

        IOManager.print("Phrase in lowercase: "+ phrase.toLowerCase());
        IOManager.print("Phare in upeercase: " + phrase.toUpperCase());

    }
}
