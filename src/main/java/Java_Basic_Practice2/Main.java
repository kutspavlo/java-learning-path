package Java_Basic_Practice2;

import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Files;
import java.util.*;

public class Main {

    public static void myMethod(Short num){
        System.out.println(num);
    }

    public static void main(String[] args) throws Exception {
        //1. Create several variables using wrapper classes Byte, Short, etc.
        //   Perform Autoboxing/unboxing for them
        Byte myByte = 5;
        Short myShort = 22;
        //unboxing example
        byte myByte1 = myByte;
        short myShort1 = myShort;
        Integer integ = new Integer(20);
        if (integ < 100) System.out.println("unboxing example");
        //autoboxing example
        short primitiveShort = 33;
        myMethod(primitiveShort);

        //2. Use BigInteger and BigDecimal classes.
        BigInteger myBigInt = new BigInteger("3434335435643435436543453456345354634563654");
        BigInteger myBigInt2 = new BigInteger("3165361241645615586723565674516753476153467");
        System.out.println(myBigInt.add(myBigInt2));

        BigDecimal myBigDec = new BigDecimal(23123132.34534958394583545305843);
        BigDecimal myBigDec2 = new BigDecimal(32434234.242344323482483423434234234234);
        System.out.println(myBigDec.multiply(myBigDec2));

        //3. Create several instances of following utility classes: Date, Calendar,
        //   File, InputStream, StringBuffer. Use different constructors.
        //   Run 5-10 method for each instance
        Date today = new Date();
        System.out.println("today is " + today);
        Date oneMore = new Date();
        System.out.println(today.equals(oneMore));
        Date anotherDate = (Date) today.clone();
        System.out.println(today.equals(anotherDate));
        System.out.println(today.before(oneMore));

        Calendar myCal = new GregorianCalendar(2020, 7, 15);
        Calendar myCalClone = (Calendar) myCal.clone();
        Calendar myCal2 = new GregorianCalendar(2019, 8, 15);
        System.out.println(myCal);
        Date dateFromCal = myCal.getTime();
        System.out.println(dateFromCal);
        System.out.println(myCal.getCalendarType());
        System.out.println(myCal.getFirstDayOfWeek());
        System.out.println(myCal.compareTo(myCal2));
        System.out.println(myCal.equals(myCal2));
        System.out.println(myCal.equals(myCalClone));

        File myFile = new File("src/main/java/Java_Basic_Practice2/my.txt");
        System.out.println(myFile.getAbsolutePath());
        System.out.println(myFile.canRead());
        System.out.println(myFile.canWrite());
        String myStr = new String("test test");
        Files.write(myFile.toPath(), myStr.getBytes());
        System.out.println(myFile.length());
        System.out.println(myFile.delete());

        Person pavlo = new Person("Pavlo", "Kuts", "1991-01-22");
        System.out.println(pavlo.getFullName());
        System.out.println(pavlo.getDob());
        System.out.println(pavlo.getAge());

        Person alex = new Person("Alex", "Dvor", "1999-07-07");
        Person sara = new Person("Sara", "Connor", "1956-08-15");

        Person[] guys = {pavlo, alex, sara};
        System.out.println(guys[0].getFullName() + "   " + guys[1].getFullName() + "   " + guys[2].getFullName());
        Arrays.sort(guys, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
        System.out.println(guys[0].getFullName() + "   " + guys[1].getFullName() + "   " + guys[2].getFullName());

        System.out.println(guys[0].getAge() + "   " + guys[1].getAge() + "   " + guys[2].getAge());
        Arrays.sort(guys, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() > o2.getAge())
                    return 1;
                else if (o1.getAge() == o2.getAge())
                    return 0;
                return -1;
            }
        });
        System.out.println(guys[0].getAge() + "   " + guys[1].getAge() + "   " + guys[2].getAge());
        System.out.println(pavlo.getId());
        pavlo.setBoss(alex);
        System.out.println(pavlo.getBoss().getFullName());

        pavlo.addToColleagues(alex);
        pavlo.addToColleagues(sara);

        System.out.print("My colleagues:  ");
        for (Person element : pavlo.getColleagues()) {
            System.out.print(element.getFullName() + "  ");
        }
        System.out.println();
        Person kate = new Person();
        kate.setFirstName("Kate");
        kate.setLastName("Johnson");
        System.out.println(kate.getFullName());
        System.out.println(Person.getTotalNumber());

        Person emptyOne = new Person();
        System.out.println(emptyOne.getFullName());
        System.out.println(emptyOne.getAge());

    }
}
