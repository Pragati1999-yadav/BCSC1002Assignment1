/* Created by IntelliJ IDEA.
 *  Author : Pragati Yadav
 *  Date : 30-08-2020
 *  Time : 01:35 PM
 *  File : Library.java
 */


package definitions;

import java.util.Arrays;

public class Library
{
    // Components of a Definition Class
    // 1.private fields
    // 2.getters and setters for the private field
    // 3.Constructor (at least 1 or more) to initialize the private fields
    // 4.the toString() method
    // 5.the equals() and the hashCode() method
    private Book[] availableBooks;

    public Library() {
        this.availableBooks = new Book[30];
         for (int i=0; i < availableBooks.length; i++) {

         }
        this.availableBooks[0] = new Book("Engineering Mathematics", "Chandrika Prasad", "9789386173522");
        this.availableBooks[1] = new Book("Electrical Engineering", "Ritu Sahdev", "9789386173492");
        this.availableBooks[2] = new Book("Mathematics", "R.D.Sharma", "5463538712854");
        this.availableBooks[3] = new Book("Software Engineering", "Rajiv Mall", "9788120348981");
        this.availableBooks[4] = new Book("English Grammar", "Wran&MArtin", "7845393498533");
        this.availableBooks[5] = new Book("Java Programming", "Herbert Schildt", "6574832187653");


    }
    public Book[] getAvailableBooks() {
        return availableBooks;
    }
    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "availableBooks=" + Arrays.toString(availableBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(availableBooks, library.availableBooks);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(availableBooks);
    }
    /**
     * Create the method, so any one is able to store the books in the Library.
     * @addBooks To store the book
     */

    public void addBooks(String bookName)
    {
        System.out.println(bookName + ",is added in the Library.");
    }
    /**
     * This method will allow us to issue the Books from the Library.
     */
    public void doCheckOut(String bookName)
    {
        System.out.println(bookName + ",is issued from the Library.");
    }
    /**
     * This method will allow us to return the Books in the Library.
     */
    public void doReturn(String bookName)
    {
        System.out.println(bookName + ",is returned in the Library.");
    }
    /**
     * This method will print all the elements of the Array.
     * We are using foreach loop to print the Array.
     */
    public void Bookslist() {
        for (Book bookObject : this.availableBooks) {
            System.out.println(bookObject);
        }
    }

}



