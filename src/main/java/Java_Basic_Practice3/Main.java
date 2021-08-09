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

    }
}
