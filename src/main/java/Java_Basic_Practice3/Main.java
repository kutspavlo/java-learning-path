package Java_Basic_Practice3;

import Java_Basic_Practice2.Person;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws Exception {
//        Book myBook = new Book();
//        try {
//            myBook.setIsbn("isbn223873");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(myBook.getIsbn());
//
        Person hemingway = new Person();
//
//        Book anotherBook = new Book("Old man and sea", hemingway);
//        System.out.println(anotherBook.getTitle());
//
//
//        myBook.setTitle("Old man and sea");
//        try {
//            anotherBook.setIsbn("isbn223873");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(myBook.equals(anotherBook));
//
//        System.out.println(anotherBook.hashCode());
//        System.out.println(myBook.hashCode());
//        myBook.setAuthor(hemingway);
//        System.out.println(myBook);
//
//        Book clone = (Book) myBook.clone();
//        System.out.println(clone.getIsbn());
//
//        ElectronicBook eBook = new ElectronicBook("Man of War", hemingway, 45354436L);
//        try {
//            eBook.setSizeInBytes(5234234L);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(eBook.getSizeInBytes());
//
//        try {
//            eBook.setFormat("pb2");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(eBook.getFormat());
//
//        ElectronicBook eBook2;
//        eBook2 = eBook;
//        System.out.println(eBook.equals(eBook2)); // equals() method overriden in child class ElectronicBook;
//        Book myBook2 = new Book();
//
//        Object[] books = {myBook, myBook2, eBook, eBook2};
//        System.out.println(books[0].getClass());
//        myBook = eBook;
//        try {
//            eBook2 = (ElectronicBook) myBook2;
//        } catch (Exception e) {
//            System.out.println("Cannot cast this book book to electronic one due to " + e);
//        }
//
//        System.out.println(books[0].getClass());

        ElectronicBook eBook = new ElectronicBook("The Sky", 323523);
        eBook.getBookRanking();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String text = "This is chapter 1 of the book";
        byte[] buffer = text.getBytes();
        try {
            out.write(buffer);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        eBook.print(out);

        File myFile = new File("src/main/java/Java_Basic_Practice3/sample.txt");

        FileOutputStream fileOut = new FileOutputStream(myFile);

        eBook.print(fileOut);

        Book.TableOfContent contTable = eBook.new TableOfContent();
        contTable.setBookStructure("simple book");
        System.out.println(contTable.getBookStructure());

        ElectronicBook eBookNew = new ElectronicBook("New one", 412412412);
        Book.BookAuthor twen = new Book.BookAuthor();
        twen.setFirstName("Mark");
        twen.setLastName("Twen");
        System.out.println(twen.getFullName());
        eBookNew.setAuthor(twen);
        System.out.println(eBookNew.getAuthor().getFullName());

        eBook.setIsbn("isbn:3333333333");
        eBookNew.setIsbn("isbn:2222222222");

        Book[] bookArr = {eBook, eBookNew};

        Arrays.sort(bookArr, new Book.sortByISBN());
        System.out.println(bookArr[0].getIsbn());

        eBook.setTitle("BBBBBBBBB");
        eBookNew.setTitle("AAAAAAAAA");
        Arrays.sort(bookArr, new Book.sortByTitle());
        System.out.println(bookArr[0].getTitle());


    }
}
