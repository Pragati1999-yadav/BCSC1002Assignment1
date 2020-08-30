/* Created by IntelliJ IDEA.
 *  Author : Pragati Yadav(Pragati1999-yadav)
 *  Date : 30-08-2020
 *  Time : 01:23 PM
 *  File : Book.java
 */
package definitions;

import java.util.Objects;

import java.util.Scanner;

public class Book {
    // Components of a Definition Class
    // 1.private fields
    // 2.getters and setters for the private field
    // 3.Constructor (at least 1 or more) to initialize the private fields
    // 4.the toString() method
    // 5.the equals() and the hashCode() method
    private String nameOfBook;
    private String authorOfTheBook;
    // The ISBN number of book must be of 13 digit
    private String ISBNNumber;

    public Book(String nameOfBook, String authorOfTheBook, String ISBNNumber)
    {
        this.nameOfBook = nameOfBook;
        this.authorOfTheBook = authorOfTheBook;
        this.ISBNNumber = ISBNNumber;
    }
    public Book()

    {
        this.nameOfBook= new Scanner(System.in).next();
        this.authorOfTheBook=new Scanner(System.in).next();
        this.ISBNNumber=new Scanner(System.in).next();
    }
    // Creating the getter and setter methods for every variable
    public String getNameOfBook()
    {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook)
    {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthorOfTheBook()
    {
        return authorOfTheBook;
    }

    public void setAuthorOfTheBook(String authorOfTheBook)
    {
        this.authorOfTheBook = authorOfTheBook;
    }

    public String getISBNNumber()
    {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber)
    {
        this.ISBNNumber = ISBNNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", authorOfTheBook='" + authorOfTheBook + '\'' +
                ", ISBNNumber='" + ISBNNumber + '\'' +
                '}';
    }

    /**
     * This will allow the Student to issue the book.
     */
    public void doCheckout() {
        System.out.println("Thank you for Issue the book.");
    }

    /**
     * This will allow the Student to return the book.
     */
    public void doReturn() {
        System.out.println("Thank you for Return the book.");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameOfBook, book.nameOfBook) &&
                Objects.equals(authorOfTheBook, book.authorOfTheBook) &&
                Objects.equals(ISBNNumber, book.ISBNNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, authorOfTheBook, ISBNNumber);
    }
}


