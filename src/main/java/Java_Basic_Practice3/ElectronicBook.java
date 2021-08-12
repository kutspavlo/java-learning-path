package Java_Basic_Practice3;

import Java_Basic_Practice2.Person;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class ElectronicBook extends Book{

//    2. Create an ElectronicBook class as child of the Book class and then:
//    Add private fields: long sizeInBytes, String format;
//    Add getters and setters with validation for them;
//    Add new constructors which call super constructors;
//    Override methods from the task 1.e

    private long sizeInBytes;
    private String format;

    public void print(OutputStream outputStream) {
        if (outputStream.getClass() == FileOutputStream.class) {
           String text = "Chapter 2 of the book";
           byte [] buffer = text.getBytes();
           try  {
               outputStream.write(buffer);
           } catch (Exception e) { System.out.println(e.getStackTrace());
           }
        } else System.out.println(outputStream);

    }

    public ElectronicBook(String title, Person author, long sizeInBytes) {
        super(title, author);
        this.sizeInBytes = sizeInBytes;
    }

    public long getSizeInBytes() {
        return sizeInBytes;
    }

    @Override
    public void getAuthorCredentials() {
        System.out.println(this.getAuthor() + "home blala");
    }

    @Override
    public void getBookRanking() {
        System.out.println(this.getTitle() + " is the best book in our ranking");

    }

    @Override
    public boolean equals(Object obj){
        if (obj == this)
            return false;
        return true;
    }

    public String getFormat() {
        return format;
    }

    public void setSizeInBytes(long sizeInBytes) throws Exception {
        if (sizeInBytes < 0L) throw new Exception("Size could not be less than zero");
        this.sizeInBytes = sizeInBytes;
    }

    public void setFormat(String format) throws Exception {
        if (!format.equals("epub") && !format.equals("pb2") && !format.equals("pdf"))
            throw new Exception("Format should be in: 'epub', 'pb2' or'pdf'");
        this.format = format;
    }
}
