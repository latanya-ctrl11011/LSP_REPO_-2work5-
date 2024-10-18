package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * Driver class to test the MapUtilities class.
 */
public class MapUtilitiesDriver {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        // example inputs
        map1.put("Alice", "Healthy");
        map1.put("Bob", "Happy");
        map1.put("Chuck", "Fine");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Bob", "Happy");
        map2.put("Chuck", "Fine");
        map2.put("David", "Great");

        System.out.println("Number of common key/value pairs is: " + MapUtilities.commonKeyValuePairs(map1, map2));
    }
}
//used chatgpt to understand how to use the hashmap class in this driver class.
