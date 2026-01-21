package Ejercicio6;
import Resources.IOManager;

public class CountVowels {
    public static void main(String[] args){
        int vowelsCount = 0;

        String phrase = IOManager.readString("Provide a phrase:");

        for(int i = 0; i < phrase.length(); i++){
            char letter = phrase.toLowerCase().charAt(i);   
            switch(letter){
                case 'a', 'e', 'i', 'o', 'u' -> vowelsCount++;
            }
        }

        IOManager.print("Number of vowels in the phrase: " + vowelsCount);
    }

    
}
