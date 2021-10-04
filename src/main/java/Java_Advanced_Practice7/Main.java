package Java_Advanced_Practice7;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Author[] authors = new Author[5];
        authors[0] = new Author("John", (short) 43);
        authors[1] = new Author("Jack", (short) 22);
        authors[2] = new Author("Silvia", (short) 50);
        authors[3] = new Author("Jessica", (short) 28);
        authors[4] = new Author("Andrew", (short) 33);

        Book[] books = new Book[5];
        books[0] = new Book("The Moon", 223);
        books[1] = new Book("The Sun", 214);
        books[2] = new Book("The Earth", 134);
        books[3] = new Book("The Star", 149);
        books[4] = new Book("The Ocean", 423);

        //2. Create two arrays: Author[] authors and
        //Book[] books. Their elements must use elements
        //from the neighboring array
        authors[0].addBook(books[0]);
        authors[0].addBook(books[1]);
        authors[1].addBook(books[1]);
        authors[2].addBook(books[2]);
        authors[2].addBook(books[3]);
        authors[3].addBook(books[3]);
        authors[4].addBook(books[4]);

        books[0].addAuthor(authors[0]);
        books[1].addAuthor(authors[0]);
        books[1].addAuthor(authors[1]);
        books[2].addAuthor(authors[2]);
        books[3].addAuthor(authors[2]);
        books[3].addAuthor(authors[3]);
        books[4].addAuthor(authors[4]);

        //check if some/all book(s) have more than 200 pages;
        Predicate<Book> isBigBook = (Book b)->b.getNumberOfPages()>200;
        boolean allIsBig = Arrays.stream(books).allMatch(isBigBook);
        System.out.println("All books is bigger than 200 pages: " + allIsBig);
        System.out.println("***************");
        Arrays.stream(books).filter(isBigBook).forEach(System.out::println);

    }
}
