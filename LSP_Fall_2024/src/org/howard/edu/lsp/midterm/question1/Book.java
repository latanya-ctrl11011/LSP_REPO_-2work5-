package org.howard.edu.lsp.midterm.question1;

/**
 * Represents books in a library.
 */
public class Book {
    // Private attributes for encapsulation
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * creates a new book object with the title, author, ISBN, and year published.
     *
     * @param title          The title of the book.
     * @param author         The author of the book.
     * @param ISBN           The ISBN number of the book (a unique identifier).
     * @param yearPublished  The year the book was published.
     */
    
    //used chatgpt to assist in creating javadocs for proper documentation and better code structure
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // defining the getters and setters stated in the problem

    /** 
     * Returns the title of the book.
     * @return the title of the book.
     */
    public String getTitle() { return title; }

    /** 
     * Sets the title of the book.
     * @param title The title of the book.
     */
    public void setTitle(String title) { this.title = title; }

    /** 
     * Returns the author of the book.
     * @return the author of the book.
     */
    public String getAuthor() { return author; }

    /** 
     * Sets the author of the book.
     * @param author The author of the book.
     */
    public void setAuthor(String author) { this.author = author; }

    /** 
     * Returns the ISBN of the book.
     * @return the ISBN of the book.
     */
    public String getISBN() { return ISBN; }

    /** 
     * Sets the ISBN of the book.
     * @param ISBN The ISBN of the book.
     */
    public void setISBN(String ISBN) { this.ISBN = ISBN; }

    /** 
     * Returns the year the book was published.
     * @return the year published.
     */
    public int getYearPublished() { return yearPublished; }

    /** 
     * Sets the year the book was published.
     * @param yearPublished The year published.
     */
    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }

    /**
     * Checks if two Book objects are equal based on ISBN and author.
     *
     * @param obj The object to compare with this Book.
     * @return true if the books are equal; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return author.equals(book.author) && ISBN.equals(book.ISBN);
    }

    /**
     * Returns a string representation of the Book object.
     *
     * @return A string containing the title, author, ISBN, and year published.
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}

