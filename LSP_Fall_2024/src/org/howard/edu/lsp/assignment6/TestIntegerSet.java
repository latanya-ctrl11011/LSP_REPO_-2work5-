package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

public class TestIntegerSet {
	private IntegerSetTest set;

    @BeforeEach
    public void setup() {
        set = new IntegerSetTest();
    }

    @Test
    @DisplayName("Test largest method on a non-empty set")
    public void testLargest() {
        set.add(3);
        set.add(10);
        set.add(7);
        assertEquals(10, set.largest(), "The largest element should be 10");
    }

    @Test
    @DisplayName("Test largest method throws exception on empty set")
    public void testLargestException() {
        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            set.largest();
        });
        assertEquals("Cannot find largest in an empty set.", exception.getMessage());
    }

    @Test
    @DisplayName("Test smallest method on a non-empty set")
    public void testSmallest() {
        set.add(3);
        set.add(10);
        set.add(7);
        assertEquals(3, set.smallest(), "The smallest element should be 3");
    }

    @Test
    @DisplayName("Test smallest method throws exception on empty set")
    public void testSmallestException() {
        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            set.smallest();
        });
        assertEquals("Cannot find smallest in an empty set.", exception.getMessage());
    }
    
    @Test
    @DisplayName("Test equals method with equal sets")
    public void testEquals() {
        IntegerSetTest otherSet = new IntegerSetTest();
        set.add(1);
        set.add(2);
        otherSet.add(2);
        otherSet.add(1);
        assertTrue(set.equals(otherSet), "Sets with the same elements should be equal");
    }

    @Test
    @DisplayName("Test equals method with non-equal sets")
    public void testNotEquals() {
        IntegerSetTest otherSet = new IntegerSetTest();
        set.add(1);
        set.add(2);
        otherSet.add(3);
        assertFalse(set.equals(otherSet), "Sets with different elements should not be equal");
    }
    
    // Add more test cases for each public method as needed
}
