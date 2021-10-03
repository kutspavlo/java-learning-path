package Java_Advanced_Practice6;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //1. Create several instances of Runnable interface with different implementation
        Runnable ref = ()-> System.out.println("Runnable interface with lambda expression");
        Runnable ref2 = ()-> {
            System.out.println("New thread has been started");
            Thread newThread = new Thread(ref);
            newThread.start();
            System.out.println("One more thread has been started. NAME: " + newThread.getName());
        };

        new Thread(ref).start();
        new Thread(ref2).start();

        //Create an array of Persons;
        Person[] persons = new Person[5];
        persons[0] = new Person("Paul", 30);
        persons[1] = new Person("Julie", 19);
        persons[2] = new Person("Viktor", 25);
        persons[3] = new Person("Andrew", 45);
        persons[4] = new Person("Jessica", 40);

        //Create two instances of Comparator<Person> interface using lambda expressions: first one for
        //comparing by name, second one – by age;
        Comparator<Person> compareByName = (Person p1, Person p2)->p1.getName().compareTo(p2.getName());
        Comparator<Person> compareByAge = (Person p1, Person p2)->p1.getAge() - p2.getAge();

        //Then sort them using these comparators;
        //Use forEach method for printing information about all the persons. Use the method reference
        Arrays.sort(persons, compareByName);
        Arrays.asList(persons).forEach(Person::printInfo);
        System.out.println("**************");

        Arrays.sort(persons, compareByAge);
        Arrays.asList(persons).forEach(Person::printInfo);
    }

    //2.Create a Person class with name and age fields;
    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void printInfo() {
            System.out.println(this.getName() + " " + this.getAge());
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
        
    }
}
