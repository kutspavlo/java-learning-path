package Java_Basic_Practice3;

import Java_Basic_Practice2.Person;

import java.util.Objects;
import java.util.concurrent.ExecutionException;

public class Book implements Cloneable {
    private String isbn;
    private String title;
    private Person author;
    private short pagesNumber;

    public Book(){

    }

    public Book(String title, Person author){
        this.setTitle(title);
        this.setAuthor(author);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setIsbn(String isbn) throws Exception {
        if (! isbn.startsWith("isbn")) throw new Exception("should start with 'isbn");
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

    public void setAuthor(Person author) {
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

}
