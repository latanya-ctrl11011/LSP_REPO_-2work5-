package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;
import java.util.Map;

/**
 * Utility class for performing operations on HashMaps. 
 */
public class MapUtilities {
    /**
     * Counts the number of common key/value pairs between two HashMaps.
     *
     * @param map1 the first HashMap
     * @param map2 the second HashMap
     * @return the number of common key/value pairs
     */
	// used chat to assist with javadocs and used java documentation on website for implementing hashmaps
	
    public static int commonKeyValuePairs(
            HashMap<String, String> map1,
            HashMap<String, String> map2) {

        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey()) && map2.get(entry.getKey()).equals(entry.getValue())) {
                count++; // utilized chat for code help
            }
        }
        return count;
    }
}
