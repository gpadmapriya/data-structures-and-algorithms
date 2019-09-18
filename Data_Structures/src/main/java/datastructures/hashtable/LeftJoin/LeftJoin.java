package datastructures.hashtable.LeftJoin;

import datastructures.hashtable.HashTable;
import datastructures.hashtable.Node;

import java.util.List;

public class LeftJoin {
    public static HashTable leftJoin(HashTable synonyms, HashTable antonyms){

        HashTable definitions = new HashTable(4);
        for (int i = 0; i < synonyms.getTable().length; i++) {
            Node[] list = synonyms.getTable();

            Node current = list[i];

            if (current != null) {
                if (antonyms.contains(current.key)) {
                    definitions.add(current.key, String.format("%s,%s", current.value, antonyms.get(current.key)));
                } else {
                    definitions.add(current.key, String.format("%s,%s", current.value, null));
                }
            }
        }
        definitions.dump();
        return definitions;
    }

    public static void main(String[] args){
        HashTable synonyms = new HashTable();


        HashTable antonyms = new HashTable();

        HashTable newTable = LeftJoin.leftJoin(synonyms, antonyms);
        System.out.println(newTable.get("fond"));

    }

}
