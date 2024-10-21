package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents an IntegerSet, which is a collection of unique integer values.
 * It implements basic set operations like adding, removing, checking elements, 
 * and performing set operations like union, intersection, difference, and complement.
 * 
 * @author Latanya
 */

public class IntegerSet  {
	// Store the set elements in an ArrayList.
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	/**
	 * Creates an empty IntegerSet.
	 */
	public IntegerSet() {
	}

	// Constructor if you want to pass in already initialized
	/**
	 * Creates an IntegerSet from an existing ArrayList of integers.
	 * 
	 * @param set An ArrayList containing integer values.
	 * @throws IllegalArgumentException if the input list contains duplicates.
	 */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	// Clears the internal representation of the set. 5 pts.
	/**
	 * Removes all elements from the set.
	 */
public void clear() {
	set.clear();
}

// Returns the length of the set. 5 pts.
/**
 * Returns the number of elements in the set.
 * 
 * @return The size (number of elements) of the set.
 */
public int length() {
	return set.size();
}; // returns the length

/*
              * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
 * the equal method from the Object class. 10 pts.
*/
@Override
public boolean equals(Object o) {
	// checks if the object passed is an instance of IntegerSet
    if (o instanceof IntegerSet) {
        IntegerSet otherSet = (IntegerSet) o;
        
        // Check if the sets have the same size
        if (this.length() != otherSet.length()) {
            return false;
        }
        
        // Check if both sets contain the same elements
        for (int element : this.set) {
            if (!otherSet.set.contains(element)) {
                return false;
            }
        }
        return true;
    }
    return false; // If the object is not an IntegerSet, return false
}; 

// Returns true if the set contains the value, otherwise false. 5 pts.
/**
 * Checks if the set contains a specific integer value.
 * 
 * @param value The integer value to be searched for.
 * @return true if the value is present in the set, false otherwise.
 */
public boolean contains(int value) {
	return set.contains(value);
};    
// Returns the largest item in the set. 5 pts.
/**
 * Returns the largest element in the set.
 * 
 * @throws java.util.NoSuchElementException if the set is empty.
 * @return The largest integer value in the set.
 */
public int largest()  {
	if (set.isEmpty()) {
        throw new IllegalStateException("The set is empty.");
    }

    int largest = set.get(0);  // Assume the first element is the largest
    for (int num : set) {
        if (num > largest) {
            largest = num;  // Update largest if a bigger number is found
        }
    }
    return largest;
}; 

// Returns the smallest item in the set. 5 pts.
/**
 * Returns the smallest element in the set.
 *
 * @throws java.util.NoSuchElementException if the set is empty.
 * @return The smallest integer value in the set.
 */
public int smallest()  {
	if (set.isEmpty()) {
        throw new IllegalStateException("The set is empty.");
    }

    int smallest = set.get(0);  // Assume the first element is the smallest
    for (int num : set) {
        if (num < smallest) {
            smallest = num;  // Update smallest if a smaller number is found
        }
    }
    return smallest;
};

// Adds an item to the set or does nothing it already there. 5 pts.
/**
 * Adds an item to the set or does nothing if it already exists in the set.
 * 
 * @param item The integer value to be added to the set.
 */
public void add(int item) {
	if (!set.contains(item)) {
        set.add(item);
    }
}; // adds item to the set or does nothing if it is in set

	// Removes an item from the set or does nothing if not there. 5 pts.
/**
 * Removes a specific integer value from the set if it exists.
 *
 * @param item The integer value to be removed from the set.
 */
public void remove(int item) {
	set.remove(Integer.valueOf(item));
};

// Set union. 11 pts.
/**
 * Calculates the union of the current set and the provided set (intSetb).
 * The union includes all elements that are present in either set.
 * Modifies the current set by adding elements from intSetb that are not already present.
 *
 * @param intSetb The set to be used for calculating the union.
 */
public void union(IntegerSet intSetb) {
	for (int element : intSetb.set) {
        this.add(element); // Use the add method to ensure no duplicates
    }
};

// Set intersection, all elements in s1 and s2. 12 pts.
/**
 * Calculates the intersection of the current set and the provided set (intSetb).
 * The intersection includes elements that are present in both sets.
 * Modifies the current set to contain only the intersection elements.
 *
 * @param intSetb The set to be used for calculating the intersection.
 */
public void intersect(IntegerSet intSetb) {
    List<Integer> intersection = new ArrayList<>();
    for (int element : this.set) {
        if (intSetb.contains(element)) {
            intersection.add(element);
        }
    }

    this.set.clear();
    this.set.addAll(intersection);
}; 

// Set difference, i.e., s1 –s2. 12 pts.
/**
 * Calculates the set difference of the current set (s1) and the provided set (intSetb) (s2).
 * The difference includes elements present in s1 but not in s2.
 * Modifies the current set by removing elements that are also present in intSetb.
 * 
 * @param intSetb The set to be used for calculating the difference.
 */
public void diff(IntegerSet intSetb) {
	List<Integer> toRemove = new ArrayList<>();

    // Iterate through the current set (s1)
    for (Integer element : set) {
        // If the element is also in intSetb, add it to the toRemove list
        if (intSetb.contains(element)) {
            toRemove.add(element);
        }
    }

    set.removeAll(toRemove);
} // set difference, i.e. s1 - s2

// Set complement, all elements not in s1. 11 pts.
/**
 * Calculates the complement of the current set with respect to the provided set (intSetb).
 * The complement includes all elements in intSetb that are not present in the current set.
 * Modifies the current set by adding these elements.
 * 
 * @param intSetb The set to be used for calculating the complement.
 */
public void complement(IntegerSet intSetb) {
	for (Integer element : intSetb.set) {
        // If the element is not in the current set (s1), add it
        if (!set.contains(element)) {
            set.add(element);
        }
    }
}

// Returns true if the set is empty, false otherwise. 5 pts.
boolean isEmpty() {
	return set.isEmpty();
}; 

// Return String representation of your set.  This overrides the equal method from 
// the Object class. 5 pts.
public String toString() {
	StringBuilder sb = new StringBuilder();
    sb.append("[");

    for (Integer element : set) {
        sb.append(element).append(", ");
    }

    if (!set.isEmpty()) {
        sb.delete(sb.length() - 2, sb.length()); // Remove the last ", "
    }

    sb.append("]");
    return sb.toString();
};	// return String representation of your set
}

