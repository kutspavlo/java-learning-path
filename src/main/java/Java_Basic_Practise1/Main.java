package Java_Basic_Practise1;

public class Main {
    public static void main(String[] args) {

        //1. Create and initialize 8 variables – one for each primitive type.
        byte byteVar = 111;
        System.out.println(byteVar);
        short shortVar = 15300;
        System.out.println(shortVar);
        int intVar = 1000000;
        System.out.println(intVar);
        long longVar = 3123432433123123188L;
        System.out.println(longVar);
        float floatVar = 3.142344f;
        System.out.println(floatVar);
        double doubleVar = 222.1231231231242432432434d;
        System.out.println(doubleVar);
        boolean booleanVar = true;
        System.out.println(booleanVar);
        System.out.println("************************************");

        //Assign the variables to a variable with a different type.
        //Try both widening and narrowing conversion.
        int myInt = shortVar;
        System.out.println(myInt);
        float myFloat = byteVar;
        System.out.println(myFloat);
        //narrow casting + using constant
        final byte myNewByte = (byte) (intVar/10000);
        System.out.println(myNewByte);
        final float myNewFloat = (float) (doubleVar/2);
        System.out.println(myNewFloat);
        System.out.println("************************************");

        //2. Use arithmetic, increment/decrement, relational and boolean operators with the variables.
        int x = 5;
        int y = 15;
        int z = 20;
        boolean t = true;
        boolean f = false;

        int sum = x + y;
        System.out.println(sum);
        int ded = z - y;
        System.out.println(ded);
        int mult = x * y;
        System.out.println(mult);
        System.out.println(z%y);
        System.out.println(++x);
        System.out.println(2 + ++x);
        System.out.println(~x);
        System.out.println(!t);
        System.out.println(10<<2);
        System.out.println(x == y);
        System.out.println(x);
        System.out.println((x < y) && (z > 10000));
        System.out.println(!( t && f) || !f);

        //3. Use Math class methods with the variables
        int max = Math.max(99, y);
        System.out.println(max);
        double mathInt = Math.random();
        System.out.println("You're on " + Math.round(mathInt*100) + "% lucky today");
        double tang = Math.tan(0.785398);
        System.out.println(tang);
    }
}
