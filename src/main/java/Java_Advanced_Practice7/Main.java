package Java_Advanced_Practice7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

        //find the books with max and min number of pages;
        Comparator<Book> bySize = Comparator.comparing(Book::getNumberOfPages);
        Book maxBook = Arrays.stream(books).max(bySize).get();
        System.out.println("****************");
        System.out.printf("Book with max number of pages is '%s', pages: %d%n", maxBook.getTitle(), maxBook.getNumberOfPages());

        Book minBook = Arrays.stream(books).min(bySize).get();
        System.out.printf("Book with min number of pages is '%s', pages: %d%n", minBook.getTitle(), minBook.getNumberOfPages());

        //filter books with only single author;
        System.out.println("****************");
        Predicate<Book> hasOneAuthor = (Book b)->b.getAuthors().size()==1;
        Arrays.stream(books).filter(hasOneAuthor).forEach(System.out::println);

        //sort the books by number of pages/title;
        System.out.println("****************");
        Arrays.stream(books).
                sorted(Comparator.comparingInt(Book::getNumberOfPages)).
                forEach(b->System.out.println(b.getNumberOfPages()));

        System.out.println("****************");
        Arrays.stream(books).
                sorted(Comparator.comparing(Book::getTitle)).
                forEach(b->System.out.println(b.getTitle()));

        //get list of all titles;
        List<String> titles = Arrays.stream(books).map(Book::getTitle).collect(Collectors.toList());

        //print them using forEach method;
        System.out.println("****************");
        titles.forEach(System.out::println);

        //get distinct list of all authors;
        System.out.println("****************");
        Arrays.stream(books).map(Book::getAuthors).flatMap(Collection::stream).distinct().forEach(System.out::println);

        //4. Use peek method for debugging intermediate
        //streams during execution the previous task
        System.out.println("*****************");
        Arrays.stream(books).map(Book::getAuthors).peek(System.out::println).flatMap(Collection::stream).distinct().forEach(System.out::println);

        //5. Use parallel stream with task #3.
        System.out.println("******************");
        Arrays.stream(books).parallel().filter(isBigBook).forEach(System.out::println);
        System.out.println("******************");
        Arrays.stream(books).parallel().filter(hasOneAuthor).forEach(System.out::println);
        System.out.println("******************");
        Arrays.stream(books).map(Book::getAuthors).flatMap(Collection::stream).distinct().parallel().forEach(System.out::println);

       //6. Use the Optional type for determining the title
       //of the biggest book of some author


    }
}
