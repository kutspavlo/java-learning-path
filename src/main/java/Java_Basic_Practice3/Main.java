package Java_Basic_Practice3;

import Java_Basic_Practice2.Person;

public class Main {
    public static void main(String[] args) throws Exception {
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

        ElectronicBook eBook = new ElectronicBook("Man of War", hemingway, 45354436L);
        try {
            eBook.setSizeInBytes(5234234L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(eBook.getSizeInBytes());

        try {
            eBook.setFormat("pb2");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(eBook.getFormat());

        ElectronicBook eBook2;
        eBook2 = eBook;
        System.out.println(eBook.equals(eBook2)); // equals() method overriden in child class ElectronicBook;

    }

}
