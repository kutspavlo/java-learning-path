package Java_Basic_Practice2;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void myMethod(Short num){
        System.out.println(num);
    }

    public static void main(String[] args) throws IOException {
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

        Person pavlo = new Person("Pavlo", "Kuts");
        System.out.println(pavlo.getFullName());
        pavlo.setDob(LocalDate.parse("1991-01-22"));
        System.out.println(pavlo.getDob());
        System.out.println(pavlo.getAge());


    }
}
