package org.example.Maps;


import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> mapNumbers = new HashMap<>();
        mapNumbers.put(1, "One");
        mapNumbers.put(2, "Two");
        mapNumbers.put(3, "Three");
        mapNumbers.put(4, "Four");
        mapNumbers.put(5, "Five");

        HashMap<Integer, String> mapOodNumbers = new HashMap<>();
        mapOodNumbers.put(1, "Uno");
        mapOodNumbers.put(3, "Tre");
        mapOodNumbers.put(5, "Cinque");
        mapOodNumbers.put(7, "Sette");
        mapOodNumbers.put(9, "Nove");


        // stampo i valori delle key
        
        System.out.println("\nvalue of the key 5 : " + mapNumbers.get(5));
        System.out.println("value of the key 6 : " + mapNumbers.get(6)); //null
        System.out.println("value of the key 7 : " + mapNumbers.get(7));
        System.out.println("value of the key 8 : " + mapNumbers.get(8)); //null
        System.out.println("value of the key 9 : " + mapNumbers.get(9));

        // serve a vedere se c'è una mappatura per il valore allegato
        //System.out.println("value of 6key: " + mapNumbers.containsKey(6));


        if (!mapNumbers.containsKey(6)){
            System.out.println("\nNo associated value to this key");
        } else {
            System.out.println("\nAssociated value to this key");
        }

        if (!mapNumbers.containsKey(8)){
            System.out.println("\nNo associated value to this key");
        } else {
            System.out.println("\nAssociated value to this key");
        }


    }
}
