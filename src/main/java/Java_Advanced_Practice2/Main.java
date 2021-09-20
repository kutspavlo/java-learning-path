package Java_Advanced_Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1. Create instances of ArrayList<Integer> and then
        ArrayList<Integer> myIntArrLost = new ArrayList<>();
        myIntArrLost.add(5);
        System.out.println(myIntArrLost.get(0));
        //myIntArrLost.add("rer"); - exception thrown

        //2. Create a generic class and use it
        GenericClass<String> gc = new GenericClass<>();
        List<String> list = Arrays.asList("one", "two", "three");
        gc.test(list);
//        GenericClass gci = new GenericClass();
//        gci.test(list);

        //3.Wild cards playground
        List<Creature> creatures = new ArrayList<>();
        creatures.add(new Creature("Giraffe"));
        creatures.add(new Creature("Dog"));
        creatures.add(new Creature("Pig"));

        testStrict(creatures);

        List<Monkey> monkeys = new ArrayList<>();
        monkeys.add(new Monkey("John"));
        monkeys.add(new Monkey("Jack"));
        monkeys.add(new Monkey("Jason"));

        System.out.println("****************");

        //testStrict(monkeys); //error
        testWildCard(monkeys);

        System.out.println("*****************");
        Test.Generic.eatTest(creatures);

        System.out.println("*****************");
        UniversalList<Creature> un = new UniversalList<>(creatures);
        un.test(creatures);

    }

    private static void testStrict(List<Creature> list) {
        for (Creature c: list) {
            c.eat();
        }
    }

    private static void testWildCard(List<? extends Creature> list) {
        for (Creature c: list) {
            c.eat();
        }
    }



}
