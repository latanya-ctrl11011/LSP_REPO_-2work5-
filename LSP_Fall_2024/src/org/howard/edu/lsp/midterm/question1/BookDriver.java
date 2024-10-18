package org.howard.edu.lsp.midterm.question1;

/**
 * Driver class to demonstrate the functionality of the book class.
 */
public class BookDriver {
    public static void main(String[] args) {
        // creating sample book instances
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        // Test equals method
        System.out.println(book1.equals(book2)); // Output: true
        System.out.println(book1.equals(book3)); // Output: false

        // Test toString method
        System.out.println(book1); // Output: Title: The Great Gatsby, Author: F. Scott Fitzgerald, ISBN: 123456789, Year Published: 1925
    }
}
// used chatgpt to help construct driver class
