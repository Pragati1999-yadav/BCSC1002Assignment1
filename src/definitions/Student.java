/* Created by IntelliJ IDEA.
 *  Author : Pragati Yadav(Pragati1999-yadav)
 *  Date : 30-08-2020
 *  Time : 01:30 PM
 *  File : Student.java
 */


package definitions;


import java.util.Arrays;
import java.util.Objects;

public class Student
{
    // Components of a Definition Class
    // 1.private fields
    // 2.getters and setters for the private field
    // 3.Constructor (at least 1 or more) to initialize the private fields
    // 4.the toString() method
    // 5.the equals() and the hashCode() method
    private String firstName,middleName,LastName;
    private long rollNo;
    private int numberOfBooksIssued;
    private Book[] BooksIssued;

    public Student(String firstName, String middleName, String lastName, long rollNo, int numberOfBooksIssued) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.LastName = lastName;
        this.rollNo = rollNo;
        this.numberOfBooksIssued = numberOfBooksIssued;
    }
    public Student()
    {
        this.BooksIssued = new Book[25];
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }

    public String getLastName()
    {
        return LastName;
    }

    public void setLastName(String lastName)
    {
        LastName = lastName;
    }

    public long getRollNo()
    {
        return rollNo;
    }

    public void setRollNo(long rollNo)
    {
        this.rollNo = rollNo;
    }

    public int getNumberOfBooksIssued()
    {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued)
    {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }


    @Override
    public String toString()
    {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", rollNo=" + rollNo +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Student student = (Student) o;
        return rollNo == student.rollNo &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(middleName, student.middleName) &&
                Objects.equals(LastName, student.LastName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, middleName, LastName, rollNo, numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(BooksIssued);
        return result;
    }
}



