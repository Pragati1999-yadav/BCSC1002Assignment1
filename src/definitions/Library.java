/* Created by IntelliJ IDEA.
 *  Author : Pragati Yadav(Pragati1999-yadav)
 *  Date : 30-08-2020
 *  Time : 07:30 PM
 *  File : Library.java
 */

package definitions;

import java.util.Arrays;


        // Components of a Definition Class
        // 1.private fields
        // 2.getters and setters for the private field
        // 3.Constructor (at least 1 or more) to initialize the private fields
        // 4.the toString() method
        // 5.the equals() and the hashCode() method
        public class Library {
            private Book[] availableBooks;

            // Create the Constructors
            public Library() {
                this.availableBooks = new Book[20];

                this.availableBooks[0] = new Book("Engineering Mathematics", "Reena Garg", "9789386173522");
                this.availableBooks[1] = new Book("Electrical Engineering", "Ritu Sahdev", "9789386173492");
                this.availableBooks[2] = new Book("Java a Beginners Guide", "Herbert Schildt", " 9781260440225");
                this.availableBooks[3] = new Book("English Grammar", "Wren & Martin", "8573059429384");
                this.availableBooks[4] = new Book("Software Engineering", "Rajib Mall", "9788120348981");
                this.availableBooks[5] = new Book("Rich Dad Poor Dad", "Robert T.Kiyosaki", "6758303849038");
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
            public void addBooks(String bookName) {
                System.out.println(bookName + ",is added in the Library.");
            }
            public void doCheckOut(String bookName) {
                System.out.println(bookName + ",is issued from the Library.");
            }
            public void doReturn(String bookName) {
                System.out.println(bookName + ",is Return in the Library.");
            }
        }



