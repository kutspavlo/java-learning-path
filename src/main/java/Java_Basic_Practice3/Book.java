package Java_Basic_Practice3;

import Java_Basic_Practice2.Person;

import java.util.concurrent.ExecutionException;

public class Book {
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
