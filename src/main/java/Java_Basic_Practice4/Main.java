package Java_Basic_Practice4;

import java.util.Scanner;

import static Java_Basic_Practice4.Color.RED;
import static Java_Basic_Practice4.Color.BLACK;

public class Main {

    public static void main(String[] args) {

//        1. Create an enum Color and then:
//        add following values: RED, GREEN, BLUE, WHITE, BLACK etc.;
//        print all the values;

        for (Color color : Color.values()) {
            System.out.println(color);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("********************");
        System.out.println("ENTER COLOR");
        String name = sc.nextLine();
        System.out.println(Color.valueOf(name));

        int index = sc.nextInt();
        System.out.println(Color.values()[index]);
        System.out.println(Color.values()[4] == Color.BLACK);
        System.out.println(Color.values()[3] == Color.values()[4]);

//        use static import for accessing the values;
        String myRedString = RED.toString();
        System.out.println(myRedString);
        System.out.println(Color.values()[4] == BLACK);

    }
}
