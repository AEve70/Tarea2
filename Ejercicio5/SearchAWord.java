package Ejercicio5;

import Resources.IOManager;

public class SearchAWord {
    public static void main(String [] args){

        String phrase = IOManager.readString("Provide a phrase");
        String word = IOManager.readString("Provide a word to search in the phrase:");

        IOManager.print((phrase.contains(word)) ?
        "The word is found in the phrase" : "The word is not found in the phrase");
    }
}
