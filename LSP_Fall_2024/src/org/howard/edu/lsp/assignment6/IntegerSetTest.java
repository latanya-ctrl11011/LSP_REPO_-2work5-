package org.howard.edu.lsp.assignment6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This class represents an IntegerSet, which is a collection of unique integer values.
 * It implements basic set operations like adding, removing, checking elements, 
 * and performing set operations like union, intersection, difference, and complement.
 */

public class IntegerSetTest  {
    private List<Integer> set = new ArrayList<Integer>();

    // Default Constructor
    public IntegerSetTest() {}

    // Constructor with duplicate check
    public IntegerSetTest(ArrayList<Integer> set) {
        if (hasDuplicates(set)) {
            throw new IllegalArgumentException("Input list contains duplicates.");
        }
        this.set = set;
    }

    private boolean hasDuplicates(List<Integer> list) {
        return list.size() != new ArrayList<>(new HashSet<>(list)).size();
    }

    public void clear() {
        set.clear();
    }

    public int length() {
        return set.size();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof IntegerSetTest) {
            IntegerSetTest otherSet = (IntegerSetTest) o;
            if (this.length() != otherSet.length()) return false;
            for (int element : this.set) {
                if (!otherSet.set.contains(element)) return false;
            }
            return true;
        }
        return false;
    }

    public boolean contains(int value) {
        return set.contains(value);
    }

    // Exception handling added for largest()
    public int largest() {
        // If the set is empty, throw an exception
        if (set.isEmpty()) {
            throw new NoSuchElementException("Cannot find largest in an empty set.");
        }

        int largest = set.get(0);
        for (int num : set) {
            if (num > largest) largest = num;
        }
        return largest;
    }

    // Exception handling added for smallest()
    public int smallest() {
        // If the set is empty, throw an exception
        if (set.isEmpty()) {
            throw new NoSuchElementException("Cannot find smallest in an empty set.");
        }

        int smallest = set.get(0);
        for (int num : set) {
            if (num < smallest) smallest = num;
        }
        return smallest;
    }

    public void add(int item) {
        if (!set.contains(item)) set.add(item);
    }

    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    public void union(IntegerSetTest intSetb) {
        for (int element : intSetb.set) {
            this.add(element);
        }
    }

    public void intersect(IntegerSetTest intSetb) {
        List<Integer> intersection = new ArrayList<>();
        for (int element : this.set) {
            if (intSetb.contains(element)) intersection.add(element);
        }
        this.set.clear();
        this.set.addAll(intersection);
    }

    public void diff(IntegerSetTest intSetb) {
        List<Integer> toRemove = new ArrayList<>();
        for (Integer element : set) {
            if (intSetb.contains(element)) toRemove.add(element);
        }
        set.removeAll(toRemove);
    }

    public void complement(IntegerSetTest intSetb) {
        List<Integer> complementSet = new ArrayList<>();
        for (Integer element : intSetb.set) {
            if (!this.set.contains(element)) {
                complementSet.add(element);
            }
        }
        this.set.clear();
        this.set.addAll(complementSet);
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Integer element : set) sb.append(element).append(", ");
        if (!set.isEmpty()) sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }
}