package Java_Advanced_Practice7;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private short age;
    private List<Book> books = new ArrayList<>();

    public Author(String name, short age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void addBook (Book book) {
        books.add(book);
    }
}
