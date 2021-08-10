package Java_Basic_Practice3;

import Java_Basic_Practice2.Person;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();
        try {
            myBook.setIsbn("isbn223873");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(myBook.getIsbn());

        Person hemingway = new Person();

        Book anotherBook = new Book("Old man and sea", hemingway);
        System.out.println(anotherBook.getTitle());


        myBook.setTitle("Old man and sea");
        try {
            anotherBook.setIsbn("isbn223873");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(myBook.equals(anotherBook));

        System.out.println(anotherBook.hashCode());
        System.out.println(myBook.hashCode());
        myBook.setAuthor(hemingway);
        System.out.println(myBook);

        Book clone = (Book) myBook.clone();
        System.out.println(clone.getIsbn());
    }

}
