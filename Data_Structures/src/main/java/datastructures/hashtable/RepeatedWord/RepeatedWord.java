package datastructures.hashtable.RepeatedWord;

import datastructures.hashtable.HashTable;

public class RepeatedWord {
    public static String firstRepeatedWord(String lengthyString){

        if (lengthyString == null || lengthyString.isEmpty()){
            return "Input string is either null or has less than 2 words";
        }

        String[] words = lengthyString.toLowerCase().split(" ");
        HashTable wordsTable = new HashTable();
        for (String word: words){
            word = word.replaceAll(",$", "");
            if (wordsTable.contains(word)){
                return word;
            }
            wordsTable.add(word, 1);
        }
        return "No duplicates";
    }
}
