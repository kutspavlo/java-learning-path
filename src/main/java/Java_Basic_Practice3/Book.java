package Java_Basic_Practice3;

import Java_Basic_Practice2.Person;

import java.util.Comparator;
import java.util.Objects;

public abstract class Book implements Cloneable, Printable{

    //        1. Create a Book class and then:
//        Add fields: String isbn, String title, String text, Person author, short pagesNumber;
//        Make the fields private;
//        Add getters and setters with validation;
//        Add constructors which use the setters;
//        Override equals, hashCode, toString, clone methods. Last one should be public

    private String isbn;
    private String title;
    private BookAuthor author;
    private short pagesNumber;

    public Book(){
    }

    public Book(String title){
        this.setTitle(title);
    }

//    "7. Add an inner class TableOfContents which encapsulates information
//    about chapters and book structure"

    public class TableOfContent {
        private String[] chapters;
        private String bookStructure;

        public void setChapters(String[] chapters) {
            this.chapters = chapters;
        }

        public void setBookStructure(String bookStructure) {
            this.bookStructure = bookStructure;
        }

        public String getBookStructure() {
            return bookStructure;
        }

        public String[] getChapters() {
            return chapters;
        }
    }

//    "8. Add a nested class BookAuthor which encapsulates information about
//    the author and extends the Person class. Change the author field type
//    to BookAuthor. Think why TableOfContents should be inner but
//    BookAuthor is nested"

    public static class BookAuthor extends Person{
        private String publishingHouse;

        public void setPublishingHouse(String publishingHouse) {
            this.publishingHouse = publishingHouse;
        }

        public String getPublishingHouse() {
            return publishingHouse;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    5. Make the Book class abstract and add few abstract methods to it

    public abstract void getAuthorCredentials();

    public abstract void getBookRanking();

    public String getTitle() {
        return title;
    }

    public void setIsbn(String isbn) throws Exception {
        if (! isbn.startsWith("isbn")) throw new Exception("should start with isbn");
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Book other = (Book) obj;
        if (!isbn.equals(other.isbn))
            return false;
        return title.equals(other.title);
    }

    @Override
    public String toString() {
        return String.format(isbn.substring(0,4) + ":" + isbn.substring(4) + " " + this.title);
    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can’t happen
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setAuthor(BookAuthor author) {
        this.author = author;
    }

    public Person getAuthor() {
        return author;
    }

    public void setPagesNumber(short pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public short getPagesNumber() {
        return pagesNumber;
    }


//    "9. Sort the array from task 3 using the method Arrays.sort with a comparator.
//    Create few local/anonymous classes which implement Comparator interface.
//    So you’ll create few different rules for sorting"

    static class sortByISBN implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getIsbn().compareTo(o2.getIsbn());
        }
    }

    static class sortByTitle implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
}
