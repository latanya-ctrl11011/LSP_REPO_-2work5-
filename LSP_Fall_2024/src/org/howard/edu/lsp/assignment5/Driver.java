package org.howard.edu.lsp.assignment5;


/**
 * This class serves as a driver program for the IntegerSet class.
 * It demonstrates how to create IntegerSet objects, add elements, 
 * and perform various set operations like union.
 */
public class Driver {
    public static void main(String[] args) {
        // Create a new IntegerSet
        IntegerSet set1 = new IntegerSet();

        // Add elements to the set
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Print the set, smallest, and largest elements
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());


        // Create another IntegerSet   

        IntegerSet set2 = new IntegerSet();

        // Add elements to the second set
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Perform set operations and print results
        System.out.println("Union of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString()); 

    }
}

