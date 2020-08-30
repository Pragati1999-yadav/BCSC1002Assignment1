/* Created by IntelliJ IDEA.
 *  Author : Pragati Yadav(Pragati1999-yadav)
 *  Date : 30-08-2020
 *  Time : 01:38 PM
 *  File : FrontDesk.java
 */


package Execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {

    public static final int Issue_Book = 2;
    public static final int Return_Previously_Issued_Book = 3;
    public static final int Show_All_Issued_Books = 4;
    public static final int Exit = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Library libraryObject = new Library();
        Student studentObject = new Student();
        System.out.println(" Enter your First name");
        String firstname = scanner.next();
        System.out.println("Enter your Middle name:");
        String middlename = scanner.next();
        System.out.println("Enter your Last name:");
        String lastname = scanner.next();
        System.out.println("Enter your University Roll Number:");
        Long rollNumber = scanner.nextLong();

        scanner.nextLine();

        System.out.println("-=-=--=-=-\"Welcome," + firstname + ",To The Front Desk\"-=-=--=-=-");
        System.out.println("How may I help you today?");
        System.out.println("1. Issue a new book for me.");
        System.out.println("2. Return a previously issues book for me.");
        System.out.println("3. Show me all my issues books.");
        System.out.println("4. Exit.");
        System.out.println("ENTER YOUR CHOICE FROM: [1,2,3,4]");


        int choice = scanner.nextInt();
        String bookName;
        int booksIssued;
        if (choice <= 4) {

            switch (choice) {
                case Issue_Book:
                    System.out.println("Enter the Book name you want to issue:");
                    bookName = scanner.nextLine();
                    scanner.nextLine();
                    libraryObject.doCheckOut(bookName);
                    break;
                case Return_Previously_Issued_Book:
                    System.out.println("Enter the book name you want to return:");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    libraryObject.doReturn(bookName);
                    break;
                case Show_All_Issued_Books:
//                System.out.println("ENTER THE NUMBER OF BOOKS ISSUED");
//                booksIssued = scannerObject.nextInt();
                    studentObject.getNumberOfBooksIssued();
                    break;
                case Exit:
                    break;
            }
        } else {
            System.out.println("Please input the correct digit");
        }
        scanner.close();
    }
}






